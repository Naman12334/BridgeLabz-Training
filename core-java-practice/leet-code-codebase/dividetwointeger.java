class Solution {
    public int divide(int dividend, int divisor) {
      
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

       
        int sign = (dividend>0) == (divisor>0) ? 1 : -1;

     
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
         
        long quotient = 0;

     
        while(absDividend >= absDivisor){
            long cnt = 0;
          
          while(absDividend >= (absDivisor << (cnt+1))){
            cnt++;
          }
          
          quotient += (1 << cnt);
          absDividend -= (absDivisor << (cnt));

        }
     return (int) (sign * quotient);
    }
}