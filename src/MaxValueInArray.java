import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        int max = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input size:");
            size = sc.nextInt();
            if (size>20){
                System.out.println("Size is not exceed 20");
            }
        }while (size>20);

        System.out.println("Input elements: ");
        arr = new int[size];
        for (int i=0; i<size; i++){
            System.out.println("Input element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        for (int i=0; i<arr.length; i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max value in this array: "+ max);
    }
}
