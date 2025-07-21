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

    public static void main(String[] args) {
        System.out.println("hello world");
    }

}
