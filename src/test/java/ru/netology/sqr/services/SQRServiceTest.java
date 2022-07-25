package ru.netology.sqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/range.csv")
    public void testFirstRange (int expected, int minRange, int maxRange) {
        SQRService service = new SQRService();

        int actual = service.calcSqr(minRange, maxRange);

        Assertions.assertEquals(expected, actual);
    }


}
