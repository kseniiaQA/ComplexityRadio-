package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {



    @Test
    public void shouldMaxStation()  {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentStation = 10;
        radio.setMaxStation(currentStation);
        radio.changeOnNextRadioStation();
        int  expected=10;
        assertEquals(expected, radio.getMaxStation());
    }

    @Test
    public void shouldMinStation()  {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentStation = 0;
        radio.setMinStation(currentStation);
        radio.changeOnPreviousRadioStation();
        int  expected=0;
        assertEquals(expected, radio.getMinStation());
    }

    @Test
    public void shouldMaxVolume()  {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentStation = 9;
        radio.setMaxVolumeLevel(currentStation);
        radio.volumeUpForOne();
        int  expected=9;
        assertEquals(expected, radio.getMaxVolumeLevel());
    }


    @Test
    public void shouldMinVolume()  {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentStation = 0;
        radio.setMinVolumeLevel(currentStation);
        radio.volumeDownForOne();
        int  expected=0;
        assertEquals(expected, radio.getMinVolumeLevel());
    }

    @Test
    void shouldChangeOnNextRadioStation() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentStation = 8;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldGetAndSet() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        String expected = "radio";

        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    void shouldSetCurrentRadioStationBackToZero() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentStation = 10;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentRadioStation() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentStation = -99;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.changeOnPreviousRadioStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }



    @Test
    void shouldChangeOnPreviousRadioStation() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentStation = 1;
        radio.setCurrentStation(currentStation);
        radio.changeOnPreviousRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }




    @Test
    void shouldNotChangeOnNextRadioStationIfStationIsMax() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentStation = 9;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentVolume = 11;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentVolume = -1;
        radio.setCurrentVolume(currentVolume);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentVolume = 0;
        radio.setCurrentVolume(currentVolume);
        radio.volumeDownForOne();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    void volumeUpForOne() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentVolume = 8;
        radio.setCurrentVolume(currentVolume);
        radio.volumeUpForOne();
        int expected = 9;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentVolume = 10;
        radio.setCurrentVolume(currentVolume);
        radio.volumeUpForOne();
        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void volumeDownForOne() {
        ru.netology.RadioAdvanced radio = new ru.netology.RadioAdvanced();
        int currentVolume = 7;
        radio.setCurrentVolume(currentVolume);
        radio.volumeDownForOne();
        int expected = 6;
        assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    public void shouldCreate() {
        ru.netology.RadioAdvanced Radio = new ru.netology.RadioAdvanced();
    }

    @Test
    public void shouldInitField() {
        ru.netology.RadioAdvanced Radio = new ru.netology.RadioAdvanced();
        assertNull(Radio.getName());
        assertEquals(9, Radio.getMaxStation());
        assertEquals(0, Radio.getMinStation());
        assertEquals(0, Radio.getCurrentStation());
        assertEquals(10, Radio.getMaxVolumeLevel());
        assertEquals(0, Radio.getMinVolumeLevel());
        assertEquals(0, Radio.getCurrentVolume());
        assertFalse(Radio.isOn());
    }

    @Test
    @Disabled
    public void shouldThrowNPE() {
        Radio radio = new Radio();
        assertEquals(0, radio.name.length());
    }

    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentStation);
        radio.currentStation = 5;
        assertEquals(5, radio.currentStation);
    }
}
