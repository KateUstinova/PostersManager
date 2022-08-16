package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Posters film1 = new Posters(1,"Бладшот","боевик");
    Posters film2 = new Posters(2, "Вперёд", "мультфильм");
    Posters film3 = new Posters(3, "Отель Белград", "комедия");
    Posters film4 = new Posters(4, "Джентельмены", "боевик");
    Posters film5 = new Posters(5, "Человек-невидимка", "ужасы");
    Posters film6 = new Posters(6, "Тролли. Мировой тур", "мультфильм");
    Posters film7 = new Posters(7, "Номер один", "комедия");
    Posters film8 = new Posters(8, "Кукла", "ужасы");
    Posters film9 = new Posters(9, "Неувольняемый", "комедия");
    Posters film10 = new Posters(10, "Булки", "комедия");
    Posters film11 = new Posters(11, "Побег из космоса", "мультфильм");
    Posters film12 = new Posters(12, "Молох", "ужасы");

    @Test
    public void shouldShowAllFilms() {
        Manager newPoster = new Manager();
        newPoster.savePosters(film1);
        newPoster.savePosters(film2);
        newPoster.savePosters(film3);
        newPoster.savePosters(film4);
        newPoster.savePosters(film5);
        newPoster.savePosters(film6);
        newPoster.savePosters(film7);

        Posters[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Posters[] actual = newPoster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowOneFilm() {
        Manager newPoster = new Manager();
        newPoster.savePosters(film1);

        Posters[] expected = {film1};
        Posters[] actual = newPoster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldShowNoFilm() {
        Manager newPoster = new Manager();

        Posters[] expected = { };
        Posters[] actual = newPoster.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastTenFilms() {
        Manager newPoster = new Manager();
        newPoster.savePosters(film1);
        newPoster.savePosters(film2);
        newPoster.savePosters(film3);
        newPoster.savePosters(film4);
        newPoster.savePosters(film5);
        newPoster.savePosters(film6);
        newPoster.savePosters(film7);
        newPoster.savePosters(film8);
        newPoster.savePosters(film9);
        newPoster.savePosters(film10);
        newPoster.savePosters(film11);
        newPoster.savePosters(film12);

        Posters[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3};
        Posters[] actual = newPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFiveFilms() {
        Manager newPoster = new Manager(5);
        newPoster.savePosters(film1);
        newPoster.savePosters(film2);
        newPoster.savePosters(film3);
        newPoster.savePosters(film4);
        newPoster.savePosters(film5);
        newPoster.savePosters(film6);
        newPoster.savePosters(film7);

        Posters[] expected = {film7, film6, film5, film4, film3};
        Posters[] actual = newPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldMoreAllLengthPosters() {
        Manager newPoster = new Manager(13);
        newPoster.savePosters(film1);
        newPoster.savePosters(film2);
        newPoster.savePosters(film3);
        newPoster.savePosters(film4);
        newPoster.savePosters(film5);
        newPoster.savePosters(film6);
        newPoster.savePosters(film7);
        newPoster.savePosters(film8);
        newPoster.savePosters(film9);
        newPoster.savePosters(film10);
        newPoster.savePosters(film11);
        newPoster.savePosters(film12);

        Posters[] expected = {film12, film11, film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        Posters[] actual = newPoster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
