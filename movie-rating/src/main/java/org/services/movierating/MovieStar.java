package org.services.movierating;

public enum MovieStar {

    ONE_START(1), TWO_STAR(2),THREE_STAR(3),FOUR_STAR(4),FIVE_STAR(5);

    private int value;

    MovieStar(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
