package br.com.chronotrack.api.entities;

import java.time.ZonedDateTime;

public class Registry {

    private ZonedDateTime firstEntry;
    private ZonedDateTime firstExit;
    private ZonedDateTime secondEntry;
    private ZonedDateTime secondExit;
    private ZonedDateTime thirdEntry;
    private ZonedDateTime thirdExit;
    private ZonedDateTime fourthEntry;
    private ZonedDateTime fourthExit;

    public Registry() {
    }

    public Registry(ZonedDateTime firstEntry, ZonedDateTime firstExit, ZonedDateTime secondEntry, ZonedDateTime secondExit, ZonedDateTime thirdEntry, ZonedDateTime thirdExit, ZonedDateTime fourthEntry, ZonedDateTime fourthExit) {
        this.firstEntry = firstEntry;
        this.firstExit = firstExit;
        this.secondEntry = secondEntry;
        this.secondExit = secondExit;
        this.thirdEntry = thirdEntry;
        this.thirdExit = thirdExit;
        this.fourthEntry = fourthEntry;
        this.fourthExit = fourthExit;
    }

    public ZonedDateTime getFirstEntry() {
        return firstEntry;
    }

    public void setFirstEntry(ZonedDateTime firstEntry) {
        this.firstEntry = firstEntry;
    }

    public ZonedDateTime getFirstExit() {
        return firstExit;
    }

    public void setFirstExit(ZonedDateTime firstExit) {
        this.firstExit = firstExit;
    }

    public ZonedDateTime getSecondEntry() {
        return secondEntry;
    }

    public void setSecondEntry(ZonedDateTime secondEntry) {
        this.secondEntry = secondEntry;
    }

    public ZonedDateTime getSecondExit() {
        return secondExit;
    }

    public void setSecondExit(ZonedDateTime secondExit) {
        this.secondExit = secondExit;
    }

    public ZonedDateTime getThirdEntry() {
        return thirdEntry;
    }

    public void setThirdEntry(ZonedDateTime thirdEntry) {
        this.thirdEntry = thirdEntry;
    }

    public ZonedDateTime getThirdExit() {
        return thirdExit;
    }

    public void setThirdExit(ZonedDateTime thirdExit) {
        this.thirdExit = thirdExit;
    }

    public ZonedDateTime getFourthEntry() {
        return fourthEntry;
    }

    public void setFourthEntry(ZonedDateTime fourthEntry) {
        this.fourthEntry = fourthEntry;
    }

    public ZonedDateTime getFourthExit() {
        return fourthExit;
    }

    public void setFourthExit(ZonedDateTime fourthExit) {
        this.fourthExit = fourthExit;
    }
}
