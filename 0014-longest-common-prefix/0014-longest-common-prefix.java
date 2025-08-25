class Solution {
    public String longestCommonPrefix(String[] strs) {
        //most min length word
        String prefix = strs[0];
        for(int i=0; i<strs.length; i++){
            if(strs[i].length() < prefix.length()){
                prefix = strs[i];
            }
        }
        String result= "";
        for(int i=0; i<prefix.length(); i++){
                char currentChar = strs[0].charAt(i);
            for(int j=0; j<strs.length; j++){
                if(strs[j].charAt(i) != currentChar){
                    return result;
                }
            }
            result = result + currentChar;
        }
        return result;
    }
}