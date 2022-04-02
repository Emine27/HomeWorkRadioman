package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //метод граничных значений
    @Test
    public void RadioBoundaryTesting1() {
        Radio box = new Radio();
        box.setCurrentCanal(-1);

        int expected = 0;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting2() {
        Radio box = new Radio();
        box.setCurrentCanal(0);

        int expected = 0;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting3() {
        Radio box = new Radio();
        box.setCurrentCanal(1);

        int expected = 1;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting4() {
        Radio box = new Radio();
        box.setCurrentCanal(8);

        int expected = 8;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting5() {
        Radio box = new Radio();
        box.setCurrentCanal(9);

        int expected = 9;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting6() {
        Radio box = new Radio();
        box.setCurrentCanal(10);

        int expected = 0;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioNextCanalBoundaryTesting1() {
        Radio box = new Radio();
        box.currentCanal = 0;

        int expected = 1;
        int actual = box.nextCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioNextCanalBoundaryTesting2() {
        Radio box = new Radio();
        box.currentCanal = 1;

        int expected = 2;
        int actual = box.nextCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioNextCanalBoundaryTesting3() {
        Radio box = new Radio();
        box.currentCanal = 9;

        int expected = 0;
        int actual = box.nextCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioPrevCanalBoundaryTesting1() {
        Radio box = new Radio();
        box.currentCanal = 0;

        int expected = 9;
        int actual = box.prevCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioPrevCanalBoundaryTesting2() {
        Radio box = new Radio();
        box.currentCanal = 1;

        int expected = 0;
        int actual = box.prevCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioPrevCanalBoundaryTesting3() {
        Radio box = new Radio();
        box.currentCanal = 9;

        int expected = 8;
        int actual = box.prevCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioIncreaseVolumeBoundaryTesting1() {
        Radio box = new Radio();
        box.currentVolume = 0;

        int expected = 1;
        int actual = box.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioIncreaseVolumeBoundaryTesting2() {
        Radio box = new Radio();
        box.currentVolume = 1;

        int expected = 2;
        int actual = box.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioIncreaseVolumeBoundaryTesting3() {
        Radio box = new Radio();
        box.currentVolume = 9;

        int expected = 10;
        int actual = box.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioIncreaseVolumeBoundaryTesting4() {
        Radio box = new Radio();
        box.currentVolume = 10;

        int expected = 10;
        int actual = box.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioLowerVolumeBoundaryTesting1() {
        Radio box = new Radio();
        box.currentVolume = 0;

        int expected = 0;
        int actual = box.lowerVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioLowerVolumeBoundaryTesting2() {
        Radio box = new Radio();
        box.currentVolume = 1;

        int expected = 0;
        int actual = box.lowerVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioLowerVolumeBoundaryTesting3() {
        Radio box = new Radio();
        box.currentVolume = 2;

        int expected = 1;
        int actual = box.lowerVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioLowerVolumeBoundaryTesting4() {
        Radio box = new Radio();
        box.currentVolume = 10;

        int expected = 9;
        int actual = box.lowerVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioLowerVolumeBoundaryTesting5() {
        Radio box = new Radio();
        box.currentVolume = 9;

        int expected = 8;
        int actual = box.lowerVolume();

        assertEquals(expected, actual);
    }
}