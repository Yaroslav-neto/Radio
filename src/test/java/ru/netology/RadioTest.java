package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @Test // установка количества р/ст
    public void shouldNumberStations() {
        Radio num = new Radio(28);
        assertEquals(0, num.getMinCurrentRadioStationNumber());
        assertEquals(27, num.getMaxCurrentRadioStationNumber());
        assertEquals(0, num.getCurrentRadioStationNumber());
    }

    @Test // установка количества р/ст по умолчанию
    public void shouldMinMaxNumberStations() {
        Radio num = new Radio();
        assertEquals(0, num.getMinCurrentRadioStationNumber());
        assertEquals(9, num.getMaxCurrentRadioStationNumber());
        assertEquals(0, num.getCurrentRadioStationNumber());
    }

    @Test // установка р/ст середина
    public void shouldSetCurrentRadioStationNumber() {
        Radio num = new Radio();
        num.setCurrentRadioStationNumber(8);

        assertEquals(8, num.getCurrentRadioStationNumber());
    }

    @Test // установка max р/ст
    public void shouldSetMaxCurrentRadioStationNumber() {
        Radio num = new Radio();
        num.setCurrentRadioStationNumber(9);

        assertEquals(9, num.getCurrentRadioStationNumber());
    }

    @Test // установка min р/ст
    public void shouldSetMinCurrentRadioStationNumber() {
        Radio num = new Radio();
        num.setCurrentRadioStationNumber(0);

        assertEquals(0, num.getCurrentRadioStationNumber());
    }

    @Test // установка over max р/ст
    public void shouldSetOverMaxCurrentRadioStationNumber() {
        Radio num = new Radio();
        num.setCurrentRadioStationNumber(10);

        assertEquals(0, num.getCurrentRadioStationNumber());
    }

    @Test // установка bellow min р/ст
    public void shouldSetBellowMinCurrentRadioStationNumber() {
        Radio num = new Radio();
        num.setCurrentRadioStationNumber(-1);

        assertEquals(9, num.getCurrentRadioStationNumber());
    }

    @Test // next max р/ст c установленным их количеством
    public void shouldNextMaxCurrentRadioStationNumber() {
        Radio num = new Radio(27);
        num.setCurrentRadioStationNumber(26);
        num.next();

        assertEquals(0, num.getCurrentRadioStationNumber());
    }

    @Test // prev max р/ст c установленным их количеством
    public void shouldPrevMinCurrentRadioStationNumber() {
        Radio num = new Radio(27);
        num.setCurrentRadioStationNumber(0);
        num.prev();

        assertEquals(26, num.getCurrentRadioStationNumber());
    }

    @Test //для изменения уровня громкости больше max
    public void shouldOverMaxSetSoundVolume() {
        Radio num = new Radio();
        num.setSoundVolume(100);
        num.higher();

        assertEquals(100, num.getSoundVolume());
        assertEquals(100, num.getMaxSoundVolume());
    }

    @Test//для изменения уровня громкости меньше min
    public void shouldBellowMinSoundVolume() {
        Radio num = new Radio();
        num.setSoundVolume(0);
        num.less();

        assertEquals(0, num.getSoundVolume());
        assertEquals(0, num.getMinSoundVolume());
    }


}