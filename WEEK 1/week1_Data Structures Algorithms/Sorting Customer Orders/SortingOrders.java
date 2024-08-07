class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }
}

class SortingOrders {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order tem = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = tem;
                }
            }
        }
    }

    public static void quickSort(Order[] orders, int l, int h) {
        if (l < h) {
            int pi = partition(orders, l, h);
            quickSort(orders, l, pi - 1);
            quickSort(orders, pi + 1, h);
        }
    }

    private static int partition(Order[] orders, int l, int h) {
        double pivot = orders[h].totalPrice;
        int i = (l - 1);
        for (int j = l; j < h; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;
                Order tem = orders[i];
                orders[i] = orders[j];
                orders[j] = tem;
            }
        }
        Order tem = orders[i + 1];
        orders[i + 1] = orders[h];
        orders[h] = tem;
        return i + 1;
    }
}

/*
 * 
 * COMPLEXITY:
 * Bubble Sort: O(n^2)
 * Quick Sort: O(n log n)
 * Quick Sort is generally preferred due to its better average-case time
 * complexity compared to Bubble Sort.
 * 
 */