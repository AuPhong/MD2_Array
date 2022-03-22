import java.util.Scanner;

public class TimKiemTrongMang {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e","f","g","h",};
        boolean check = false;
        System.out.println("Input value to search:");
        Scanner sc = new Scanner(System.in);
        String searchValue = sc.nextLine();
        for (int i=0; i<arr.length; i++){
            if (arr[i].equals(searchValue)){
                check = true;
                System.out.println(searchValue+" is at index "+(i+1));
                break;
            }
        }
        if (check==false){
            System.out.println("No value exist!");
        }
    }
}
