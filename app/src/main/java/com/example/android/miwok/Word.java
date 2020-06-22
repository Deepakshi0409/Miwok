package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;

    private String mMikowTransalation;

    public Word(String defaultTranslation, String miwokTranslation) {
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
