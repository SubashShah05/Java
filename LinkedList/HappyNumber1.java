class Solution {
    
 public int sumOfSquaresOfDigits(int n){
    int sum=0;
    //36 /10 ->3->0
    //dig -> 6   36%10=6
    //sum =45
    while(n > 0){
        int dig=n %10;
        sum =sum + (dig *dig);
        n = n/10;
    }
    return sum;
 }  


    public boolean isHappy(int n) {
        //slow,fast=n
        // function-sum of squares of digits
        int slow=n;
        int fast=n;

        while(fast !=1){
            slow =sumOfSquaresOfDigits(slow);
            fast=sumOfSquaresOfDigits(sumOfSquaresOfDigits(fast));

            if(fast == 1){
                return true;
            }
            if(slow==fast){
                return false;
            }
        }
        return true;
    }
}