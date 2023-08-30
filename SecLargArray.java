package arraypackage;

public class SecLargArray {
    public static void main(String[] args) {


        int arr[] = {1, 8, 7, 9, 4, 0};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print(arr[arr.length-2]);



    }
}
