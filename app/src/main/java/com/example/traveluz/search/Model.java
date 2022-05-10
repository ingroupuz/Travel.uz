package com.example.traveluz.search;

public class Model {

    private String joyNomi;
    private int joyRasmi;
    private Class launchClass;

    public Model(String joyNomi, int joyRasmi, Class launchClass) {
        this.joyNomi = joyNomi;
        this.joyRasmi = joyRasmi;
        this.launchClass=launchClass;
    }

    public String getJoyNomi() {
        return joyNomi;
    }

    public int getJoyRasmi() {
        return joyRasmi;
    }

    public Class getLaunchClass(){
        return launchClass;
    }
}