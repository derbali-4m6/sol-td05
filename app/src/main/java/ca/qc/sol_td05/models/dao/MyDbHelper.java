package ca.qc.sol_td05.models.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDbHelper extends SQLiteOpenHelper {

    public MyDbHelper(@Nullable Context context) {
        super(context, "contacts.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Contact (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, phoneNumber TEXT)");
        db.execSQL("INSERT INTO Contact (name, phonenumber) VALUES ('Alfred Smith', '514-222-2729')");
        db.execSQL("INSERT INTO Contact (name, phonenumber) VALUES ('William Jackson', '514-232-8831')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
