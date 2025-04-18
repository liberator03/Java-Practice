public class Calculator {
    public static void add(int a, int b){
        int result = a+b;
        System.out.println(result);
    }
    public static void subtract(int a, int b){
        int result = a-b;
        System.out.println(result);
    }
    public static void multiply(int a, int b){
        int result = a*b;
        System.out.println(result);
    }
    public static void divide(double a, double b){
        double result = a/b;
        if(a==0 || b==0){
            System.out.println("Invalid");
        } else {
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        add(3,4);
        subtract(3,4);
        multiply(3,4);
        divide(3,4);

    }
}
