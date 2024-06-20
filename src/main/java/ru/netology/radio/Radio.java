package ru.netology.radio;


public class Radio {

    private int radioStationNumber;
    private int volume;
    public int minRadioStationNumber = 0;
    public int maxRadioStationNumber = 9;
    public int maxVolume = 100;
    public int minVolume = 0;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }

    public void nextRadioStationNumber() {

        if (radioStationNumber >= maxRadioStationNumber) {
            radioStationNumber = 0;
        } else {
            setRadioStationNumber(radioStationNumber + 1);
        }
    }

    public void prevRadioStationNumber() {

        if (radioStationNumber <= minRadioStationNumber) {
            radioStationNumber = 9;
        } else {
            setRadioStationNumber(radioStationNumber - 1);
        }
    }

    public void increaseVolume() {
        if (volume >= maxVolume) {
            setVolume(volume);
        } else {
            setVolume(volume + 1);
        }

    }

    public void reducingVolume() {
        if (volume <= minVolume) {
            setVolume(volume);
        } else {
            setVolume(volume - 1);
        }
    }

}
