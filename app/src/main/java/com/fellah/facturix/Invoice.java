package com.fellah.facturix;

import org.json.JSONException;
import org.json.JSONObject;

class Invoice {

    private static final String NO_INFORMATION = "";
    private String name = NO_INFORMATION;
    private String address = NO_INFORMATION;
    private String email = NO_INFORMATION;
    private String tripDescription = NO_INFORMATION;
    private String vat = NO_INFORMATION;
    private String price = NO_INFORMATION;
    private String invoiceNumber = NO_INFORMATION;
    private String invoiceDate = NO_INFORMATION;

    public void setClientInformation(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public void setTrip(String tripDescription, String vat, String price) {
        this.tripDescription = tripDescription;
        this.vat = vat;
        this.price = price;
    }

    public void set(String invoiceNumber, String date) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = date;
    }

    public JSONObject toJson() {
        try {
            return new JSONObject().put("name", name)
                    .put("address", address)
                    .put("email", email)
                    .put("trip_description", tripDescription)
                    .put("vat", vat)
                    .put("price", price)
                    .put("invoice_number", invoiceNumber)
                    .put("invoice_date", invoiceDate);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new JSONObject();
    }
}
