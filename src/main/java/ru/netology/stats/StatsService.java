package ru.netology.stats;

public class StatsService {
    //сумма всех продаж
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }
    //средняя продажа за месяц
    public int averageSale(int[] sales){
        return calculateSum(sales)/sales.length;
    }
    //номер месяца с максимальными продажами
    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }
    //номер месяца с минимальными продажами
    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
    // кол-во месяцев, в которых продажи были ниже среднего
    public int monthsUnderAverage(int[] sales) {
        int monthCounter = 0; //ставим счётчик
        for (int sale:sales){ // перебор значений в цикле
         if (sale < averageSale (sales)) {// условие - меньше среднего значения
             monthCounter++;
         }
        }
        return monthCounter;
    }
    // кол-во месяцев, в которых продажи были выше среднего
    public int monthsOverAverage(int[] sales) {
        int monthCounter = 0; //ставим счётчик
        for (int sale:sales){ // перебор значений в цикле
            if (sale > averageSale (sales)) {// условие - выше среднего значения
                monthCounter++;
            }
        }
        return monthCounter;
    }
}
