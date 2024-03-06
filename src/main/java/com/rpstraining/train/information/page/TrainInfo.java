package com.rpstraining.train.information.page;

public class TrainInfo {


    private Integer trainID;

    private String trainName;

    private Integer numberOfCoaches;

    private String fromStation;

    private String toStation;

    public TrainInfo(Integer trainID, String trainName, Integer numberOfCoaches, String fromStation, String toStation) {
        this.trainID = trainID;
        this.trainName = trainName;
        this.numberOfCoaches = numberOfCoaches;
        this.fromStation = fromStation;
        this.toStation = toStation;
    }

    public TrainInfo() {
    }

    public Integer getTrainID() {
        return trainID;
    }

    public void setTrainID(Integer trainID) {
        this.trainID = trainID;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Integer getNumberOfCoaches() {
        return numberOfCoaches;
    }

    public void setNumberOfCoaches(Integer numberOfCoaches) {
        this.numberOfCoaches = numberOfCoaches;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }
}
