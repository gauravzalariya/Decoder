package com.example.jaymeen.foodarch;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

/**
 * Created by Jaymeen on 2/18/2017.
 */

public class SQLiteHelper extends SQLiteOpenHelper
{
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "FoodCourt.db";
    public static final String TABLE_PRODUCER = "Producer";
    public static final String TABLE_CONSUMER = "Consumer";
    public static final String EMAIL_ID = "Email_ID";
    public static final String NAME = "Name";
    public static final String PASSWORD = "Password";
    public static final String CONTACT_NO = "Contact";
    public static final String PINCODE = "Pincode";
    public static final String CUISINE_TYPE = "Cuisine_type";
    public static final String CUISINE_NAME = "Cuisine_name";
    public static final String FROM_TIME = "From_time";
    public static final String TO_TIME = "To_time";
    public static final String QUANTITY = "Quantity";
    public static final String PRICE = "Price";

    SQLiteHelper(Context context)
    {
        super(context , DATABASE_NAME , null , DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String query = "";

        query = "CREATE TABLE IF NOT EXISTS " + TABLE_CONSUMER + " ( " +
        NAME + " VARCHAR NOT NULL ," +
        EMAIL_ID + " VARCHAR PRIMARY KEY NOT NULL ," +
        PASSWORD + " VARCHAR NOT NULL ," +
        CONTACT_NO + " CHAR(10) NOT NULL ," +
        PINCODE + " CHAR(6) NOT NULL ," +
        CUISINE_TYPE + " VARCHAR NOT NULL ," +
        QUANTITY + "INTEGER NOT NULL);";

        db.execSQL(query);

        query = "CREATE TABLE IF NOT EXISTS " + TABLE_PRODUCER + " ( " +
        NAME + " VARCHAR NOT NULL ," +
        EMAIL_ID + " VARCHAR PRIMARY NOT NULL ," +
        PASSWORD + " VARCHAR NOT NULL ," +
        CONTACT_NO + " VARCHAR NOT NULL ," +
        PINCODE + " CHAR(6) NOT NULL ," +
        CUISINE_TYPE + " VARCHAR NOT NULL ," +
        CUISINE_NAME + " VARCHAR NOT NULL ," +
        PRICE + " INTEGER NOT NULL ," +
        FROM_TIME + " VARCHAR NOT NULL ," +
        TO_TIME + " VARCHAR NOT NULL);";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
