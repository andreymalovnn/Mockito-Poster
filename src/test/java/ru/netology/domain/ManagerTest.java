package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ManagerTest {
    Manager manager = new Manager();
    MovieItem first = new MovieItem(101, "Бладшот", "боевик", "url101");
    MovieItem second = new MovieItem(102, "Вперед", "мультфильм", "url102");
    MovieItem third = new MovieItem(103, "Джентельмены", "боевик", "url103");

    @Test
    public void shouldSaveItem() {
        manager.save(first);
        MovieItem[] actual = manager.findAll();
        MovieItem[] expected = new MovieItem[]{first};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindAll() {
        manager.save(first);
        manager.save(second);
        manager.save(third);
        manager.findAll();
        MovieItem[] actual = manager.findAll();
        MovieItem[] expected = new MovieItem[]{first, second, third};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLastOne() {
        Manager manager = new Manager(1);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        MovieItem[] actual = manager.findLast();
        MovieItem[] expected = new MovieItem[]{first};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLastTwo() {
        Manager manager = new Manager(2);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        MovieItem[] actual = manager.findLast();
        MovieItem[] expected = new MovieItem[]{second, first};
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldFindLastThree() {
        Manager manager = new Manager(3);
        manager.save(first);
        manager.save(second);
        manager.save(third);
        MovieItem[] actual = manager.findLast();
        MovieItem[] expected = new MovieItem[]{third, second, first};
        Assertions.assertArrayEquals(actual, expected);
    }

}
