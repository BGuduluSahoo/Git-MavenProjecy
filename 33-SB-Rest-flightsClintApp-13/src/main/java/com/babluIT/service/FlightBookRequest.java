package com.babluIT.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.babluIT.responsebinding.flights;

@Service
public class FlightBookRequest {

	public String bookflight() {

		String url = "http://mu.mulesoft-training.com/essentials/united/flights/";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> responseEntity = rt.getForEntity(url, String.class);

		int value = responseEntity.getStatusCodeValue();

		if (value == 200) {
			return responseEntity.getBody();
		}
		return null;
	}

	public String bookflightTicket() {

		String url = "http://mu.mulesoft-training.com/essentials/united/flights/";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<flights> responseEntity = rt.getForEntity(url, flights.class);

		int value = responseEntity.getStatusCodeValue();

		if (value == 200) {
			flights body = responseEntity.getBody();

			return body.getOrigin();
		}
		return null;
	}

}
