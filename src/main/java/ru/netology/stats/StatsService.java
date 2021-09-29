package ru.netology.stats;

public class StatsService {

    public float salesAmount(float[] sales) {
        float sum = 0;
        for (float sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public float averageSalesAmount(float[] sales) {
        return salesAmount(sales) / sales.length;
    }

    public float maxSalesAmount(float[] sales) {
        float number = 0;
        float max = sales[0];
        for (float sale : sales) {
            if (sale > max) {
                max = sale;
                number = sales[0];
            }
        }
        return number;
    }

    public float minSalesAmount(float[] sales) {
        int minMonth = 0;
        int month = 0;
        for (float sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public float belowAverageSalesAmount(float[] sales) {
        float number = 0;
        float average = averageSalesAmount(sales);
        for (float sale : sales) {
            if (sale < average) {
                sale = number + 1;
                number = sale;
            }
        }
        return number;
    }

    public float moreAverageSalesAmount(float[] sales) {
        float number = 0;
        float average = averageSalesAmount(sales);
        for (float sale : sales) {
            if (sale < average) {
                sale = number + 1;
                number = sale;
            }
        }
        return number;
    }
}