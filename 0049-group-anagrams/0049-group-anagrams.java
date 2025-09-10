class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> anagramGroups = new HashMap<>();

        for(String word : strs){
            int[] charsCount = new int[26];

            //lets make array for a word
            for(char ch : word.toCharArray()){
                charsCount[ch - 'a']++;
            }

            //lets build unique key for a word by adding the redundation or keeping it unique
            StringBuilder freqKey = new StringBuilder();
            for(int i=0; i<26; i++){
                freqKey.append("#").append(charsCount[i]);
            }

            //convert freqKey back to string type
            String signature = freqKey.toString();

            anagramGroups.putIfAbsent(signature , new ArrayList<>());
            anagramGroups.get(signature).add(word);
        }
        return new ArrayList<>(anagramGroups.values());
    }
}