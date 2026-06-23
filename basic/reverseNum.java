package basic;

public class reverseNum {

    public static int revNum(int num) {

        int rev = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        
        reverseNum obj = new reverseNum();
        
        int num = 54321;
        int result = reverseNum.revNum(num);
        
        System.out.println(result);
    }
}
