package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {

    @Test
    public void testIsTeenagerTrue() {
        // Проверяем, что метод isTeenager() возвращает true для возраста от 13 до 19
        Assert.assertTrue(Person.isTeenager(13));
        Assert.assertTrue(Person.isTeenager(16));
        Assert.assertTrue(Person.isTeenager(19));
    }

    @Test
    public void testIsTeenagerFalse() {
        // Проверяем, что метод isTeenager() возвращает false для тех, кто не является тинейджером
        Assert.assertFalse(Person.isTeenager(12));
        Assert.assertFalse(Person.isTeenager(20));
    }
}