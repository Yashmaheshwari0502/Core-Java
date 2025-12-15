
public class java_04_Matrix_multiplication {

    public static void main(String[] args) {

        // 1.
        // int a[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        // int b[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        // int c[][] = new int[3][3];

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // c[i][j] = a[i][j] + b[i][j];
        // }
        // }
        // for (int x[] : c) {
        // for (int y : x) {
        // System.out.print(y + " ");
        // }
        // System.out.println("");
        // }

        // 2.
        // int a[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        // int b[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
        // int c[][] = new int[3][3];

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // for(int k=0;k<3;k++){
        // c[i][j]+=a[i][k]*b[k][j];
        // }
        // }
        // }
        // for (int x[] : c) {
        // for (int y : x) {
        // System.out.print(y + " ");
        // }
        // System.out.println("");
        // }

        // 3.
        String arr[] = { "java", "python", "pascal" ,"ada"};
        java.util.Arrays.sort(arr);
        for (String x : arr) {

            System.out.print(x + " ");

            System.out.println("");
        }

    }
}