class Solution {
    public int bulbSwitch(int n) {
        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        };
        //Any perfect square under n will be on as they have odd mulitples so they will be toggled odd times
        int count = 0;
        int i = 1;
        while(i * i <= n) {
            count++;
            i++;
        }
        return count;
    }
}