package arraypackage;

public class LargeEleArray {
    public static void main(String[] args) {
        int arr[] = {10,40,38,78,30};
        int max =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
