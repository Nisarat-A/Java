package com.nisar;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private  String engine;
    private String colour;
    //setter
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setModel(String model){
        String ValidaModel = model.toLowerCase();
        if (ValidaModel.equals("carrera") || ValidaModel.equals("commodore")){
            this.model =model;
        }else {
            this.model = "Unknown";
        }

    }
    //getter

    public String getModel() {
        return model;
    }
}
