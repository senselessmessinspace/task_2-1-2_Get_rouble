public class RoubleForHundred {
    public static void main(String[] args) {
        int account = 100;
        int inputMoney = 1100;
        int accountAdd = inputMoney + account;
        int bonus;

        if (inputMoney > 1000) {
            bonus = (inputMoney)/100;
        } else {
            bonus = 0;
        }

        System.out.printf("Account money %d\n", accountAdd);
        System.out.printf("Bonus %d\n", bonus);
    }
}