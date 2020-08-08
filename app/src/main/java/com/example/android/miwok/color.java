package com.example.android.miwok;

public class color {
    private String mDefaultTranslation;

    private String mMikowTransalation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public color(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMikowTransalation = miwokTranslation;
    }
    public color(String defaultTranslation, String miwokTranslation, int imageResorceId) {
        mDefaultTranslation = defaultTranslation;
        mMikowTransalation = miwokTranslation;
        mImageResourceId = imageResorceId;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmiwokTranslation() {
        return mMikowTransalation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
    
}
