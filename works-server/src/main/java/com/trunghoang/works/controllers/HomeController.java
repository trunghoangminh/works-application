package com.trunghoang.works.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trunghoang.works.domains.HomePage;

/**
 * 
 * Handle all request of home page
 *
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<HomePage> getIndex() {
		List<String> items = new ArrayList<>();
		items.add("Home");
		items.add("Job");
		items.add("About us");
		items.add("Contact");
		return new ResponseEntity<>(new HomePage("Work", items), HttpStatus.OK);
	}

}
