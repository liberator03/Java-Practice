public class ArrayAnalysis {

    public static void printAll(int[] array){
        System.out.print("All Elements: ");
        for(int arr : array){
            System.out.print(arr + " ");
        }
        System.out.println();
    }

    public static void printEven(int[] array){
        System.out.print("Even Elements: ");
        for(int arr : array){
            if(arr % 2 == 0){
                System.out.print(arr + " ");
            }
        }
        System.out.println();
    }

    public static int findMax(int[] array){
        int max = array[0];
        for(int arr : array){
            if(arr > max){
                max = arr;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array1 = {12, 7, 21, 9, 18};

        printAll(array1);
        printEven(array1);
        int max = findMax(array1);
        System.out.println("Maximum Value: " + max);
    }
}
