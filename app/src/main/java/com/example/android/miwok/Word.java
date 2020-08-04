package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;

    private String mMikowTransalation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMikowTransalation = miwokTranslation;

    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResorceId) {
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

    public int getImageResorceId() {return mImageResourceId; }
        public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
        }

}

