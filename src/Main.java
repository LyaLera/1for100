public class Main {
    public static void main(String[] args) {
        int account = 100;
        int amount = 4100;
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int total = account + amount + bonus;
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счёт: " + total);
    }

}

