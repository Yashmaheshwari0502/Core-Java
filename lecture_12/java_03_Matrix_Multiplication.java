
public class java_03_Matrix_Multiplication {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int c[][]=new int[a[0].length][b.length];
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                     c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }

        for(int x[]:c){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
