package com.example.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    long mTimeInMillisecond;
    private String mUrl;

    public Earthquake(double magnitude , String location , long timeInMillisecond , String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMillisecond = timeInMillisecond;
        mUrl = url;
    }

    public double getMagnitude(){ return mMagnitude; }

    public String getLocation(){ return mLocation; }

    public long getTimeInMillisecond(){ return mTimeInMillisecond; }

    public String getUrl(){ return mUrl; }

}
