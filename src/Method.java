public class Method {
    public static void greetUser(){
        System.out.println("Welcome to Java World!");
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static void printEven(int n){
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        greetUser();
        int result = multiply(3,4);
        System.out.println("Result : "+ result);
        printEven(10);
    }
}
