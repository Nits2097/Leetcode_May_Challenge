class Solution {
    public int numJewelsInStones(String J, String S) {
        int ans=0;
        for (char c: S.toCharArray()){
            if(J.indexOf(c)!=-1){
                ans++;
            }
        }
        return ans;
    }
}