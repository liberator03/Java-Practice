
public class First {
    public static void main(String[] args) {
        String name = "Mukund";
        int age = 21;
        int height = 163;
        int weight = 60;
        char grade ='A';
        double temperature = 98.6;

        int addition = age + height;
        int average = (age + height + weight) / 3;


        boolean isTeenager = (age >= 13 && age <= 19);
        boolean isGreater = (age > 18);

        System.out.println("Name : " + name);
        System.out.println("age : " + age);
        System.out.println("height : " + height + "cm");
        System.out.println("weight : " + weight + "kg");
        System.out.println("grade : " + grade);
        System.out.println("temperature : "+ temperature + "F");
        System.out.println("Addition of age and height : " + addition);
        System.out.println("Age is greater than 18 : " + isGreater);
        System.out.println("Average : " + average);
        System.out.println("is Teenager : " + isTeenager);





    }
}
