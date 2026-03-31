class Solution {
    public boolean isPalindrome(int x) {
        int m=x;
        int h=0;
        int sum=0;
        while(m>0){
        h=m%10;
       sum=sum*10+h;
       m=m/10;
        }
       if(sum==x){
           return true;
       }

    
        
       return false; 
    }
}