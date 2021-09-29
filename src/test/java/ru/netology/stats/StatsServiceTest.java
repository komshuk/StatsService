package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSalesAmount() {
        StatsService service = new StatsService();

        float[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 180;

        float actual = service.salesAmount(salesData);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSalesAmount() {
        StatsService service = new StatsService();

        float[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 15;

        float actual = service.averageSalesAmount(salesData);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSalesAmount() {
        StatsService service = new StatsService();

        float[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 8;

        float actual = service.maxSalesAmount(salesData);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinSalesAmount() {
        StatsService service = new StatsService();

        float[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 9;

        float actual = service.minSalesAmount(salesData);

        assertEquals(expected, actual);
    }

    @Test
    void shouldBelowAverageSalesAmount() {
        StatsService service = new StatsService();

        float[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 5;

        float actual = service.belowAverageSalesAmount(salesData);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMoreAverageSalesAmount() {
        StatsService service = new StatsService();

        float[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        float expected = 5;

        float actual = service.moreAverageSalesAmount(salesData);

        assertEquals(expected, actual);
    }
}