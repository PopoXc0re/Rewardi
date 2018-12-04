package com.example.danip.rewardi;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    private static final String RegisterRequestUrl = "http://37.60.168.102/api/Auth/register";
    private Map<String, String> params;

    public RegisterRequest(String email, String password, Response.Listener<String> listener){
        super(Method.POST, RegisterRequestUrl, listener, null);
        params = new HashMap<>();
        params.put("emailAddress", email);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
