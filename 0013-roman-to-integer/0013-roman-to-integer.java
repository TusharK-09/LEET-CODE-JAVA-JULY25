class Solution {
    public int romanToInt(String s) {

        int firstValue = 0;
        int nextValue = 0;
        int result = 0;
       

        if(s.isEmpty()) return 0;

        for(int i=0; i<s.length(); i++){
          firstValue = getCharValue(s.charAt(i));
            nextValue = 0;
            if(i<s.length() - 1) {
                
                nextValue = getCharValue(s.charAt(i + 1));
                
            }

            if(firstValue < nextValue){
                result = result + (nextValue - firstValue);
                i++;
            }

            else {
                result = result + firstValue;
            }

           
        }
 return result;
 
       
    }

     public  static int getCharValue(char input){
        if(input  == 'I') return 1;
        if(input == 'V') return 5;
        if(input == 'X') return 10;
        if(input  ==  'L') return 50;
        if(input == 'C') return 100;
        if(input == 'D') return 500;
        if(input == 'M') return 1000;
        return 0;
        }

     

}