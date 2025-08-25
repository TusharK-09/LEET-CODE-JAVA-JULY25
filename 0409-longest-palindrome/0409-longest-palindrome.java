class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
       
        for(char ch : s.toCharArray()){
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        int count  = 0;
        Boolean hasOdd = false;
        for(int freq  : map.values()){
            if(freq % 2 == 0){
                count = count + freq;
            }
            else{
                count = count + freq - 1;
                hasOdd = true;
            }
        }
        return hasOdd ? count + 1 : count;
    }
}