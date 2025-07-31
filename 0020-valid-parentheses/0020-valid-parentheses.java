class Solution {
    public boolean isValid(String s) {
        int prevLength;
        do {
            prevLength = s.length();
            s = s.replace("()", "")
                 .replace("[]", "")
                 .replace("{}", "");
        } while (s.length() != prevLength);
        
        return s.isEmpty();
    }
}
