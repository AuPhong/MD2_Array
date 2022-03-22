public class ReturnMinValue {
    public static int minValue(int[] arr){
        int min = arr[0];
        for (int i=0; i<arr.length; i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
int[] arr = {78097,2,4,8,4,-89,1,4};
        System.out.println("The min value of arr is "+ minValue(arr));
    }
}
