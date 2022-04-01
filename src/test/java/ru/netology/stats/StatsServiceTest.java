package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    void calculateSum() {
       // StatsService service = new StatsService();
       // long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected =180;

        long actual = service.calculateSum(numbers);

        assertEquals(expected, actual);
    }

    @Test
    void testCalculateSum() {
       // StatsService service = new StatsService();
       // long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected =15;

        long actual = service.calculateAverSum(numbers);

        assertEquals(expected, actual);
    }


    @Test
    void maxNumberMonth() {
       // StatsService service = new StatsService();
      //  long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected =8;

        long actual = service.maxNumberMonth(numbers);

        assertEquals(expected, actual);
    }

    @Test
    void minNumberMonth() {
       // StatsService service = new StatsService();
      //  long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected =9;

        long actual = service.minNumberMonth(numbers);

        assertEquals(expected, actual);
    }


    @Test
    void lengthMonth() {
       // StatsService service = new StatsService();
       // long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected =5;

        long actual = service.lengthMonth(numbers);

        assertEquals(expected, actual);
    }

    @Test
    void lengthMonthLong() {
        //StatsService service = new StatsService();
      //  long[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected =5;

        long actual = service.lengthMonthLong(numbers);

        assertEquals(expected, actual);
    }
}