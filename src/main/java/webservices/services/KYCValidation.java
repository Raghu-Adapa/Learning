package webservices.services;

import java.util.Map;

public interface KYCValidation {

    boolean verify(Map<String, String> headers, String payload, String url);
}
