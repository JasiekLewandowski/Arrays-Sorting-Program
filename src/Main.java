import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj 5 liczb.");

        int[] array = getIntegers(7);
        printArray(array);
        printArray(sortIntegers(array));

    }
    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            Scanner skaner = new Scanner(System.in);
            array[i] = skaner.nextInt();
        }
        return array;
    }
    public static void printArray (int[] array){
        System.out.println("Your array is: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static int[] sortIntegers (int[] array){
        System.out.println("And I sorted it for you: ");
        int[] sortedArray = new int[array.length];

        for (int i = 0;i < array.length; i++){
            sortedArray[i] = array[i];
          }

        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i < array.length-1; i++){
                if (sortedArray[i] < sortedArray[i +1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
   }
}
