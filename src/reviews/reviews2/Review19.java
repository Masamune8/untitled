package reviews.reviews2;

public class Review19 {
    public static void main(String[] args) {
        int num = 5;
        int sum = 0;
        int factorial = sum;
        while (factorial <= num ) {
            sum *= factorial;
            sum += 1;
        }
        System.out.println("結果:" + factorial);
    }
}