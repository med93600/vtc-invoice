package com.fellah.facturix.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

class MomoActivity extends AppCompatActivity {
    public String getStringFromEditText(int id) {
        return ((EditText) findViewById(id)).getText().toString();

    }

    public void loadActivity(MomoActivity activity, Class<?> klass) {
        Intent intent = new Intent(activity, klass);
        startActivity(intent);
    }

}
