package ru.netology;

public class Radio {

    private int minCurrentRadioStationNumber = 0;
    private int maxCurrentRadioStationNumber = 9;
    private int currentRadioStationNumber = minCurrentRadioStationNumber;

    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;
    private int soundVolume = minSoundVolume;

    public Radio() {
    }

    public Radio(int currentRadioStationNumber) {
        this.minCurrentRadioStationNumber = minCurrentRadioStationNumber;
        this.maxCurrentRadioStationNumber = currentRadioStationNumber - 1;
        this.currentRadioStationNumber = minCurrentRadioStationNumber;
        this.minSoundVolume = minSoundVolume;
        this.maxSoundVolume = maxSoundVolume;
        this.soundVolume = soundVolume;
    }

    public int getMinCurrentRadioStationNumber() {
        return minCurrentRadioStationNumber;
    }

    public int getMaxCurrentRadioStationNumber() {
        return maxCurrentRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
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
