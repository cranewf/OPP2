package ru.netology.radio;


public class Radio {

    private int radioStationNumber;
    private int volume;
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber = 9;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int numberOfRadioStations;

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
        if (newRadioStationNumber < minRadioStationNumber) {
            return;
        }
        if (newRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        if (newRadioStationNumber <= numberOfRadioStations) {
            radioStationNumber = numberOfRadioStations;
        }
        if (newRadioStationNumber > numberOfRadioStations) {
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
