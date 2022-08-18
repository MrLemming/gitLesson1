public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < min) {

                min = sales[i];
            }
        }
        return min;
    }

    public int stat() {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        int stat = 0;
        if (sales.length == 1) {
            stat = sum;
        }
        if (sales.length == 2) {
            stat = sum / 2;
        } else {
            stat = (sum - max() - min()) / (sales.length - 2);
        }
        return stat;
    }
}

