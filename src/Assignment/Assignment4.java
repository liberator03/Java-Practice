package Assignment;

public class Assignment4 {
    public static void main(String[] args) {
        int n = 16;
        for (int i = 1; i < n; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }

        }
    }
}
