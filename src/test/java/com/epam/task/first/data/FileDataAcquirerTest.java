package com.epam.task.first.data;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FileDataAcquirerTest {
    private final static String FILE_NAME = "./src/test/resources/input.txt";

    @Test
    public void testGetDataWhenFileExist() throws IOException {
        //given
        String[] actual = new String[]{"0", "10", "0.25"};

        //when
        FileDataAcquirer acquirer = new FileDataAcquirer(FILE_NAME);
        String[] result = acquirer.getData();

        //then
        Assert.assertArrayEquals(result, actual);
    }
}