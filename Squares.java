
public class Squares {
    public static void main(String[] args) {
        int[] numbers = {1, 7, -3, 14, 19, 0, 2, -8, 6, 11, 3};
        int max = numbers[0];
        int least = numbers[0];

        for (int i = 0; i < ((numbers.length - 1)); i++) {
            if (numbers[i] > max)
                max = numbers[i];

            if (numbers[i] <least){
                least = numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(least);
    }


}