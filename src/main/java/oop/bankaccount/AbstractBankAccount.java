package oop.bankaccount;

abstract public class AbstractBankAccount implements BankAccount{
String IBAN;
double balance;
double operationFee;
double interestRate;

    public AbstractBankAccount(String IBAN, double balance, double operationFee, double interestRate) {
        BankAccount.checkIBAN(IBAN);
        setIBAN(IBAN);
        setOperationFee(operationFee);
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public String getIBAN() {
        return IBAN;
    }

    @Override
    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getOperationFee() {
        return operationFee;
    }

    @Override
    public void setOperationFee(double operationFee) {
        if (operationFee < 0.0) {
            throw new IllegalArgumentException("Invalid negative fee");
        }
        this.operationFee = operationFee;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void deposit(double amount)
    {
        balance+=amount;
        applyFee();
    }
    public double withdraw(double amount)
    {
       return balance-=amount+operationFee;
    }
    public double transfer(BankAccount other, double amount)
    {
        withdraw(amount);
        other.deposit(amount);
       return amount;
    }
   public void addInterest()
    {
        balance += balance * interestRate;
    }
    public void applyFee()
    {
        balance -= operationFee;
    }


}
