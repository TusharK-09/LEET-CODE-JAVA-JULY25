class Solution {
    public String longestCommonPrefix(String[] strs) {
        //Selecting one Word to Compare
        String prefix = strs[0];
        for(int i=0; i<strs.length; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0,prefix.length() - 1);
            }
        }

        return prefix;
    }
}