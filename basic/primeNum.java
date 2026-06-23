package basic;

public class primeNum {

    public String checkPrime(int n) {
        int count = 0;

        for(int i=1; i<=n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if(count == 2) {
            return n + " is a Prime Number";
        } else {
            return n + " is a not a Prime Number";
        }
    }

    public static void main(String[] args) {
        primeNum obj = new primeNum();
        int num = 6; // which is not a prime number
        System.out.println(obj.checkPrime(num));
    }
}
