class Solution {
    public int lengthOfLastWord(String s) {
        String[] subs=s.split(" ");
        int length=subs[subs.length-1].length();
        return length;

    }
}