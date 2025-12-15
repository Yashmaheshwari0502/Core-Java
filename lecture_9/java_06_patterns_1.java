
public class java_06_patterns_1 {

    public static void main(String[] args) {

        // 1.
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");
        // }

        // 2.
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println("");
        // }

        // // 3.
        // for(int i=1;i<=5;i++){
        //     int v=i+1;
        //     for(int j=1;j<=5;j++){
        //         System.out.print(v+" ");
        //         v=v+1;
        //     }
        //     System.out.println("");
        // }

        // 4.
        int v=1;
        for(int i=1;i<=5;i++){
            
            for(int j=1;j<=5;j++){
                System.out.format("%02d ",v);
                v=v+1;
            }
            System.out.println("");
        }

    }
}