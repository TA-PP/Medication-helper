/*******************************************************
 * SQLiteOpenHelper 클래스를 상속받는 유저정보 DB 클래스 정의
 * 작성 팀 : Hello World!
 * 제작자 : 안현종
 ******************************************************/

package com.cookandroid.medication_helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AutoLoginDBHelper extends SQLiteOpenHelper {
    public AutoLoginDBHelper(Context context) {
        super(context, "autoLoginDB", null, 1); // 유저정보 DB의 테이블 이름 지정
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry = "CREATE TABLE autoLoginDB ( autoID char(20) PRIMARY KEY, autoPass char(20))";
        db.execSQL(qry);
        // userTBL DB 생성
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        String qry = "DROP TABLE IF EXISTS autoLoginDB";
        db.execSQL(qry);
        onCreate(db);
        // userTBL DB 초기화(삭제 후 재생성)
    }
}
