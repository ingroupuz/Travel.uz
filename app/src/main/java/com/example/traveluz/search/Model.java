package com.example.traveluz.search;

public class Model {

    private String joyNomi;
    private int joyRasmi;

    public Model(String joyNomi, int joyRasmi) {
        this.joyNomi = joyNomi;
        this.joyRasmi = joyRasmi;
    }

    public String getJoyNomi() {
        return joyNomi;
    }

    public void setJoyNomi(String joyNomi) {
        this.joyNomi = joyNomi;
    }

    public int getJoyRasmi() {
        return joyRasmi;
    }

    public void setJoyRasmi(int joyRasmi) {
        this.joyRasmi = joyRasmi;
    }
}