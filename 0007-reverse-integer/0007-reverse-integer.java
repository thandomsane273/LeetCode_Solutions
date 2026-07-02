class Solution {
    public int reverse(int x) {
        

        String converted=String.valueOf(x);
        String all="";

        if(x<0) { //it starts with a negative
        	all=all+'-';
        	for(int i=converted.length()-1; i>0; i--){
                all=all+converted.charAt(i);
            }
        	
        }

        else {
        	for(int i=converted.length()-1; i>=0; i--){
                all=all+converted.charAt(i);
            }
        }
        	

            try{
                return Integer.parseInt(all);

            }
            catch(NumberFormatException e){
                return 0;
            }

    }  
}