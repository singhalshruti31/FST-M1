package activities;

public class Activity4 {
    public static void main(String[] args){
        int[] arr = {10, 2, 45, 7, 54, 3, 90, 11};
        for(Integer n:arr)
        System.out.print("\t"+n);
        //sort(arr);
        ascendingSort(arr);
    }

    static void sort(int[] arr){
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>arr[i-1])
                arr[i+1] = arr[i];
            else if(arr[i]<arr[i-1])
                arr[i-1] = arr[i];
            else arr[i] = arr[i];
        }
        System.out.println();
        for(Integer n:arr)
            System.out.print("\t"+n);
    }

    static void ascendingSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
        System.out.println();
        for(Integer n:array)
            System.out.print("\t"+n);
    }
}
