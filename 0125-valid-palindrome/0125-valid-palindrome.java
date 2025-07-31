class Solution {
    public boolean isPalindrome(String s) {
        // 1. Convert to lowercase FIRST.
        // 2. Then, remove all non-alphanumeric characters.
        String filtered = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // 3. Create the reversed version.
        String reversed = new StringBuilder(filtered).reverse().toString();

        // 4. Compare them.
        return filtered.equals(reversed);
    }
}