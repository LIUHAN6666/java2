public class Test3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + (i * j));
                if (j < i) {
                    System.out.print("\t");
                }
            }
            System.out.println(); // 打印完一行后换行
        }
    }
}






