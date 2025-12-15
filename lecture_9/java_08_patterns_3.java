public class java_08_patterns_3 {
    public static void main(String[] args) {
        
        // 1.
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=5;k>=i;k--){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // 2.
        // for(int i=1;i<=5;i++){
        //     for(int j=5;j>i;j--){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // 3.

        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=7;k>=(2*i)-1;k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
