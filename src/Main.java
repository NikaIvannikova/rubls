public class Main {
    public static void main (String[] args) {
        int x = 100;
        int accountBill = 2_000;
        int bonus = 1;
if (accountBill >= 1000) {bonus = 10;}
if (x >= 100) {bonus = 1;}

        int total = (accountBill / x * bonus);
        System.out.println(total);
        }
}
