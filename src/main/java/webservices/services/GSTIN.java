package webservices.services;

import java.util.Map;

public class GSTIN implements KYCValidation{


    @Override
    public boolean verify(Map<String, String> headers, String payload, String url){

        // send a request to bank and get the exact status
        System.out.println("sout method called !");

        return true;
    }


    public boolean getStatus(String bank){

        // send a request to bank and get the exact status
        System.out.println("sout method called !");

        return true;
    }

}
