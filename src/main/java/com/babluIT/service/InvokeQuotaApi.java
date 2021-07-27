package com.babluIT.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.babluIT.response.QuoteApiResponse;

@Service
public class InvokeQuotaApi {

	public String getapidata() {

		String apiurl = "https://quoters.apps.pcfone.io/api/random";

		RestTemplate templete = new RestTemplate();

		ResponseEntity<String> responseEntity = templete.getForEntity(apiurl, String.class);

		int statusCode = responseEntity.getStatusCodeValue();

		if (statusCode == 200) {
			return responseEntity.getBody();
		}
		return null;
	}

	public String getapidataresponse() {

		String apiurl = "https://quoters.apps.pcfone.io/api/random";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<QuoteApiResponse> responseEntity = rt.getForEntity(apiurl, QuoteApiResponse.class);

		int statusCode = responseEntity.getStatusCodeValue();

		if (statusCode == 200) {
			QuoteApiResponse body = responseEntity.getBody();
			return body.getValue().getQuote().toUpperCase();

		}
		return null;
	}

}
