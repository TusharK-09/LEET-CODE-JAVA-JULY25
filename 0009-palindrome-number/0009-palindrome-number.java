class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }

        int temp = x;
        int resultNum = 0;

        while(temp>0){
            int lastDigit = temp % 10;
            resultNum =  resultNum * 10 + lastDigit;
            temp = temp / 10;
        }

        if(resultNum == x) {
            return true;
        }

        return false;
    }
}