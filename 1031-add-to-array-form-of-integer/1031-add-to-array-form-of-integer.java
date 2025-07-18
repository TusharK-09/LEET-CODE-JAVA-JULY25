class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int p = num.length - 1;
        List<Integer> ans = new ArrayList<>();
        int carry = 0;
        while(k>0 || p >= 0){
            int numValue = 0;
            if(p >= 0){
                numValue = num[p];
            }
           int lastDigit = k % 10;
            int sum = numValue + lastDigit + carry;
           int  digit_ans = sum % 10;
            carry = sum / 10;
            ans.add(digit_ans);
             
            p--;
            k = k / 10;
        } 

        if(carry > 0){
            ans.add(carry);
        }

        Collections.reverse(ans);
        return ans;
     }
}