// PaymentProcessor.java
interface PaymentProcessor {
    void processPayment(double money);
}

// PayPal.java
class PayPal {
    public void sendPayment(double money) {
        System.out.println("Processing payment of $" + money + " through PayPal");
    }
}

// Stripe.java
class Stripe {
    public void makePayment(double money) {
        System.out.println("Processing payment of $" + money + " through Stripe");
    }
}

// PayPalAdapter.java
class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double money) {
        payPal.sendPayment(money);
    }
}

// StripeAdapter.java
public class AdapterPattern implements PaymentProcessor {
    private Stripe stripe;

    public AdapterPattern(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double money) {
        stripe.makePayment(money);
    }
}

// AdapterTest.java
class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        paypalProcessor.processPayment(200.0);

        PaymentProcessor stripeProcessor = new AdapterPattern(new Stripe());
        stripeProcessor.processPayment(400.0);
    }
}
