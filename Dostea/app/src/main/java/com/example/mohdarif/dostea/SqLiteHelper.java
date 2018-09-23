package com.example.mohdarif.dostea;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class SqLiteHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="YaariDostea.db";
    public static final String TABLE_NAME="Users";
    public static final String COL_1="FIRST_NAME";
    public static final String COL_2="LAST_NAME";
    public static final String COL_3="EMAIL";
    public static final String COL_4="USERNAME";
    public static final String COL_5="PASSWORD";
    public static final String COL_6="MOBILE";
    public static final String CREATE_QUERY="create table "+TABLE_NAME
            +"("
            +COL_1+" TEXT , "
            +COL_2+" TEXT , "
            +COL_3+" TEXT , "
            +COL_4+" TEXT , "
            +COL_5+" TEXT , "
            +COL_6+" TEXT "
            +")";
    public SqLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }
    public void insertData(User DI)
    {
        SQLiteDatabase dbs=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(COL_1,DI.FIRST_NAME);
        values.put(COL_2,DI.LAST_NAME);
        values.put(COL_3,DI.EMAIL);
        values.put(COL_4,DI.USERNAME);
        values.put(COL_5,DI.PASSWORD);
        values.put(COL_6,DI.MOBILE);
        dbs.insert(TABLE_NAME,null,values);
        dbs.close();
    }
    public boolean isEmailExists(String email) {
        SQLiteDatabase dbs = this.getReadableDatabase();
        Cursor cursor = dbs.query(TABLE_NAME,// Selecting Table
                new String[]{COL_3},//Selecting columns want to query
                COL_3 + "=?",
                new String[]{email},//Where clause
                null, null, null);

        if (cursor != null && cursor.moveToFirst()&& cursor.getCount()>0) {
            //if cursor has value then in user database there is user associated with this given email so return true
            return true;
        }
        //if email does not exist return false
        return false;
    }
    public boolean isUsernameExists(String username) {
        SQLiteDatabase dbs = this.getReadableDatabase();
        Cursor cursor = dbs.query(TABLE_NAME,// Selecting Table
                new String[]{COL_4},//Selecting columns want to query
                COL_4 + "=?",
                new String[]{username},//Where clause
                null, null, null);

        if (cursor != null && cursor.moveToFirst()&& cursor.getCount()>0) {
            //if cursor has value then in user database there is user associated with this given email so return true
            return true;
        }
        return false;
    }

    public int Authenticate(User DI) {

        int id=-1;
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor cursor=db.rawQuery("SELECT * FROM Users WHERE USERNAME=? AND PASSWORD=?",new String[]{DI.getUsername(),DI.getPassword()});
        if(cursor.getCount()>0) {
            cursor.moveToFirst();
            id=cursor.getInt(0);
            cursor.close();
        }
        return id;
    }
    public void deleteRow(String value)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, COL_3 + "= ?" + value,null);
        db.close();
    }

}
