public class ArrayTest {
    public static void main(String[] args) {
        MyTools myTools = new MyTools();
        int[] arr = {4, 6, 52, 2, 7, 9};
        myTools.bubble(arr);
        System.out.println("---------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
class MyTools {
    public void bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
