public class SimplePaySys {

    public static abstract class PaymentMethod{
        private String name;

        public PaymentMethod(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public abstract void pay(double amount);
    }

    public static class CreditCard extends PaymentMethod{

        public CreditCard(String name){
            super(name);
        }

        @Override
        public void pay(double amount){
            System.out.println("Paid "+ amount+ " using Credit Card: "+ getName());
        }

    }

    public static class Cash extends PaymentMethod{

        public Cash(String name){
            super(name);
        }

        @Override
        public void pay(double amount){
            System.out.println("Paid "+ amount+ " using Cash: "+ getName());
        }
    }

    public static void main(String[] args) {

        PaymentMethod card = new CreditCard("Visa");
        PaymentMethod realcash = new Cash("Wallet");


        card.pay(55.0);
        realcash.pay(10.0);



    }

}
