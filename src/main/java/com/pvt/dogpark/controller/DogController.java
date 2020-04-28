package com.pvt.dogpark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pvt.dogpark.dto.DogDTO;
import com.pvt.dogpark.payload.request.DogRequest;
import com.pvt.dogpark.service.DogService;

@RestController
@RequestMapping(path = "/dog")
public class DogController {

	@Autowired
	private DogService service;

	@GetMapping(path = "/find", params = "all")
	public ResponseEntity<?> findAll() {
		var result = service.findAll();
		return ResponseEntity.of(result);
	}

	@GetMapping(path = "/find", params = "id")
	public ResponseEntity<?> findById(@RequestParam Long id) {
		var result = service.findById(id);
		return ResponseEntity.of(result);
	}

	@GetMapping(path = "/find", params = "name")
	public ResponseEntity<?> findByName(@RequestParam String name) {
		var result = service.findByName(name);
		return ResponseEntity.of(result);
	}

	@GetMapping(path = "/find", params = "owner")
	public ResponseEntity<?> findByOwner(@RequestParam String owner) {
		var result = service.findByOwner(owner);
		return ResponseEntity.of(result);
	}

	@PostMapping(path = "/register", params = { "name", "owner" })
	public ResponseEntity<?> register(@RequestParam String name, @RequestParam String owner) {
		var dog = new DogDTO(name, owner);
		return ResponseEntity.ok(service.save(dog));
	}

	@PostMapping(path = "/register")
	public ResponseEntity<?> register(@RequestBody DogRequest request) {
		var dog = new DogDTO(request.getName(), request.getOwner());
		return ResponseEntity.ok(service.save(dog));
	}

	@DeleteMapping(path = "/delete", params = "id")
	public ResponseEntity<?> deleteById(@RequestParam Long id) {
		var result = service.deleteById(id);
		return ResponseEntity.of(result);
	}
}
