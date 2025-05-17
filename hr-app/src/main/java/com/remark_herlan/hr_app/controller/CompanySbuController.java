package com.remark_herlan.hr_app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remark_herlan.hr_app.exceptions.DataNotFoundException;
import com.remark_herlan.hr_app.exceptions.InternalServerException;
import com.remark_herlan.hr_app.model.CompanySbu;
import com.remark_herlan.hr_app.model.ResponseInfo;
import com.remark_herlan.hr_app.service.CompanySbuService;

/**
 * author: Naimul Hassan
 * 
 * date: 5/17/2025
 */

@RestController
@RequestMapping("api/employee")
public class CompanySbuController {

	@Autowired
	CompanySbuService service;

	@GetMapping("all")
	public ResponseInfo<List<CompanySbu>> getAllMethod() throws InternalServerException, DataNotFoundException {
		return service.getAllInfos();
	}

	@GetMapping("/{id}")
	public ResponseInfo<Optional<CompanySbu>> getMethod(@PathVariable Long id)
			throws InternalServerException, DataNotFoundException {
		return service.getInfo(id);
	}

	@PostMapping("/add")
	public ResponseInfo<String> postMethod(@RequestBody CompanySbu companySbu) throws InternalServerException {
		return service.saveInfo(companySbu);
	}

}
