package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldSetRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(8);

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSecondNotSetRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNexRadioStationNumberMax() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        radio.nextRadioStationNumber();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNexRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(7);

        radio.nextRadioStationNumber();
        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationNumberMin() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);

        radio.prevRadioStationNumber();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationNumber() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);

        radio.prevRadioStationNumber();

        int expected = 4;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio volume = new Radio();
        volume.setVolume(99);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveMaxVolume() {
        Radio volume = new Radio();
        volume.setVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio volume = new Radio();
        volume.setVolume(1);

        volume.reducingVolume();

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveMinVolume() {
        Radio volume = new Radio();
        volume.setVolume(0);

        volume.reducingVolume();

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.setVolume(-1);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolume() {
        Radio volume = new Radio();
        volume.setVolume(101);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberOfRadioStations() {
        Radio radio = new Radio(35);

        Assertions.assertEquals(35, radio.getNumberOfRadioStations());
    }

    @Test
    public void shouldDefaultNumberOfRadioStations() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getNumberOfRadioStations());
    }

    @Test
    public void settingAboveMaximum() {
        Radio radio = new Radio(20);

        radio.setRadioStationNumber(15);

        int expected = 15;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void settingAboveHighMaximum() {
        Radio radio = new Radio(32);

        radio.setRadioStationNumber(33);

        Assertions.assertEquals(0, radio.getRadioStationNumber());
    }


}