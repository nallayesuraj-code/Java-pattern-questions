public class InvertedHalfPyramidNumbers {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            //if no of rows is n then n-i+1 is the condition in the inner loop 
            //because if n=5 and i=1 we want 5 coluums in row 1 so 5-1+1 = 5 
            for(int j = 1; j <= 5-i+1; j++){
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
