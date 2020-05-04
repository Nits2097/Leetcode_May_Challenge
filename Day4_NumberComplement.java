class Solution {
    public int findComplement(int num) {
        String compl="";
        while(num!=0){
            compl=num%2+compl;
            num=num/2;
        }
        int ans=0;
        int n=0,temp;
        for(int c=compl.length()-1;c>=0;c--){
            if(compl.charAt(c)=='0'){
                temp = (int)(Math.pow(2,n));
                ans+=temp;
            }
            n++;
        }
        return ans;
    }
}