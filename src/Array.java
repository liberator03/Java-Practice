public class Array {
    public static void main(String[] args) {
        String[] colors ={"Red","Green","Blue","Yellow"};

        for(int i = 0; i < colors.length; i++){
            System.out.println("Color "+ i + " : " + colors[i]);
        }

        for(String color : colors){
            System.out.println("Values : " + color);
        }


    }
}
