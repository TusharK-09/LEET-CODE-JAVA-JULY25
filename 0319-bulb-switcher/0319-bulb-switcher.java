class Solution {
    public int bulbSwitch(int n) {
        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        };

        int count = 0;
        int i = 1;
        while(i * i <= n) {
            count++;
            i++;
        }
        return count;
    }
}