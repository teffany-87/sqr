package ru.netology.sqr;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'number squares,range 1', 115,454,11" ,
            "'number squares,range 2', 600,8967,70",
            "'number squares,range 3', 50,100,1",
            "'number squares,range 4', 30,125,2"})
    void shouldCalculate(String testName, int minBorder, int maxBorder,int expected ) {

        ru.netology.sqr.SQRService service = new ru.netology.sqr.SQRService();

        int actual = service.calculateNumberOfSquares(minBorder, maxBorder);

        assertEquals(expected, actual);

    }
}