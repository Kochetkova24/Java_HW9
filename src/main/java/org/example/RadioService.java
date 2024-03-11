package org.example;

public class RadioService {
    private int radioStationNumber;
    private int radioVolume;
    private int radioStationLimit;

    public RadioService() {
        this.radioStationLimit = 10;
    }

    public RadioService(int radioStationLimit) {
        this.radioStationLimit = radioStationLimit;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < radioStationLimit) {
            if (newRadioStationNumber >= 0) {
                radioStationNumber = newRadioStationNumber;
            }
        }
    }

    public void next() {
        if (radioStationNumber == radioStationLimit - 1) {
            radioStationNumber = 0;
        } else {
            radioStationNumber++;
        }
    }

    public void prev() {
        if (radioStationNumber == 0) {
            radioStationNumber = radioStationLimit - 1;
        } else {
            radioStationNumber--;

        }
    }

    public int getRadioVolume() {
        return radioVolume;
    }

    public void setRadioStationVolume(int newRadioVolume) {
        if (newRadioVolume <= 100) {
            if (newRadioVolume >= 0) {
                radioVolume = newRadioVolume;

            }
        }
    }

    public void nextVolume() {
        if (radioVolume >= 100) {
            radioVolume = 100;
        } else {
            radioVolume++;
        }
    }

    public void prevVolume() {
        if (radioVolume <= 0) {
            radioVolume = 0;
        } else {
            radioVolume--;
        }
    }
}

