package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //метод граничных значений
    @Test
    public void RadioBoundaryTesting1() {
        Radio box = new Radio(30);
        box.setCurrentCanal(-1);

        int expected = 0;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting2() {
        Radio box = new Radio(30);
        box.setCurrentCanal(0);

        int expected = 0;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting3() {
        Radio box = new Radio(30);
        box.setCurrentCanal(1);

        int expected = 1;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting4() {
        Radio box = new Radio(30);
        box.setCurrentCanal(28);

        int expected = 28;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting5() {
        Radio box = new Radio(30);
        box.setCurrentCanal(29);

        int expected = 29;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting6() {
        Radio box = new Radio(30);
        box.setCurrentCanal(30);

        int expected = 0;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting7() {
        Radio box = new Radio();
        box.setCurrentCanal(-1);

        int expected = 0;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting8() {
        Radio box = new Radio();
        box.setCurrentCanal(0);

        int expected = 0;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting9() {
        Radio box = new Radio();
        box.setCurrentCanal(1);

        int expected = 1;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting10() {
        Radio box = new Radio();
        box.setCurrentCanal(8);

        int expected = 8;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting11() {
        Radio box = new Radio();
        box.setCurrentCanal(9);

        int expected = 9;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioBoundaryTesting12() {
        Radio box = new Radio();
        box.setCurrentCanal(10);

        int expected = 0;
        int actual = box.getCurrentCanal();

        assertEquals(expected, actual);
    }


    @Test
    public void RadioNextCanalBoundaryTesting1() {
        Radio box = new Radio();
        box.setCurrentCanal(0);

        int expected = 1;
        int actual = box.nextCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioNextCanalBoundaryTesting2() {
        Radio box = new Radio();
        box.setCurrentCanal(1);

        int expected = 2;
        int actual = box.nextCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioNextCanalBoundaryTesting3() {
        Radio box = new Radio();
        box.setCurrentCanal(9);

        int expected = 0;
        int actual = box.nextCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioNextCanalBoundaryTesting4() {
        Radio box = new Radio(30);
        box.setCurrentCanal(0);

        int expected = 1;
        int actual = box.nextCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioNextCanalBoundaryTesting5() {
        Radio box = new Radio(30);
        box.setCurrentCanal(1);

        int expected = 2;
        int actual = box.nextCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioNextCanalBoundaryTesting6() {
        Radio box = new Radio(30);
        box.setCurrentCanal(29);

        int expected = 0;
        int actual = box.nextCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioPrevCanalBoundaryTesting1() {
        Radio box = new Radio();
        box.setCurrentCanal(0);

        int expected = 9;
        int actual = box.prevCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioPrevCanalBoundaryTesting2() {
        Radio box = new Radio();
        box.setCurrentCanal(1);

        int expected = 0;
        int actual = box.prevCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioPrevCanalBoundaryTesting3() {
        Radio box = new Radio();
        box.setCurrentCanal(9);

        int expected = 8;
        int actual = box.prevCanal();

        assertEquals(expected, actual);
    }
    @Test
    public void RadioPrevCanalBoundaryTesting4() {
        Radio box = new Radio(30);
        box.setCurrentCanal(0);

        int expected = 29;
        int actual = box.prevCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioPrevCanalBoundaryTesting5() {
        Radio box = new Radio(30);
        box.setCurrentCanal(1);

        int expected = 0;
        int actual = box.prevCanal();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioPrevCanalBoundaryTesting6() {
        Radio box = new Radio(30);
        box.setCurrentCanal(29);

        int expected = 28;
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
        box.currentVolume = 99;

        int expected = 100;
        int actual = box.increaseVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioIncreaseVolumeBoundaryTesting4() {
        Radio box = new Radio();
        box.currentVolume = 100;

        int expected = 100;
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
        box.currentVolume = 100;

        int expected = 99;
        int actual = box.lowerVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void RadioLowerVolumeBoundaryTesting5() {
        Radio box = new Radio();
        box.currentVolume = 99;

        int expected = 98;
        int actual = box.lowerVolume();

        assertEquals(expected, actual);
    }
}