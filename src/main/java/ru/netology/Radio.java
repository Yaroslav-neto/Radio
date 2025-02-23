package ru.netology;


public class Radio {

    private int currentRadioStationNumber; //переменная текущей радиостанции
    private int soundVolume; //переменная громкости звука

    //получение текущей р/ст
    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }
    //получение текущей громкости
    public int getSoundVolume() {
        return soundVolume;
    }
    //изменение р/ст
    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            currentRadioStationNumber = 9;
            return;
        }
        if (newCurrentRadioStationNumber > 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = newCurrentRadioStationNumber;
        }
    }
    //изменение громкости
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            soundVolume = 0;
            return;
        }
        if (newSoundVolume > 100) {
            soundVolume = 100;
        } else soundVolume = newSoundVolume;
    }
    //следующая станция
    public void next() {
        setCurrentRadioStationNumber(currentRadioStationNumber + 1);
    }
    //предыдущая станция
    public void prev() {
        setCurrentRadioStationNumber(currentRadioStationNumber - 1);
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