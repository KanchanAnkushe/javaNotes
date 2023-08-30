package arraypackage;

public class SubSetArray {
    public static void main(String[] args) {

                int[] arr = {1, 2, 3};
                int n = arr.length;

                // Find the total number of subsets
                int totalSubsets = (int) Math.pow(2, n);

                // Generate all subsets
                for (int i = 0; i < totalSubsets; i++) {
                    for (int j = 0; j < n; j++) {
                        // Check if jth bit of i is set
                        if ((i & (1 << j)) != 0) {
                            System.out.print(arr[j] + " ");
                        }
                    }
                    System.out.println();
                }
            }
        }


