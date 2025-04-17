public class Flow {
    public static void main(String[] args) {
//        if else loop

        int score = 80;
        if (score >= 90){
            System.out.println("Excellent");
        } else if (score >= 75) {
            System.out.println("Good");
        } else{
            System.out.println("Needs Improvement");
        }

//        for loop

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//        while loop

        int j = 2;
        while (j <= 10){
            if(j%2 == 0){
                System.out.println(j);
            }
            j++;
        }

//        switch case

        int dayNumber = 3;
        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }
    }
}
