package com.fellah.facturix;


import org.json.JSONObject;

public class Controller {

    private static final Invoice CURRENT_INVOICE = new Invoice();

    public static void setClient(String name, String address, String email) {
        CURRENT_INVOICE.setClientInformation(name,address,email);
    }

    public static void setTrip(String tripDescription, String vat, String price) {
        CURRENT_INVOICE.setTrip (tripDescription,vat,price);
    }

    public static void setInvoiceInformation(String invoiceNumber, String date) {
        CURRENT_INVOICE.set(invoiceNumber,date);

    }

    public static JSONObject getInvoice() {
        return CURRENT_INVOICE.toJson();
    }
}
