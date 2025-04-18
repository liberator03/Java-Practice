package Assignment;

public class Assignment5 {
    public static void greetByTime(String name,int hour){
        if (hour < 12) {
            System.out.println("Good Morning, "+name);
        } else if (hour < 17) {
            System.out.println("Good Afternoon, "+name);
        } else{
            System.out.println("Good Evening, "+name);
        }
    }

    public static void main(String[] args) {
        greetByTime("Mukund",15);
    }
}
