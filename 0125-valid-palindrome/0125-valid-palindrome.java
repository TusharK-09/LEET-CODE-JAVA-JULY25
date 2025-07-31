class Solution {
    public boolean isPalindrome(String s) {
       
        String filtered = s.toLowerCase().replaceAll("[^a-z0-9]", "");

     
        String reversed = new StringBuilder(filtered).reverse().toString();

        return filtered.equals(reversed);
    }
}