package activities;

public class Activity2 {

    public static void main(String[] args){
        int[] arr = {10, 77, 10, 54, -11, 10};
        for(Integer a : arr)
            System.out.println("Array value :: "+a);

        System.out.println(calculate(arr));
    }

    private static boolean calculate(int[] arr) {
        int sum = 0;
        for(Integer a : arr){
            if(a == 10){
                sum = sum+a;
            }
            if(sum > 30)
                break;
        }
        return sum == 30;
    }
}
