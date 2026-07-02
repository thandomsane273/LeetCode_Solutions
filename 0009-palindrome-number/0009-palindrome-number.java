class Solution {
    public boolean isPalindrome(int x) {
        String number=String.valueOf(x).trim();
        int start=0;
        int end=number.length()-1;
        if(x<0){
            return false;
        }
        else{
            while (end>start){
            if(number.charAt(start) != number.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;

        }
        
    }    
}