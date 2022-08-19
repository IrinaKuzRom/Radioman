package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//@NoArgsConstructor;
//@AllArgsConstructor;
//@Data;
public class Radio {
    private int currentRadioStation=10;
    //private int minRadioStation;
    //private int maxRadioStation;
    private int currentVolume;
    //private int minCurrentVolume;
    //private int maxCurrentVolume = 100;

    public Radio() {
    }

    public Radio(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
        //this.maxRadioStation = maxRadioStation;
        //this.currentVolume = currentVolume;
        //this.maxCurrentVolume = maxCurrentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 10) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void changePrevRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 10;
            return;
        }
        this.currentRadioStation--;
    }


    public void changeNextRadioStation() {
        if (currentRadioStation == 10) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation++;
    }


    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void currentVolumeTop() {

        if (currentVolume == 0) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < 100) {
            this.currentVolume++;
        }
    }

    public void currentVolumeDown() {
        if (currentVolume == 0) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > 0) {
            this.currentVolume--;
        }
    }

}
