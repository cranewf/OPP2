package ru.netology.radio;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int radioStationNumber;
    private int volume;
    private int minRadioStationNumber = 0;
    private int maxRadioStationNumber = 9;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int numberOfRadioStations;



}
