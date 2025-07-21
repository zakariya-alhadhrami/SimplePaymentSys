public class SimplePaySys {

    public abstract class PaymentMethod{
        private String name;

        public PaymentMethod(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }
        public abstract void pay(double amount);
    }

    public class CreditCard extends PaymentMethod{

        public CreditCard(String name){
            super(name);
        }

        @Override
        public void pay(double amount){
            System.out.println("Paid"+ amount+ "using Credit Card: "+ getName());
        }

    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }

}
