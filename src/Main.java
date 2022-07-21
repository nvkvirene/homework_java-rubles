public class Main {
    public static void main(String[] args) {

        int balance = 330;
        int replenishmentAmount = 1_369;

        int bonus;
        if (replenishmentAmount >= 1_100) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }

        int totalScore = balance + replenishmentAmount;

        System.out.println(totalScore + " Итоговый счет");
        System.out.println(bonus + " Количество бонусных рублей");
    }
}
