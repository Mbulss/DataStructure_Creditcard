
public class Main {
    public static void main(String[] args) {
        CreditCard project = new CreditCard("Brandon 17 Yo", "Yamin Bank", "999999");
        System.out.println("Customer: " + project.getCustomer());
        System.out.println("Bank: " + project.getBank());
        System.out.println("Account: " + project.getAccount());

        CreditCard.CreditCards card = new CreditCard.CreditCards(500);
        System.out.println("Initial balance: " + card.getBalance());
        card.charge(300);
        System.out.println("Balance after charge: " + card.getBalance());
        card.makePayment(200);
        System.out.println("Balance after payment: " + card.getBalance());

        CreditCard.FERRE ferre = new CreditCard.FERRE(35, 7.0);
        System.out.println("Limit: " + ferre.getLimit());
        System.out.println("Balance: " + ferre.getBalance());
    }
}