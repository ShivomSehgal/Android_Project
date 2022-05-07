package com.example.androidproject;

public class ApSubclass {

    private  String courseName;

//    private boolean checkedOrNot;
//    private boolean notChechked = false;

    public ApSubclass(String courseName){
        this.courseName = courseName;
//        this.checkedOrNot = checkedOrNot;
    }

    public String getCourseName() {
        return courseName;
    }

//    public void setCheckedOrNot(boolean checkedOrNot) {
//        this.checkedOrNot = checkedOrNot;
//    }

//    public int isCheckedOrNot() {
//        return checkedOrNot ? 1 : 0;
//    }
}
