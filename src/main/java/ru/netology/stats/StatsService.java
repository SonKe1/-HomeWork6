package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }


    public int calculateAverageSalesAmount(int[] sales) {
        return calculateSum(sales) / sales.length;

    }

    public int calculateMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int calculateMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateMonthsOfSalesBelowAverage(int[] sales) {
        int monthCount = 0;
        int average = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < average) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }

    public int calculateMonthsOfSalesAboveAverage(int[] sales) {
        int monthCount = 0;
        int average = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale >= average) {
                monthCount = monthCount + 1;
            }
        }
        return monthCount;
    }
}