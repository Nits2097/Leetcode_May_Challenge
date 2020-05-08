class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length==2){
            return true;
        }
        float m,c;
        m = (float)(coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
        c = coordinates[1][1] - (m*coordinates[1][0]);
        float sum;
        for(int i=2;i<coordinates.length;i++){
            sum = coordinates[i][1] - (m*coordinates[i][0]);
            if(sum!=c){
                return false;
            }
        }
        return true;
    }
}