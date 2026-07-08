public class HalfPyramid {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}

//in this pyramid the row number is equal to the ni of elements in coumn so the inner loop
//limit should be equal to outer loop which is i.
