package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    MovieItem first = new MovieItem(101, "Бладшот", "боевик", "url101");
    MovieItem second = new MovieItem(102, "Вперед", "мультфильм", "url102");
    MovieItem third = new MovieItem(103, "Джентельмены", "боевик", "url103");


    @Test
    public void shouldSaveItem() {
        Manager manager = new Manager();
        manager.save(first);
        manager.save(second);
        manager.save(third);

        MovieItem[] actual = manager.findAll();
        MovieItem[] expected = { first, second, third };
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindAll() {
        Manager manager = new Manager();
        manager.findAll();

        MovieItem[] actual = manager.findAll();
        MovieItem[] expected = { first, second, third };
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLast() {
        Manager manager = new Manager(10);
        MovieItem[] actual = manager.findLast();
        assertEquals(10, actual);
    }
}
