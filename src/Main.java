public class Main {
    public static void main(String[] args) {

        int naSchetu = 330;
        int summaPopolneniya = 1369;

        int summaBonusa;
        if (summaPopolneniya >= 1100) {
            summaBonusa = summaPopolneniya / 100;
        } else {
            summaBonusa = 0;
        }

        int obshchiySchet = naSchetu + summaPopolneniya;

        System.out.println(obshchiySchet + " Итоговый счет");
        System.out.println(summaBonusa + " Количество бонусных рублей");
    }
}
