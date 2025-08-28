class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();

        for(String word :  strs){
            int [] count = new int [26];
            for(char ch : word.toCharArray()){
                count[ch - 'a']++;
            }

            //build key 
            StringBuilder keyBuilder = new StringBuilder();
            for(int i=0; i<26; i++){
                keyBuilder.append("#").append(count[i]);
            }

            //back to string convert
            String key = keyBuilder.toString();

            if(!map.containsKey(key)){
                map.put(key , new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}