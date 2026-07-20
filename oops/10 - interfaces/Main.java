interface Payment {

    void pay(double amount);

}

class UPI implements Payment {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }

}

class CreditCard implements Payment {

    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }

}

class Checkout {

    private Payment payment;

    Checkout(Payment payment) {
        this.payment = payment;
    }

    void checkout(double amount) {
        payment.pay(amount);
    }

}

public class Main {

    public static void main(String[] args) {

        Payment payment = new UPI();

        Checkout checkout = new Checkout(payment);

        checkout.checkout(1499);

    }

}
