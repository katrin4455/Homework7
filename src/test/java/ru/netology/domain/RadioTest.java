package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void setRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(7);

        int actual = radio.getCurrentRadioStation();
        int expected = 7;

        assertEquals(expected, actual);
    }
    @Test
    public void setRadioStation1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(13);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }
    @Test
    public void setRadioStation3() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-4);

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    void next() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        radio.next();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void next1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(2);
        radio.next();

        int actual = radio.getCurrentRadioStation();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    void prev() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prev();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    void prev1() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);
        radio.prev();

        int actual = radio.getCurrentRadioStation();
        int expected = 4;

        assertEquals(expected, actual);
    }
    @Test
    void prev2() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        radio.prev();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);

        int actual = radio.getCurrentVolume();
        int expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    void setCurrentVolume1() {  // увеличивает и уменьшает уровень громкости звука (в пределах от 0 до 10)
        Radio radio = new Radio();

        radio.setCurrentVolume(14);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void setCurrentVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-6);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void  increaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }
    @Test
    void  increaseVolume1() {
        Radio radio = new Radio();


        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }
    @Test
    void  increaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-5);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;

        assertEquals(expected, actual);
    }
    @Test
    void decreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 8;

        assertEquals(expected, actual);
    }
    @Test
    void decreaseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void decreaseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-3);
        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }

}

