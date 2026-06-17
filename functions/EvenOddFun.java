package functions;

public class EvenOddFun {

    void checkNum(int num) {
        if(num % 2 == 0)
        {
            System.out.println(num + " is an EVEN number");
        }
        else {
            System.out.println(num + " is an ODD number");
        }
    }

    public static void main(String[] args) {
        EvenOddFun obj = new EvenOddFun();
        obj.checkNum(70);
        obj.checkNum(128);
    }

}
