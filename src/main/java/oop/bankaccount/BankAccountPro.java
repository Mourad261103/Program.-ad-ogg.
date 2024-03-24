package oop.bankaccount;

public class BankAccountPro extends AbstractBankAccount{
    public BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 1, 0.02);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public double withdraw(double amount) {
        return super.withdraw(amount);
    }

    @Override
    public String getiban() {
        return IBAN;
    }
}
