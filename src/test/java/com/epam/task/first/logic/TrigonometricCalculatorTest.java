package com.epam.task.first.logic;

import com.epam.task.first.entity.Point;
import org.junit.Assert;
import org.junit.Test;

public class TrigonometricCalculatorTest {

    private TrigonometricCalculator calculator = new TrigonometricCalculator();

      /*
     * tg(0)   = 0
     * tg(0.5) = 0,54630248984379051325517946578029
     * tg(1)   = 1,5574077246549022305069748074584
     * */

    @Test
    public void shouldAnalyseTableValue() {
        //given
        Point[] actual = new Point[]{
                new Point(0, 0),
                new Point(0.5, 0.54630),
                new Point(1, 1.55740)};

        //when
        Point[] result = calculator.calculateTableValue(0, 1, 0.5);

        //then
        Assert.assertArrayEquals(result, actual);
    }
}