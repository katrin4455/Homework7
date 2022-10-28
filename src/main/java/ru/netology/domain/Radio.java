package ru.netology.domain;


public class Radio {

    private int amountStation = 10;
    private int minRadioStation;
    private int maxRadioStation = amountStation - 1;
    private int currentRadioStation;

    private int currentVolume;
    private int minVolume;
    private int maxVolume = 100;

    public int getAmountStation() {
        return amountStation;
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public Radio () {

    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > amountStation - 1) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


    public void setNextStation() {
        if (currentRadioStation == amountStation - 1) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void setPrevStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = amountStation -1;
        } else {
            currentRadioStation--;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseVolume() {  // Увеличение звука
        if (currentVolume == maxVolume) {
            return;
        }
            currentVolume++;
    }

    public void setDecreaseVolume() {  // Уменьшение звука
        if (currentVolume == minVolume) {
            return;
        }
            currentVolume--;
    }
}

