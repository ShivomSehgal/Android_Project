package com.example.androidproject;

public class DsaSubclass {
    private String dsaTopic;
    private String dsaProfLvl;
    private String dsaQuesRatio;

    public DsaSubclass(String dsaTopic, String dsaProfLvl, String dsaQuesRatio){
        this.dsaTopic = dsaTopic;
        this.dsaProfLvl = dsaProfLvl;
        this.dsaQuesRatio = dsaQuesRatio;
    }

    public String getDsaTopic() {
        return dsaTopic;
    }

    public String getDsaProfLvl() {
        return dsaProfLvl;
    }

    public String getDsaQuesRatio() {
        return dsaQuesRatio;
    }
}
