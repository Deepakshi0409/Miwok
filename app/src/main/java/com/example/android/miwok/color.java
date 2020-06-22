package com.example.android.miwok;

public class color {
    private String mDefaultTranslation;

    private String mMikowTransalation;

    public color(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMikowTransalation = miwokTranslation;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmiwokTranslation() {
        return mMikowTransalation;
    }
}
