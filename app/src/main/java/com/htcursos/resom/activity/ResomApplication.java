package com.htcursos.resom.activity;

import android.app.Application;

import com.htcursos.resom.migration.ClienteMigration;

import se.emilsjolander.sprinkles.Sprinkles;

public class ResomApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Sprinkles sprinkles = Sprinkles.init(getApplicationContext());
        sprinkles.addMigration(new ClienteMigration());
    }
}
