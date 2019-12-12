public class Number2 {
    public static void main(String[] args) {
//        {
//            int i, j, k = 8;
//            for (i = 0; i < 5; i++) {
//                for (j = 0; j < k; j++) {
//                    System.out.print("a");
//                }
//                k = k - 2;
//                for (j = 0; j <= i; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//        }


//       for(int row=1;row<=5;row++){
//           for(int col=4;col>=row;col--){
//               System.out.print("*");
//           }
//
//           for(int j=1;j<=row;j++){
//               System.out.print(j);
//           }
//
//           System.out.println();
//       }

       int a[]={5,6,9,2};
       int min=100000;
       for(int i=0;i<a.length;i++){
           if(a[i]<min){
               min=a[i];

           }

       }
        System.out.print(min);
    }

}
