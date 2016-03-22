package dkolodzey.tracktask1;

import org.junit.Test;

import java.lang.Exception;

import dkolodzey.tracktask1.NumberToWordConverter;

import static org.junit.Assert.*;
/**
 * Created by DKolodzey on 20.03.16.
 */
public class NumberToWordConverterTest {
    @Test
    public void test232567() throws Exception {
        assertEquals("двести тридцать две тысячи пятьсот шестьдесят семь",
                new NumberToWordConverter().getNumberInWords(232567));
    }
    @Test
    public void test1() throws Exception {
        assertEquals("один",
                new NumberToWordConverter().getNumberInWords(1));
    }
    @Test
    public void test1000() throws Exception {
        assertEquals("одна тысяча",
                new NumberToWordConverter().getNumberInWords(1000));
    }
}