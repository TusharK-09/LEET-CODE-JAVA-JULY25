import java.util.HashMap;
import java.util.Map;
class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer , Integer> freqElement =  new HashMap<>();

        //storing arr in HashMap
        for(int elem : arr){
            freqElement.put(elem , freqElement.getOrDefault(elem,0) + 1);
        }

        //counting max frequency element
        int frequency = 0;
        int number = -1;
        int luckyNumber = -1;
        for(Map.Entry<Integer , Integer> e : freqElement.entrySet()){
                number = e.getKey();
                frequency =  e.getValue();

                if(number == frequency){
                    luckyNumber = number;
                }

        }

        return luckyNumber;

    }
}