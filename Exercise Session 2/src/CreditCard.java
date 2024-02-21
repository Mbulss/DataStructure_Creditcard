public class CreditCard {
    String customer;
    String bank;
    String account;

    public CreditCard(String customer, String bank, String account) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public static class CreditCards {
        double balance;

        public CreditCards(double balance) {
            this.balance = balance;
        }

        public boolean charge(double price) {
            if (price <= balance) {
                balance -= price;
                return true;
            } else {
                System.out.println("Insufficient balance");
                return false;
            }
        }

        public void makePayment(double amount) {
            balance += amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    public static class FERRE {
        int limit;
        double balance;

        public FERRE(int limit, double balance) {
            this.limit = limit;
            this.balance = balance;
        }

        public int getLimit() {
            return limit;
        }

        public double getBalance() {
            return balance;
        }
    }
}