package com.htcursos.resom.migration;

import android.database.sqlite.SQLiteDatabase;

import se.emilsjolander.sprinkles.Migration;

public class ClienteMigration extends Migration{
    @Override
    protected void doMigration(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE Cliente (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "name TEXT," +
                "email TEXT," +
                "cpf TEXT," +
                "cel TEXT," +
                "image INTEGER)");
    }
}
