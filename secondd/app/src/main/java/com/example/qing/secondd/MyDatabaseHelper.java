package com.example.qing.secondd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    public static final String CREATE_BOOK="create table Book(" +
            "id interger primary key autoincrement," +
            "author text," +
            "peice real," +
            "pages integer," +
            "name text)";
    private Context mContext;

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
        mContext=context;
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Toast.makeText(mContext,"Create db succeed!",Toast.LENGTH_LONG).show();
        sqLiteDatabase.execSQL(CREATE_BOOK);
        Toast.makeText(mContext,"Create db succeed!",Toast.LENGTH_LONG).show();
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
