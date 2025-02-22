package ru.netology;

public class Radio {

    private int minCurrentRadioStationNumber = 0;
    private int maxCurrentRadioStationNumber = 9;
    private int currentRadioStationNumber = minCurrentRadioStationNumber;

    public Radio() {
        minCurrentRadioStationNumber = getMinCurrentRadioStationNumber();
        maxCurrentRadioStationNumber = getMaxCurrentRadioStationNumber();
        currentRadioStationNumber = getCurrentRadioStationNumber();
    }

    public Radio(int numberStations) {
        maxCurrentRadioStationNumber = minCurrentRadioStationNumber + numberStations - 1;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getMinCurrentRadioStationNumber() {
        return minCurrentRadioStationNumber;
    }

    public int getMaxCurrentRadioStationNumber() {
        return maxCurrentRadioStationNumber;
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

    public void next() { //следующая станция
        setCurrentRadioStationNumber(currentRadioStationNumber + 1);
    }

    public void prev() { //предыдущая станция
        setCurrentRadioStationNumber(currentRadioStationNumber - 1);
    }


    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int soundVolume = minSoundVolume;

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
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


    public void higher() { //громкость больше
        setSoundVolume(soundVolume + 1);
    }

    public void less() { //громкость меньше
        setSoundVolume(soundVolume - 1);
    }


}