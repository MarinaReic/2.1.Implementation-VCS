public class Main {
    public static void main(String[] args) {
        int[] salesJan2022 = {38, 137, 197, 187, 14, 91, 55, 135, 92, 5, 22, 158, 100, 153, 32, 90, 194, 36, 116, 118, 87, 29, 133, 120, 6, 109, 124, 86, 101, 69, 97};
        SalesManager january2022 = new SalesManager(salesJan2022);
        int bestJan2022 = january2022.max();
        System.out.println("Лучший результат продаж в январе 2022 - " + bestJan2022 + " штук за один день!");
    }
}