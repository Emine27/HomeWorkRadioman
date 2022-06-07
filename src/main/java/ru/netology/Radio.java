package ru.netology;

public class Radio {
    private int currentCanal;
    private int minCanal;
    private int maxCanal;
    public int currentVolume;

    private int minVolume;
    private int maxVolume;

    public Radio(int maxCanal) {
        this.maxCanal = maxCanal - 1;
        maxVolume = 100;
    }

    public Radio() {
        this.maxCanal = 9;
        maxVolume = 100;
    }

    public int getCurrentCanal() {
        return currentCanal;
    }

    public void setCurrentCanal(int newCurrentCanal) {
        if (newCurrentCanal > maxCanal) {
            return;
        }
        if (newCurrentCanal < minCanal) {
            return;
        }
        currentCanal = newCurrentCanal;

    }

    public int nextCanal() {
        if (currentCanal == maxCanal) {
            currentCanal = minCanal;
            return currentCanal;
        } else {
            currentCanal = currentCanal + 1;
        }
        return currentCanal;
    }

    public int prevCanal() {
        if (currentCanal == minCanal) {
            currentCanal = maxCanal;
            return currentCanal;
        } else {
            currentCanal = currentCanal - 1;
        }
        return currentCanal;

    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int lowerVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;

    }

}