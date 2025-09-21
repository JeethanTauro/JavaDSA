package LeetcodePracticingRevising.Leetcode76;

import java.util.HashMap;

class Optimised {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        HashMap<Character, Integer> map = new HashMap<>();

        // Build frequency map of t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int i = 0, j = 0;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int required = map.size(); // how many chars are still required

        while (j < s.length()) {
            char endChar = s.charAt(j);

            if (map.containsKey(endChar)) {
                map.put(endChar, map.get(endChar) - 1);
                if (map.get(endChar) == 0) {
                    required--; // satisfied one character
                }
            }
            j++;

            // Try to shrink the window from the left
            while (required == 0) {
                if (j - i < minLength) {
                    minLength = j - i;
                    start = i;
                }

                char startChar = s.charAt(i);
                if (map.containsKey(startChar)) {
                    map.put(startChar, map.get(startChar) + 1);
                    if (map.get(startChar) > 0) {
                        required++; // this char is now missing again
                    }
                }
                i++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);


    }
}
/*
# Explanation of the code (detailed, step-by-step)

You have a correct and typical **sliding-window + frequency map** solution for *Minimum Window Substring*. I’ll explain what each part does, the invariants the algorithm maintains, why it works, and then walk a full example and give complexity and edge-case notes.

---

## 1) High-level idea

* Build a frequency map `map` for all characters required by `t`.
* Expand a right pointer `j` over `s` until the current window `[i, j)` contains all required characters with required multiplicities.
* Once the window is valid, try to **shrink it from the left** (`i`) to find the smallest valid window that still contains all characters of `t`.
* Keep track of the smallest window seen and return the substring.

---

## 2) Key variables and their meanings

* `HashMap<Character,Integer> map`
  Frequency of each character in `t`. Positive value means we still need that many of the character; zero or negative means current window has satisfied (or exceeded) that character’s requirement.

* `int i = 0` — left index of current window (inclusive).

* `int j = 0` — right index of current window (exclusive). The window is `s.substring(i, j)`.

* `int minLength = Integer.MAX_VALUE` — length of smallest valid window found so far.

* `int start = 0` — left index of the best (smallest) window found so far.

* `int required = map.size()` — number of *unique characters* from `t` that still need to be fully satisfied in the current window. When `required` becomes `0`, the current window is valid (it contains every unique char from `t` in at least the required count).

---

## 3) How the code works (walkthrough of main loop)

### Build the map

```java
for (char c : t.toCharArray()) {
    map.put(c, map.getOrDefault(c, 0) + 1);
}
```

* E.g. for `t = "AABC"`, map = `{A:2, B:1, C:1}`, `required = 3` (three unique keys: A, B, C).

### Outer loop: expand window by moving `j`

```java
while (j < s.length()) {
    char endChar = s.charAt(j);
    if (map.containsKey(endChar)) {
        map.put(endChar, map.get(endChar) - 1);
        if (map.get(endChar) == 0) required--;
    }
    j++;
```

* For each `endChar` in `s`, if it is one of the characters we care about, decrement its required count in `map`.
* When a character’s count reaches **exactly 0**, that character’s requirement has just been fully met → decrement `required`.
* If the count becomes negative, it means the window has more occurrences than required; `required` is not changed.

At this point the window is `[i, j)`.

### Inner loop: shrink window while it is valid (`required == 0`)

```java
while (required == 0) {
    if (j - i < minLength) {
        minLength = j - i;
        start = i;
    }

    char startChar = s.charAt(i);
    if (map.containsKey(startChar)) {
        map.put(startChar, map.get(startChar) + 1);
        if (map.get(startChar) > 0) required++;
    }
    i++;
}
```

* As long as all unique requirements are satisfied (`required == 0`), we can try to shrink the window from the left to possibly find a smaller valid window.
* Update `minLength` and `start` when you see a smaller window.
* Then remove `startChar` from the window by incrementing its count in the `map`. If its count becomes **positive**, it means now the window lacks that char (we made it insufficient), so increment `required` to mark the window invalid again.
* Move `i` forward and continue (if window still valid we may keep shrinking; otherwise we exit the inner loop and continue expanding with `j`).

### End

After the loops:

```java
return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
```

* If `minLength` was never updated, return `""` (no valid window).
* Otherwise return the substring starting at `start` with length `minLength`. Note: `j` is exclusive so `j-i` is the window length correctly.

---

## 4) Why `required` and the `map` logic works

* `map` stores *remaining needed counts* for each char in `t`. Initially positive.
* When you see a char in `s` that appears in `t`, you decrement the count: either it becomes `>0` (still need more), `==0` (just satisfied) or `<0` (extra occurrences).
* `required` counts the number of distinct characters whose (remaining) count is still > 0. When `required` hits `0` → every character’s remaining count is `<= 0` → the window contains every char in `t` at least as many times as required.
* Shrinking increments the relevant map counts; if any becomes `>0` then the window no longer satisfies that character and `required` increases.

This avoids re-checking all character counts every time and lets us know validity with the single integer `required`.

---

## 5) Full dry run (short) — `s = "ADOBECODEBANC"`, `t = "ABC"`

Initial map: `{A:1, B:1, C:1}`, `required = 3`.

* Expand `j` over `s`:

  * `A` → map `{A:0, B:1, C:1}`, `required` becomes 2.
  * `D` → not in map.
  * `O` → not in map.
  * `B` → map `{A:0, B:0, C:1}`, `required` becomes 1.
  * `E` → not in map.
  * `C` → map `{A:0, B:0, C:0}`, `required` becomes 0.
* Now `required == 0` and window `[i=0, j=6)` = `"ADOBEC"` is valid; shrink:

  * Try to shrink while maintaining validity. Move `i` forward until removing a char from `map` causes `required` to become > 0.
  * After shrinking optimally you might get window `"BEC"` or `"OBEC"` depending on counts — algorithm tests each valid shrink and keeps the smallest seen.
* Continue expanding and repeating shrink → ultimately the smallest valid substring found is `"BANC"`.

(You can log `i, j, map, required` at each step to see exact transitions.)

---

## 6) Complexity

* **Time:** O(|s| + |t|) amortized. Each character in `s` is visited at most twice (once when `j` advances, once when `i` advances). Map ops are O(1) on average.
* **Space:** O(k) where `k` is number of distinct characters in `t` (size of `map`). If you consider the alphabet, worst-case O(min(|t|, |alphabet|)). Additional O(1) for pointers/ints.

---

## 7) Edge cases and notes

* If `t` contains duplicates (e.g., `"AAB"`), the map will store the needed multiplicity (`A:2`), and `required = map.size()` remains the count of *unique* characters (here 2). The algorithm only decrements `required` when a character’s count reaches 0 (after seeing enough of that char).
* If `t` is longer than `s`, you will never reach `required == 0` → return `""`.
* The code is case-sensitive (characters `'A'` and `'a'` are different).
* The code lacks a `null` check; if you want to be defensive, check `if (s == null || t == null) return "";`.
* Micro optimization: for ASCII input you could use an `int[128]` instead of `HashMap` for slightly faster lookups.

---

## 8) Common pitfalls to watch for

* Off-by-one errors: this code uses `[i, j)` convention and `j - i` for window length; `j` is incremented immediately after processing `s.charAt(j)` so the current window length is `j - i`.
* Using `map.size()` for `required`: correct because `required` counts unique characters. Don’t confuse `required` with total number of characters (with multiplicity).
* When updating `map` during shrinking, always check `map.containsKey(startChar)` before changing the map to avoid adding irrelevant keys.

---

If you want, I can now:

* produce a **line-by-line commented version** of the exact code, or
* show a **detailed table** logging `i, j, map, required, currentWindow` for the example `"ADOBECODEBANC", "ABC"`. Which would you prefer?












 */
