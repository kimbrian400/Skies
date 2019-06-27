package com.kimbrian.skies.activities;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {
    protected int theme;
    protected boolean darkTheme;
    protected boolean blackTheme;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



       /** SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        setTheme(theme = Contacts.Intents.UI.getTheme(prefs.getString("theme", "fresh")));
        //setTheme(theme = new ContactsContract.Contacts(prefs.getString("theme", "fresh")));
        darkTheme = theme == R.style.AppTheme_NoActionBar_Dark ||
                theme == R.style.AppTheme_NoActionBar_Classic_Dark;
        blackTheme = theme == R.style.AppTheme_NoActionBar_Black ||
                theme == R.style.AppTheme_NoActionBar_Classic_Black;

        Contacts.Intents.UI.setNavigationBarMode(BaseActivity.this, darkTheme, blackTheme);
    **/
        }
}