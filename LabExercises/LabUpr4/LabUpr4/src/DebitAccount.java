public class DebitAccount extends BankAccount {
    public DebitAccount(double amount, double interest) {
        super(amount, interest);
    }

    @Override
    public double pay() {
        double result = (getAmount() * (getInterest() * 0.01) + getAmount());
        return result;
    }
}
