package ru.netology.radio;


public class Radio {

    private int radioStationNumber;
    private int numberOfRadioStations;
    private int volume;
    private int minRadioStationNumber = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public Radio() {
        this.numberOfRadioStations = 10;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber > numberOfRadioStations - 1) {
            return;
        }
        if (newRadioStationNumber < minRadioStationNumber) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void setVolume(int newVolume) {
        if (newVolume > maxVolume) {
            return;
        }
        if (newVolume < minVolume) {
            return;
        }
        volume = newVolume;
    }

    public void nextRadioStationNumber() {
        if (radioStationNumber >= numberOfRadioStations - 1) {
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
