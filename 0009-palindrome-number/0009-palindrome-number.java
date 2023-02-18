class Solution {
    public boolean isPalindrome(int x) {
         int rev=x;
        int sum=0;
        while(x>0){
            int rem= x%10;
            sum=sum*10+rem;
            x=x/10;
        }
        return sum==rev;
    }
}