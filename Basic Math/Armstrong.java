public class Armstrong {
    public boolean isArmstrong(int n) {
        // Convert number to string to find the number of digits
        int digits = String.valueOf(n).length();
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; 
            sum += Math.pow(digit, digits); // raise digit to power of number of digits
            n /= 10;
        }

        return sum == original;
    }
}

