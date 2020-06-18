package com.example.iqtest;

import android.provider.BaseColumns;

public class IQContract {

    private IQContract(){}

    public static final class IQEntry implements BaseColumns{



        public static final String TABLE_NAME = "scoreList";
        public static final String COLUMN_CATEGORY = "category";
        public static final String RAW_SCORE = "rawScore";
        public static final String TIME_STAMP = "timeStamp";


    }

}
