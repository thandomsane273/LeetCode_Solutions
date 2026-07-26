class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer>correct=new ArrayList();

        Boolean is_all_9s=true;

        for(int i=0; i<digits.length; i++){
            if(digits[i] !=9){
                is_all_9s=false;
                break;
            }
        }

        

        //now we wanna have a thingy if all digits are 9's
        if(is_all_9s){
            digits[0]=1;
            for(int j=1; j<digits.length; j++){
                digits[j]=0;
            }

            for(int k=0; k<digits.length; k++){
                correct.add(digits[k]);
            }
            correct.add(0);

            int nums[]=new int[correct.size()];
            for(int i=0; i<correct.size(); i++){
                nums[i]=correct.get(i);
            }
            return nums;
        }

        else{
            for(int i=digits.length-1; i>=0; i--){
                if(digits[i]<9){
                    digits[i]++;
                    for(int j=i+1; j<digits.length; j++){
                        digits[j]=0;
                    }
                    break;
                }
                else{
                    continue;
                }
            }
            return digits;
        }

        
    }
}