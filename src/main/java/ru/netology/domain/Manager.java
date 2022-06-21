package ru.netology.domain;

public class Manager {
    private MovieItem[] items = new MovieItem[0];
    private int limit;

    public Manager() {
    }

    public Manager(int limit) {
        this.limit = limit;
    }


    public void save(MovieItem item) {
        int length = items.length + 1;
        MovieItem[] tmp = new MovieItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int LastIndex = tmp.length - 1;
        tmp[LastIndex] = item;
        items = tmp;
    }

    public MovieItem[] findAll() {
        return items;
    }

    public MovieItem[] findLast() {
        int resultLength;
        if (limit >= findAll().length) {
            resultLength = findAll().length;
        } else {
            resultLength = limit;
        }
        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = resultLength - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}
