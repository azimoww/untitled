package untitled.first_lessons;


public class SumMass {
    public static void main(String[] args) {
        // 3x2 массив
        int[][] table = {
                {10, 20},
                {40, 60},
                {100, 120}
        };

        int sum1 = table[0][0] + table[0][1];
        int sum2 = table[1][0] + table[1][1];
        int sum3 = table[2][0] + table[2][1];
        int sum4 = table[3][0] + table[3][1];
        int sum5 = table[4][0] + table[4][1];


        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
        System.out.println("Sum 4: " + sum4);
        System.out.println("Sum 5: " + sum5);
    }
}
