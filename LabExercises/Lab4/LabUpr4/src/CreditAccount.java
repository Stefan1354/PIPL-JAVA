public class CreditAccount extends BankAccount {
    public CreditAccount(double amount, double interest, int months) {
        super(amount, interest);
        this.months = months;
    }

    private int months;

    private int getMonths() {
        return months;
    }

    public void setMonths() {
        this.months = months;
    }

    @Override
    public double pay() {
        double result = getAmount();
        for (int i = 0; i <= months; i++) {
            result = (result * (getInterest() * 0.01)) + result;
        }
        return result;
    }

}
