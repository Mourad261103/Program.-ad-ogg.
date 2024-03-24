package oop.bankaccount;

public class BankAccountEasy extends AbstractBankAccount{
    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0.0,0.0);
    }

    @Override
    public String getiban() {
        return IBAN;
    }




    @Override
    public double withdraw(double amount) {
        if (balance-amount<0) {
            double bil= balance;
            super.withdraw(balance);
            return bil;
        }
        return super.withdraw(amount);
    }

    @Override

    public double transfer(BankAccount other, double amount) {
        int first=Character.compare(other.getiban().charAt(0),'I');
        int second=Character.compare(other.getiban().charAt(1),'T');
        if(first!=0&&second!=0)
        {
            throw new IllegalArgumentException("not allowed in this account");
        }
        double allowed_ammount=withdraw(amount);
        other.setBalance(other.getBalance()+allowed_ammount);
        return allowed_ammount;
    }


}
