package basic;

public class LeapYear {

    public String checkLeapYear(int year) {

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return year + " is a Leap Year";
        } else {
            return year + " is not a Leap Year";
        }
    }

    public static void main(String[] args) {
        
        LeapYear leapYear = new LeapYear();
        int year = 2003;

        String result = leapYear.checkLeapYear(year);
        System.out.println(result);
    }
}
