class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int [][] arr = new int[image.length][image[0].length];
        for(int i=0; i<image.length; i++){
            int n = image.length;
            int index = 0;
            for(int j=n-1; j>=0; j--){
                arr[i][index++] = image[i][j];
            }

        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0)
                arr[i][j]=1;
                else
                arr[i][j]=0;

            }

        }
        return arr;
    }
}
