public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < min) {

                min = sales[i];
            }
        }
        return min;
    }

    public long stat() {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        long stat = 0;
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

