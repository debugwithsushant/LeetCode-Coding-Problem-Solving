// 50. Pow(x, n)

public class Day8 {
    public double myPow(double x, int n) {
        double result = 1;

        if (n == 0) {
            return result;
        }

        if (n < 0) {
            x = 1 / x;
            n = -n;
        }

        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Day8 day8 = new Day8();

        double x = 2.0;
        int n = 10;

        double result = day8.myPow(x, n);
        
        System.out.println(result); // Output: 1024.0
    }
}
