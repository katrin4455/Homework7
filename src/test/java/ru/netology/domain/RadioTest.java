package ru.netology.domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    void amountStation() {
        Radio radio = new Radio(8);
        Assertions.assertEquals(8, radio.getAmountStation());
    }
    @Test
    void currentRadioStation() {
        radio.setCurrentRadioStation(5);
        Assertions.assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void currentRadioStation1() {
        radio.setCurrentRadioStation(15);
        Assertions.assertEquals(0,radio.getCurrentRadioStation());
    }
    @Test
    void currentRadioStation2() {
        radio.setCurrentRadioStation(-2);
        Assertions.assertEquals(0, radio.getCurrentRadioStation());

    }
    @Test
    void nextStation() {
        radio.setCurrentRadioStation(2);
        radio.setNextStation();
        Assertions.assertEquals(3, radio.getCurrentRadioStation());
    }
    @Test
    void nextStation1() {
        radio.setCurrentRadioStation(9);
        radio.setNextStation();
        Assertions.assertEquals(0, radio.getCurrentRadioStation());
    }
    @Test
    void nextStation2() {
        radio.setCurrentRadioStation(0);
        radio.setNextStation();
        Assertions.assertEquals(1, radio.getCurrentRadioStation());
    }
    @Test
    void prevStation() {
        radio.setCurrentRadioStation(6);
        radio.setPrevStation();
        Assertions.assertEquals(5, radio.getCurrentRadioStation());
    }
    @Test
    void prevStation1() {
        radio.setCurrentRadioStation(0);
        radio.setPrevStation();
        Assertions.assertEquals(9,radio.getCurrentRadioStation());
    }
    @Test
    void prevStation2() {
        radio.setCurrentRadioStation(9);
        radio.setPrevStation();
        Assertions.assertEquals(8, radio.getCurrentRadioStation());
    }
    @Test
    void setCurrentVolume() {
        radio.setCurrentVolume(80);
        Assertions.assertEquals(80,radio.getCurrentVolume());
    }
    @Test
    void setCurrentVolume1() {
        radio.setCurrentVolume(1);
        Assertions.assertEquals(1,radio.getCurrentVolume());
    }
    @Test
    void setCurrentVolume2() {
        radio.setCurrentVolume(-6);
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void setCurrentVolume3(){
        radio.setCurrentVolume(150);
        Assertions.assertEquals(0,radio.getCurrentVolume());
    }

    @Test
    void  increaseVolume() {
        radio.setCurrentVolume(5);
        radio.setIncreaseVolume();
        Assertions.assertEquals(6, radio.getCurrentVolume());
    }
    @Test
    void  increaseVolume1() {
        radio.setCurrentVolume(100);
        radio.setIncreaseVolume();
        Assertions.assertEquals(100, radio.getCurrentVolume());
    }
    @Test
    void  increaseVolume2() {
        radio.setCurrentVolume(1);
        radio.setIncreaseVolume();
        Assertions.assertEquals(2, radio.getCurrentVolume());
    }
    @Test
    void increaseVolume3() {
        radio.setCurrentVolume(55);
        radio.setIncreaseVolume();
        Assertions.assertEquals(56, radio.getCurrentVolume());
    }
    @Test
    void decreaseVolume1() {
        radio.setCurrentVolume(80);
        radio.setDecreaseVolume();
        Assertions.assertEquals(79, radio.getCurrentVolume());
    }
    @Test
    void decreaseVolume2() {
        radio.setCurrentVolume(1);
        radio.setDecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void decreaseVolume3() {
        radio.setCurrentVolume(140);
        radio.setDecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void decreaseVolume4() {
        radio.setCurrentVolume(0);
        radio.setDecreaseVolume();
        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

}

