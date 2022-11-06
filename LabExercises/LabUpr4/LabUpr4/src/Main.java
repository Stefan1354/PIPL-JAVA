public class Main {
    public static void main(String[] args) {
        Payable[] payables = new Payable[3];
        payables[0] = new CreditAccount(100, 10, 3);
        payables[1] = new DebitAccount(100, 10);
        payables[2] = new CreditAccount(200, 10, 3);

        for (int i = 0; i < payables.length; i++) {
            System.out.println("The sum you owe to bank is: " + payables[i].pay());
        }
    }
}