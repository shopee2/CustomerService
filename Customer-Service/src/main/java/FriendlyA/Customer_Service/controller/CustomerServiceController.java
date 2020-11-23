package FriendlyA.Customer_Service.controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


import FriendlyA.Customer_Service.bean.UserResponse;

@CrossOrigin
@RestController
public class CustomerServiceController {
    @RequestMapping(value = "/getUserProfile", method = RequestMethod.GET)
    public ResponseEntity<UserResponse> hello() throws JsonParseException, JsonMappingException, IOException {
    	ObjectMapper mapper = new ObjectMapper();

    	OkHttpClient client = new OkHttpClient();

    	Request request = new Request.Builder()
    	   .url("https://sop-picnic.azurewebsites.net/profile/pSFcMeuEtuY8PyVUdkYDtcCMCSi1")
    	   .build(); // defaults to GET

    	Response response = client.newCall(request).execute();

    	UserResponse apod = mapper.readValue(response.body().byteStream(), UserResponse.class);


        return new ResponseEntity<UserResponse>(apod, HttpStatus.OK);
    }
}	