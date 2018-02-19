package com.fellah.facturix.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fellah.facturix.Controller;
import com.fellah.facturix.R;

public class ClientInformationActivity extends MomoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_information);
    }

    public void toTripInformation(View view) {

        saveClientInformation();


        loadActivity(this,TripInformationActivity.class);

    }



    private void saveClientInformation() {
        String name = getStringFromEditText(R.id.name);
        String address = getStringFromEditText(R.id.address);
        String email = getStringFromEditText(R.id.email);
        Controller.setClient(name,address,email);
    }


}
