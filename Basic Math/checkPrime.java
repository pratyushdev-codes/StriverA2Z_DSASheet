class checkPrime {
    public boolean isPrime(int n) {
        if (n <= 1) return false;   // 0, 1, and negatives are not prime
        if (n == 2) return true;    // 2 is prime
        if (n % 2 == 0) return false; // even numbers > 2 are not prime

        // check only odd divisors up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
