package ru.netology;

public class Radio {
    public int currentCanal;
    public int currentVolume;

    public int getCurrentCanal() {
        return currentCanal;
    }

    public void setCurrentCanal(int newCurrentCanal) {
        if (newCurrentCanal > 9) {
            return;
        }
        if (newCurrentCanal < 0) {
            return;
        }
        currentCanal = newCurrentCanal;

    }

    public int nextCanal() {
        if (currentCanal == 9) {
            currentCanal = 0;
            return currentCanal;
        } else {
            currentCanal = currentCanal + 1;
        }
        return currentCanal;
    }

    public int prevCanal() {
        if (currentCanal == 0) {
            currentCanal = 9;
            return currentCanal;
        } else {
            currentCanal = currentCanal - 1;
        }
        return currentCanal;

    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int lowerVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;

    }

}