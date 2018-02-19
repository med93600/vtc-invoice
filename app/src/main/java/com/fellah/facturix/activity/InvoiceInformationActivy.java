package com.fellah.facturix.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fellah.facturix.Controller;
import com.fellah.facturix.R;

import org.json.JSONObject;


public class InvoiceInformationActivy extends MomoActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invoice_information);
    }

    public void send(View view) {
        saveInvoiceInformation();
        sendInvoice();

        loadActivity(this, ClientInformationActivity.class);
    }
    private void sendInvoice() {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="https://script.google.com/macros/s/AKfycbzL_bUxrnaGxw_TKdez6C27LZnZuhqEQwKzCBXif795uHpFrYJa/exec";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, url, Controller.getInvoice(), new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        queue.add(request);
    }

    private void saveInvoiceInformation() {
        String invoiceNumber = getStringFromEditText(R.id.invoiceNumber);
        String date = getStringFromEditText(R.id.invoiceDate);
        Controller.setInvoiceInformation(invoiceNumber, date);
    }
}
