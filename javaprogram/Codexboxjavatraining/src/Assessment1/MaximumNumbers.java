package Assessment1;

public class MaximumNumbers {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 27, 32, 54};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
            max = arr[i];
                if (arr[i] < min)
                min = arr[i];
            }
            System.out.println("largest number :" + max);
            System.out.println("smallest number:" + min);
        }
    }
