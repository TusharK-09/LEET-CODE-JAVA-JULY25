class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer , Integer> freqMap = new HashMap<>();

        //frequency map
        for(int val : nums){
            freqMap.put(val , freqMap.getOrDefault(val , 0)+1);
        }

        //sorting
        List<Map.Entry <Integer , Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        //get top k
        int[] topKElements = new int[k];
        for(int i=0; i<k; i++){
            topKElements[i] = list.get(i).getKey();
        }

        return topKElements;
    }
}