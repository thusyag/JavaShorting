public class tryShorting {

    public static void main(String[] args){
        int arr[]={4,2,5,8,9,0};
        int n = arr.length;
        int temp ;

        for(int i=0; i<n; i++){
           for(int j=0; j<n-1;j++ ){
                int k =j+1;
                if(arr[j]>arr[k]){
                    temp = arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;

                }
           }
        }
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
