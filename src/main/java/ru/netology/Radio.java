package ru.netology;


public class Radio {


    private int currentRadioStationNumber; //переменная текущей радиостанции

    public int getCurrentRadioStationNumber() { //получение текущей р/ст
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) { //изменение р/ст
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

    private int soundVolume; //переменная громкости звука

    public int getSoundVolume() { //получение текущей громкости
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) { //изменение громкости
        if (newSoundVolume < 0) {
            soundVolume = 0;
            return;
        }
        if (newSoundVolume > 100) {
            soundVolume = 100;
        } else soundVolume = newSoundVolume;
    }

    public void next() { //следующая станция
        setCurrentRadioStationNumber(currentRadioStationNumber + 1);
    }

    public void prev() { //предыдущая станция
        setCurrentRadioStationNumber(currentRadioStationNumber - 1);
    }

    public void higher() { //громкость больше
        setSoundVolume(soundVolume + 1);
    }

    public void less() { //громкость меньше
        setSoundVolume(soundVolume - 1);
    }

}