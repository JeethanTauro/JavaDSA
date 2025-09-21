package BinarySearchQuestions.SquareRoot;

class Naive {
    public int mySqrt(int x) {
        int sqrt = 1;
        if(x ==1 || x == 0){
            return x;
        }
        for(int i=1; i <= x/2 ; i++){
            long sq = (long) i * i;
            if( sq == x){
                return i;
            }
            else if(sq < x){
                sqrt = i;
            }
            else{
                break;
            }
        }
        return sqrt;
    }
}