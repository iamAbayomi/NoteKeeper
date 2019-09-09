package com.appdot.io.notekeeper;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {

    public static  final String ORIGINAL_NOTE_COURSE_ID ="com.appdot.io.notekeeper.ORIGINAL_NOTE_COURSE_ID";
    public static  final String ORIGINAL_NOTE__TITLE ="com.appdot.io.notekeeper.ORIGINAL_NOTE_TITLE";
    public static final String ORIGINAL_NOTE_TEXT ="com.appdot.io.notekeeper.ORIGINAL_NOTE_TEXT";

    public String mOriginalNoteCourseId;
    public String mOriginalNoteText;
    public String mOriginalNoteTitle;

    public boolean mIsNewlyCreated = true;

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalNoteCourseId);
        outState.putString(ORIGINAL_NOTE__TITLE, mOriginalNoteTitle);
        outState.putString(ORIGINAL_NOTE_TEXT, mOriginalNoteText);
    }


    public void restoreStaate(Bundle isState){
        mOriginalNoteCourseId = isState.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalNoteTitle = isState.getString(ORIGINAL_NOTE__TITLE);
        mOriginalNoteText = isState.getString(ORIGINAL_NOTE_TEXT);
    }


}
