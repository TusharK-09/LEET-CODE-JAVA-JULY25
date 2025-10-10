class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> anagramGroups = new HashMap<>();

        for(String word  : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String sortedKey = new String (chars);
            anagramGroups.putIfAbsent(sortedKey , new ArrayList<>());
            anagramGroups.get(sortedKey).add(word);
        }

        return new ArrayList<>(anagramGroups.values());
    }
}