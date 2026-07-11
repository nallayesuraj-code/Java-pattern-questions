public class InvertedHalfPyramid180 {
    public static void main(String[] args) {
        //outer loop - rows
        for(int i = 1; i<=4; i++){
            //inner loop for spaces
            //for n rows it has n-i spaces in each row i
            for(int j = 1; j<=4-i; j++){
                System.out.print(" ");
            }
            //another inner loop for *
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
