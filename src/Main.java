
public class Main {
    public static void main(String[] args) {
    int kept = 100;
    int replenishment = 1100;
    int coefficient = 100;
    int minAmount = 1000;

    if (replenishment > minAmount) {
        int totalAmount = replenishment / coefficient + replenishment + kept;
        System.out.println("Итоговая сумма - " + totalAmount + " руб");
    } else {
        int totalAmount = replenishment + kept;
        System.out.println("Итоговая сумма - " + totalAmount + "руб");
    }
    }
}