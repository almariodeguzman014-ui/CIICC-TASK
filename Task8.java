public class Task8 {

    public static int sumWithCumulative(int... numbers) {
        int total = 0;

        for (int n : numbers) {
            int cumulative = n * (n + 1) / 2; 
            System.out.println("Parameter " + n + " => " + cumulative);
            total += cumulative;
        }

        return total;
    }

    public static void main(String[] args) {
        int result = sumWithCumulative(4, 5, 10);
        System.out.println("Total sum = " + result);
    }
}
