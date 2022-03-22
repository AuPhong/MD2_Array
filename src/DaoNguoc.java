import java.util.Scanner;

public class DaoNguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Insert array's size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size is not exceed 20");
            }
        } while (size > 20);

        arr = new int[size];
        System.out.println("Insert array's element: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Insert element " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Show origin array: ");
        for (int element : arr) {
            System.out.println(element);
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-1] = temp;
        }
        System.out.println("Show reversed array: ");
        for (int element:
             arr) {
            System.out.println(element);
        }
    }
}
