package com.example.iqtest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import static com.example.iqtest.IQContract.*;

public class IQDbHelper extends SQLiteOpenHelper {

    public static final String  DATABASE_NAME = "IQScores.db";
    public static final int DATABASE_VERSION = 1;



    public IQDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        final String SQL_CREATE_IQ_SCORE_TABLE = "CREATE TABLE " +
                IQEntry.TABLE_NAME + " (" +
                IQEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                IQEntry.COLUMN_CATEGORY + "TEXT NOT NULL, " +
                IQEntry.RAW_SCORE + "INTEGER NOT NULL, " +
                IQEntry.TIME_STAMP + "TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                ");";

        db.execSQL(SQL_CREATE_IQ_SCORE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + IQEntry.TABLE_NAME);
        onCreate(db);

    }
}
