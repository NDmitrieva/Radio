package ru.netology.domain;

public class Radio {

    public int currentStation;
    public int maxCountStation = 10;
    public int minStation = 0;
    public int maxStation = maxCountStation - 1;
    public int currentVolume;
    public int minVolume = 0;
    public int maxVolume = 100;

    public Radio(int maxCountStation) {
        this.maxCountStation = maxCountStation;
        this.maxStation = maxCountStation - 1;

    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > maxStation) {
            return;
        }
        if (newCurrentStation < minStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStationMin() {
        if (currentStation < maxCountStation) {
            currentStation = currentStation + 1;
        }
        if (currentStation > maxStation) {
            currentStation = 0;
        }
    }

    public void prevStationMax() {
        if (currentStation >= minStation) {
            currentStation = currentStation - 1;
        }
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        setCurrentVolume(currentVolume);
    }

    public void lowerVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        setCurrentVolume(currentVolume);
    }
}



