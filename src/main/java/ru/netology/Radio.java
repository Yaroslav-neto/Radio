package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {

    private int minCurrentRadioStationNumber = 0;
    private int maxCurrentRadioStationNumber = 9;
    private int currentRadioStationNumber = minCurrentRadioStationNumber;

    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int soundVolume = minSoundVolume;

    public Radio(int currentRadioStationNumber) {
        this.maxCurrentRadioStationNumber = currentRadioStationNumber - 1;
    }

    //изменение р/ст
    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {

        if (newCurrentRadioStationNumber < minCurrentRadioStationNumber) {
            currentRadioStationNumber = maxCurrentRadioStationNumber;
            return;
        }
        if (newCurrentRadioStationNumber > maxCurrentRadioStationNumber) {
            currentRadioStationNumber = minCurrentRadioStationNumber;
        } else {
            currentRadioStationNumber = newCurrentRadioStationNumber;
        }
    }

    //следующая станция
    public void next() {
        setCurrentRadioStationNumber(currentRadioStationNumber + 1);
    }

    //предыдущая станция
    public void prev() {
        setCurrentRadioStationNumber(currentRadioStationNumber - 1);
    }

    //изменение громкости
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minSoundVolume) {
            soundVolume = getMinSoundVolume();
            return;
        }
        if (newSoundVolume > maxSoundVolume) {
            soundVolume = getMaxSoundVolume();
        } else soundVolume = newSoundVolume;
    }

    //громкость больше
    public void higher() {
        setSoundVolume(soundVolume + 1);
    }

    //громкость меньше
    public void less() {
        setSoundVolume(soundVolume - 1);
    }
}
