package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    @Test //сумма всех продаж
    void shouldCalculateSumRight() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }
    @Test //средняя продажа в месяц
    void shouldAverageSaleRight() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSale(sales);
        assertEquals(expected, actual);
    }
    @Test //номер месяца с максимальными продажами
    void shouldCalculateMaxSalesMonthRight() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSalesMonth(sales);
        assertEquals(expected, actual);
    }
    @Test //номер месяца с минимальными продажами
    void shouldCalculateMinSalesMonthRight() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSalesMonth(sales);
        assertEquals(expected, actual);

    }
    @Test // кол-во месяцев, в которых продажи были ниже среднего
    void shouldCalculateMonthsUnderAverageRight(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsUnderAverage(sales);
        assertEquals(expected, actual);
    }
    @Test // кол-во месяцев, в которых продажи были выше среднего
    void shouldCalculateMonthsOverAverageRight(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthsOverAverage(sales);
        assertEquals(expected, actual);
    }

}