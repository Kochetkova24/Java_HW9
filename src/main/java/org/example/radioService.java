package org.example;

public class radioService {
    private int radioStationNumber;
    private int radioVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber <= 9) {
            if (newRadioStationNumber >= 0) {
                radioStationNumber = newRadioStationNumber;
            }
        }
    }

    public void next() {
        if (radioStationNumber == 9) {
            radioStationNumber = 0;
        } else {
            radioStationNumber++;
        }
    }

    public void prev() {
        if (radioStationNumber == 0) {
            radioStationNumber = 9;
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

