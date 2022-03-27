package ru.netology;

public class Radio {
    private int currentCanal;
    private int currentVolume;

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

    public void nextCanal(int newCurrentCanal) {
        if (newCurrentCanal == 9) {
            currentCanal = 0;
        }
        if (newCurrentCanal < 9) {
            currentCanal = newCurrentCanal + 1;
        }
    }

    public void prevCanal(int newCurrentCanal) {
        if (newCurrentCanal == 0) {
            currentCanal = 9;
        }
        if (newCurrentCanal > 0) {
            currentCanal = newCurrentCanal - 1;
        }

    }
    public int getCurrentVolume() {
        return currentVolume;
    }


    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume >= 10) {
            currentVolume = 10;
        }
    }

    public void lowerVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume <= 0) {
            currentVolume = 0;
        }

    }

}