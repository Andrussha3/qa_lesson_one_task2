public class Main {
    public static void main(String[] args) {
        int balance = 100; // наш баланс
        int deposit = 100000; // сумма пополнения
        int bonusBalance = 0;  // количество бонусных рублей для начисления

        if (deposit > 1000) {
            bonusBalance = deposit / 100;
            System.out.println("Вы полполнили больше чем на 1000 рублей, вам зачислены бонусные рубли в размере: " + bonusBalance);
        }
        int summa = balance + bonusBalance + deposit;
        System.out.println("Итого средств на счету: " + summa);
    }
}
