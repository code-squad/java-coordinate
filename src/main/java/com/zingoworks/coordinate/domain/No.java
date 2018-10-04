package com.zingoworks.coordinate.domain;

public class No {

    public final int number;

    public No(int number) {
        this.number = number;
        if (number < 1 || number > 24) {
            throw new IllegalArgumentException("유효한 범위를 초과합니다.");
        }
    }
}
