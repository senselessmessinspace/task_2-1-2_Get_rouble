public class Get_rouble {
    public static void main(String[] args) {
        int account = 100;
        int input_money = 1000;
        int account_add = input_money + account;
        int bonus;

        if (input_money > 1000) {
            bonus = (input_money)/100;
        } else {
            bonus = 0;
        }

        System.out.printf("Account money %d\n", account_add);
        System.out.printf("Bonus %d\n", bonus);
        
    }
}