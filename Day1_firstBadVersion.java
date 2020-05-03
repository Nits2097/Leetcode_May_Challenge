/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int beg = 0, end=n-1;
        int mid;
        while(beg<end){
            mid = beg + (end-beg)/2;
            if(!isBadVersion(mid+1)){
                beg=mid+1;
            }
            else{
                end=mid;
            }
        }
        return beg+1;
    }
}