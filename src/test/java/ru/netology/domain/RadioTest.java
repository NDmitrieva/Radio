package ru.netology.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    Radio radio1 = new Radio(20);

    @Test
    public void shouldStationOutMaxConstructor() {
        radio1.setCurrentStation(11);
        int expected = 11;
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationMinConstructor() {
        radio1.setCurrentStation(19);
        radio1.nextStationMin();
        int expected = 0;
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationOutConstructor() {
        radio1.currentStation = 21;
        radio1.nextStationMin();
        int expected = 0;
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationMaxConstructor() {
        radio1.setCurrentStation(0);
        radio1.prevStationMax();
        int expected = 19;
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOutConstructor() {
        radio1.currentStation = -1;
        radio1.prevStationMax();
        int expected = 19;
        int actual = radio1.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int expected = 5;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationOutMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldStationOutMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStationMin();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStationMin();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationOut() {
        Radio radio = new Radio();
        radio.currentStation = 11;
        radio.nextStationMin();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldNextStationUp() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.nextStationMin();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldPrevStationMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStationMax();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationOut() {
        Radio radio = new Radio();
        radio.currentStation = -1;
        radio.prevStationMax();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStationMax();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }


    @Test
    public void shouldVolumeOutMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeOutMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.lowerVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldLowerVolumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.lowerVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}




