public class Main {
    public static void main(String[] args) {
        int[] number;
        number = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = number.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(number[i] + ", ");
            } else {
                System.out.println(number[i]);
            }
        }
    }
}