public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{12, 50, 48, 34, 41};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимально было продано: " + salesManager.max());
    }
}

