package com.example.saghe.getdestiny;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBmanager extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "getdestiny.db";
    public static final String TABLE_NAME = "general_table";
    public static final String CL_1 = "FULLNAME";
    public static final String CL_2 = "EMAIL";
    public static final String CL_3 = "MOBILENUMBER";
    public static final String CL_4 = "CNIC";
    public static final String CL_5 = "PASSWORD";

    public DBmanager(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //String qry="create table general_table (fullname text,email text,mobile integer primary key,cnic integer,password text)";
        db.execSQL("create table " + TABLE_NAME + "(fullname text,email text,mobile integer primary key,cnic integer,password text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
}
