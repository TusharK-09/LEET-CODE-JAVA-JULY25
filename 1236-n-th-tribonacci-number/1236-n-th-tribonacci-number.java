class Solution {
    public int tribonacci(int n) {
       //Edge cases given or base cases
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }

        int a = 0;
        int b = 1;
        int c = 1;
        int next = 0;
        for(int i=2; i<n; i++){
            next = a + b + c;
            a = b;
            b = c;
            c = next;
        }

        return next;
    }
}