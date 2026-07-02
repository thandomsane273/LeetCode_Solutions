class Solution {
    public boolean isPalindrome(int x) {
        String number=String.valueOf(x).trim();
        String[] comp=new String[number.length()];
        for(int i=0; i<number.length(); i++){
            comp[i]=String.valueOf(number.charAt(i));
        }

        
        boolean same=true;
        int start=0;
        int end=comp.length-1;

        while (end>start){
            if(!comp[start].equals(comp[end])){
                same=false;
                break;
            }
            else{
                start++;
                end--;
            }
        }
        return same;
    }    
}