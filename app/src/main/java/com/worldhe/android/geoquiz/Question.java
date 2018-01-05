package com.worldhe.android.geoquiz;

/**
 * Created by qiranxuan on 2018/1/4.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){

        mTextResId = textResId;
        mAnswerTrue = answerTrue;

    }

    public void setTextResId(int textResId){
        mTextResId = textResId;
    }

    public void setAnswerTrue(boolean answerTrue){
        mAnswerTrue = answerTrue;
    }

    public int getTextResId(){

        return mTextResId;
    }

    public boolean getAnswerTrue(){

        return mAnswerTrue;
    }
}
