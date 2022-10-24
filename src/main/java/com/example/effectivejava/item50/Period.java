package com.example.effectivejava.item50;

import java.util.Date;

public class Period {

    private final Date start;
    private final Date end;

    /**
     *
     * @param start 시작 시각
     * @param end 종료 시각; 시작 시각보다 뒤여야 한다.
     * @throws IllegalArgumentException 시작 시각이 종료 시각보다 늦을 때 발생한다.
     */
    public Period(Date start, Date end) {
        this.end = new Date(end.getTime());
        this.start = new Date(start.getTime());
        if (start.compareTo(end) > 0)
            throw new IllegalArgumentException(start + "가" + end + "보다 늦다.");
    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }
}
