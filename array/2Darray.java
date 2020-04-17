package array;



class twoDarray{

    public static void main (final String[] args) {
        // int p[][]= new int [3][4];//[rows][columns]
        final int p[][] = {
             {5,6,7,3},
             {8,5,0,9},
             {7,4,1,2}
 };

        for(int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(p[i][j] + " ");
            }
            System.out.println("");
        }
    }
}