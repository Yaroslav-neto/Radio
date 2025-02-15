package ru.netology;


public class Radio {

    protected int currentRadioStationNumber; //переменная текущей радиостанции

    public int getCurrentRadioStationNumber() { //получение текущей р/ст
        return currentRadioStationNumber;
    }

    int soundVolume; //переменная громкости звука

    public int getSoundVolume() { //получение текущей громкости
        return soundVolume;
    }

    public void setNextCurrentRadioStationNumber(int newCurrentRadioStationNumber) { //следующая станция
        currentRadioStationNumber = newCurrentRadioStationNumber;

        if (currentRadioStationNumber < 9) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }
    }

    public void setPreviousCurrentRadioStationNumber(int newCurrentRadioStationNumber) { //предыдущая станция
        currentRadioStationNumber = newCurrentRadioStationNumber;
        if (currentRadioStationNumber > 0) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = 9;
        }
    }

    public void setNextSoundVolume(int newSoundVolume) { //громкость больше
        soundVolume = newSoundVolume;
        if (soundVolume < 100) {
            soundVolume++;
        } else {
            soundVolume = 100;
        }

    }

    public void setPreviousSoundVolume(int newsSundVolume) { //громкость меньше
        soundVolume = newsSundVolume;
        if (soundVolume > 0) {
            soundVolume--;
        } else {
            soundVolume = 0;
        }
    }

}

