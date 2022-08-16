package ru.netology.manager;

public class Manager {

    private Posters[] film = new Posters[0];
    private int totalPosters = 10;

    public Manager(int totalPosters) {
        this.totalPosters = totalPosters;
    }
    public Manager() {
    }

    public void savePosters(Posters films) {
        Posters[] tmp = new Posters[film.length + 1];
        for (int i = 0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        tmp[tmp.length - 1] = films;
        film = tmp;
    }

    public Posters[] findAll() {
        return film;
    }

    public Posters[] findLast() {
        int allLength = film.length;
        if (totalPosters <= allLength) {
            allLength = totalPosters;
        } else {
            allLength = film.length;
        }
        Posters[] result = new Posters[allLength];
        for (int i = 0; i < allLength; i++) {
            int index = film.length - 1 - i;
            result[i] = film[index];
        }
        return result;
    }

}