package ai.noname.intel.numbers;

public class CountNoOfPrimes {

    public int countNumberOfPrimesBF(int n) {
        int count = 1;
        boolean isPrime = false;
        if(n<0 || n>5000000)
            return 0;
        if (n == 0 || n == 1 ||n==2)
            return 0;
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else
                    isPrime = true;
            }
            if (isPrime)
                count++;
        }
        return count;
    }

    public int countNumberOfPrimes(int n) {
        int count = 2;
        if(n<0 || n>5000000)
            return 0;
        if (n == 0 || n == 1 ||n==2)
            return 0;
        for (int i = 1; i < n ; i++) {
            if (isPrime(i))
                count++;
        }
        return count;
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }



    public static void main(String[] args) {
        CountNoOfPrimes countNoOfPrimes = new CountNoOfPrimes();
        System.out.println("Number Of Prime Number::" + countNoOfPrimes.countNumberOfPrimes(499979));
    }
}
