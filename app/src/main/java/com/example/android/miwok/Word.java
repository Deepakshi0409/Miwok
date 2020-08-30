package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;

    private String mMikowTransalation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int AudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMikowTransalation = miwokTranslation;
        mAudioResourceId = AudioResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResorceId, int AudioresourceId) {
        mDefaultTranslation = defaultTranslation;
        mMikowTransalation = miwokTranslation;
        mImageResourceId = imageResorceId;
        mAudioResourceId = AudioresourceId;
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
    public int getmAudioResourceId(){return mAudioResourceId; }
}

