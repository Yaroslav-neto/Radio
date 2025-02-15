package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @Test //для создания переменной номера р/ст
    public void shouldRadioStationNumber() {
        Radio num = new Radio();

        num.currentRadioStationNumber = 8;

        int expected = 8;
        int actual = num.currentRadioStationNumber;

        assertEquals(expected, actual);
    }

    @Test//для получения переменной номера р/ст
    public void shouldGetCurrentRadioStationNumber() {
        Radio num = new Radio();

        num.currentRadioStationNumber = 7;

        int expected = 7;
        int actual = num.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test //для создания переменной уровня громкости
    public void shouldSoundVolume() {
        Radio num = new Radio();

        num.soundVolume = 50;

        int expected = 50;
        int actual = num.soundVolume;

        assertEquals(expected, actual);
    }

    @Test //для получения переменной уровня громкости
    public void shouldGetSoundVolume() {
        Radio num = new Radio();

        num.soundVolume = 49;

        int expected = 49;
        int actual = num.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test //следующий канал
    public void shouldSetMaxNextCurrentRadioStationNumber() {
        Radio num = new Radio();

        num.setNextCurrentRadioStationNumber(9);

        int expected = 0;
        int actual = num.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test //следующий канал
    public void shouldSetMinNextCurrentRadioStationNumber() {
        Radio num = new Radio();

        num.setNextCurrentRadioStationNumber(0);

        int expected = 1;
        int actual = num.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test //предыдущий канал
    public void shouldSetMaxPreviousCurrentRadioStationNumber() {
        Radio num = new Radio();

        num.setPreviousCurrentRadioStationNumber(9);

        int expected = 8;
        int actual = num.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test //предыдущий канал
    public void shouldSetMinPreviousCurrentRadioStationNumber() {
        Radio num = new Radio();

        num.setPreviousCurrentRadioStationNumber(0);

        int expected = 9;
        int actual = num.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test //громкость выше
    public void shouldMaxSetNextSoundVolume() {
        Radio num = new Radio();

        num.setNextSoundVolume(101);

        int expected = 100;
        int actual = num.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test //громкость выше
    public void shouldMinSetNextSoundVolume() {
        Radio num = new Radio();

        num.setNextSoundVolume(0);

        int expected = 1;
        int actual = num.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test //громкость ниже
    public void shouldMaxSetPreviousSoundVolume() {
        Radio num = new Radio();

        num.setPreviousSoundVolume(100);

        int expected = 99;
        int actual = num.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test //громкость ниже
    public void shouldMinSetPreviousSoundVolume() {
        Radio num = new Radio();

        num.setPreviousSoundVolume(0);

        int expected = 0;
        int actual = num.getSoundVolume();

        assertEquals(expected, actual);
    }

}