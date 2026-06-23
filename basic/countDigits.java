package basic;

public class countDigits {

    public int digitCount(int num) {

        int count = 0;

        while(num>0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {

        countDigits object = new countDigits();

        int num = 123456789;
        int result = object.digitCount(num);

        System.out.println("Number of digits: " + result);
    }
}

