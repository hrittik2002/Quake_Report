package com.example.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    long mTimeInMillisecond;

    public Earthquake(double magnitude , String location , long timeInMillisecond){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMillisecond = timeInMillisecond;
    }

    public double getMagnitude(){ return mMagnitude; }

    public String getLocation(){ return mLocation; }

    public long getTimeInMillisecond(){ return mTimeInMillisecond; }

}
