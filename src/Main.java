public class Main {
    public static void main(String[] args) {
        int capital = 100; // наш баланс
        int popolnenie = 100000; // сумма пополнения
        int bonus_capital = 0;  // количество бонусных рублей для начисления

        if (popolnenie > 1000) {
            bonus_capital = popolnenie / 100;
            System.out.println("Вы полполнили больше чем на 1000 рублей, вам зачислен бонусный капитал в размере: " + bonus_capital);
        }
        int summa = capital+bonus_capital+popolnenie;
        System.out.println("Итого средств на счету: " +summa);
    }
}