public class Radio {

    int radioStationNumber;
    int volume;
    int minRadioStationNumber = 0;
    int maxRadioStationNumber = 9;
    int maxVolume = 100;
    int minVolume = 0;

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

    public void nextRadioStationNumber(int newRadioStationNumber) {

        if (newRadioStationNumber > maxRadioStationNumber) {
            radioStationNumber = 0;
        } else {
            radioStationNumber = newRadioStationNumber + 1;
        }
    }

    public void prevRadioStationNumber(int newRadioStationNumber) {

        if (newRadioStationNumber < minRadioStationNumber) {
            radioStationNumber = 9;
        } else {
            radioStationNumber = newRadioStationNumber - 1;
        }
    }

    public void increaseVolume(int newVolume) {
        if (newVolume >= maxVolume) {
            volume = maxVolume;
        } else {
            volume = newVolume + 1;
        }

    }

    public void reducingVolume(int newVolume) {
        if (newVolume <= minVolume) {
            volume = minVolume;
        } else {
            volume = newVolume - 1;
        }
    }

}
