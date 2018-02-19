package com.fellah.facturix.activity;

import android.os.Bundle;
import android.view.View;

import com.fellah.facturix.Controller;
import com.fellah.facturix.R;

public class TripInformationActivity extends MomoActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_information);
    }

    public void toInvoiceInformation(View view) {
        saveTripInformation();

        loadActivity(this, InvoiceInformationActivy.class);

    }

    private void saveTripInformation() {
        String tripDescription = getStringFromEditText(R.id.tripDescription);
        String vat = getStringFromEditText(R.id.vat);
        String price= getStringFromEditText(R.id.price);
        Controller.setTrip(tripDescription,vat,price);
    }

}
