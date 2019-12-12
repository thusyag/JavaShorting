public class Number1 {

    public static void main (String[] args){
        for(int row=1;row<=4;row++){
            for(int col=4;col>=row;col--){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
