package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;

    private String mMikowTransalation;

    private int mImageResorceId;

    public Word(String defaultTranslation, String miwokTranslation, int ImageId) {
        mDefaultTranslation = defaultTranslation;
        mMikowTransalation = miwokTranslation;
        mImageResorceId = ImageId;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmiwokTranslation() {
        return mMikowTransalation;
    }

    public int getmImageResorceId() {return mImageResorceId; }
}
