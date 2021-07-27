package com.babluIT.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.babluIT.service.FlightBookRequest;

@RestController
public class GetBookFlightData {

	@Autowired
	private FlightBookRequest fbr;

	@GetMapping("/fbook")
	public String bookticket() {

		return fbr.bookflight();

	}

	@GetMapping("/fbookTicket")
	public String bookticketresponse() {

		return fbr.bookflightTicket();

	}

}
