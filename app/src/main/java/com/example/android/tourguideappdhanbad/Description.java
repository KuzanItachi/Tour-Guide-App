package com.example.android.tourguideappdhanbad;

public class Description {
    private String mAddress;

    private int mResourceID;
    private static final String no_string = "";
    private String mTimings = no_string;
    private String mTitle;


    // constructor for all activity except religious activity
    public Description(String Address, String Timing, int imageID, String title) {
        mAddress = Address;
        mTimings = Timing;
        mResourceID = imageID;
        mTitle = title;
    }

    // constructor for religious activity
    public Description(String Address, int imageID, String title) {
        mAddress = Address;
        mResourceID = imageID;
        mTitle = title;
    }

    public int getmResourceID() {
        return mResourceID;
    }

    public String getmAddress() {
        return mAddress;
    }

    public String getmTimings() {
        return mTimings;
    }

    public String getmTitle() {
        return mTitle;
    }
}
