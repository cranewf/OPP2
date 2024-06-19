import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        radio.nextRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNexRadioStationNumber() {
        Radio radio = new Radio();
        radio.nextRadioStationNumber(7);

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationNumberMin() {
        Radio radio = new Radio();
        radio.prevRadioStationNumber(-1);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationNumber() {
        Radio radio = new Radio();
        radio.prevRadioStationNumber(5);

        int expected = 4;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio volume = new Radio();
        volume.increaseVolume(99);

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveMaxVolume() {
        Radio volume = new Radio();
        volume.increaseVolume(101);

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio volume = new Radio();
        volume.reducingVolume(1);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveMinVolume() {
        Radio volume = new Radio();
        volume.reducingVolume(-1);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}