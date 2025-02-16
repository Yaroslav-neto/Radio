package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @Test //для создания переменной номера р/ст
    public void shouldRadioStationNumber() {
        Radio num = new Radio();

        num.setCurrentRadioStationNumber(8);

        int expected = 8;
        int actual = num.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test//для получения переменной номера р/ст
    public void shouldGetCurrentRadioStationNumber() {
        Radio num = new Radio();

        num.setCurrentRadioStationNumber(-1);

        int expected = 9;
        int actual = num.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test//для изменения номера р/ст
    public void shouldSetCurrentRadioStationNumber() {
        Radio num = new Radio();

        num.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = num.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test //для создания переменной уровня громкости
    public void shouldSoundVolume() {
        Radio num = new Radio();

        num.setSoundVolume(50);

        int expected = 50;
        int actual = num.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test //для получения переменной уровня громкости
    public void shouldGetSoundVolume() {
        Radio num = new Radio();

        num.setSoundVolume(-1);

        int expected = 0;
        int actual = num.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test//для изменения уровня громкости
    public void shouldSetSoundVolume() {
        Radio num = new Radio();

        num.setSoundVolume(101);

        int expected = 100;
        int actual = num.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test //следующий канал
    public void shouldNextMaxCurrentRadioStationNumber() {
        Radio num = new Radio();
        num.setCurrentRadioStationNumber(9);

        num.next();

        int expected = 0;
        int actual = num.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test //следующий канал
    public void shouldNextMinxCurrentRadioStationNumber() {
        Radio num = new Radio();
        num.setCurrentRadioStationNumber(0);

        num.next();

        int expected = 1;
        int actual = num.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test //предыдущий канал
    public void shouldSetPreviousMaxCurrentRadioStationNumber() {
        Radio num = new Radio();
        num.setCurrentRadioStationNumber(9);

        num.prev();

        int expected = 8;
        int actual = num.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test //предыдущий канал
    public void shouldSetPreviousMinCurrentRadioStationNumber() {
        Radio num = new Radio();
        num.setCurrentRadioStationNumber(0);

        num.prev();

        int expected = 9;
        int actual = num.getCurrentRadioStationNumber();

        assertEquals(expected, actual);
    }

    @Test //громкость выше
    public void shouldSetNextMaxSoundVolume() {
        Radio num = new Radio();
        num.setSoundVolume(100);

        num.higher();

        int expected = 100;
        int actual = num.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test //громкость выше
    public void shouldSetNextMinSoundVolume() {
        Radio num = new Radio();
        num.setSoundVolume(0);

        num.higher();

        int expected = 1;
        int actual = num.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test //громкость ниже
    public void shouldSetPreviousMaxSoundVolume() {
        Radio num = new Radio();
        num.setSoundVolume(100);

        num.less();

        int expected = 99;
        int actual = num.getSoundVolume();

        assertEquals(expected, actual);
    }

    @Test //громкость ниже
    public void shouldSetPreviousMinSoundVolume() {
        Radio num = new Radio();
        num.setSoundVolume(0);

        num.less();

        int expected = 0;
        int actual = num.getSoundVolume();

        assertEquals(expected, actual);
    }

}