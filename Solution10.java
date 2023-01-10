public class Solution10 {
    public static void main(String[] args) {
        int[][] arr=new int [4][4];
        int row, column;
        int ran=0;

        while (ran<10) {
            row = (int) (Math.random() * 4);
            column = (int) (Math.random() * 4);
            if (arr[row][column] == 0) {
                arr[row][column] = (int) (Math.random() * 10 + 1);
                ran++;
            }
        }
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr[i].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();}
    }
}



