package com.example.notelist;

import android.os.Build;
import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {

    public static final String ORIGINAL_NOTE_COURSE_ID = "com.example.notelist.ORIGINAL_NOTE_COURSE_ID";
    public static final String ORIGINAL_NOTE_TITLE = "com.example.notelist.ORIGINAL_NOTE_TITLE";
    public static final String ORIGINAL_NOTE_TEXT = "com.example.notelist.ORIGINAL_NOTE_TEXT";

    public String mOriginalNotesCoursseId;
    public String mOriginalNoteTile;
    public String mOriginalNoteText;
    public boolean mIsNewlyCreated = true;

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalNotesCoursseId);
        outState.putString(ORIGINAL_NOTE_TITLE, mOriginalNoteTile);
        outState.putString(ORIGINAL_NOTE_TEXT, mOriginalNoteText);
    }

    public void restoreState(Bundle inState){
        mOriginalNotesCoursseId = inState.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalNoteTile = inState.getString(ORIGINAL_NOTE_TITLE);
        mOriginalNoteText = inState.getString(ORIGINAL_NOTE_TEXT);
    }
}
