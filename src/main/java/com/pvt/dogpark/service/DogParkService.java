package com.pvt.dogpark.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvt.dogpark.dao.DogParkDAO;
import com.pvt.dogpark.dto.DogParkDTO;
import com.pvt.dogpark.repository.DogParkRepository;

import lombok.val;

@Service
public class DogParkService {

	@Autowired
	private DogParkRepository repository;

	public Optional<List<DogParkDTO>> findAll() {
		val result = repository.findAll();
		return buildOptional(result);
	}

	public Optional<DogParkDAO> findById(Long id) {
		return repository.findById(id);
	}

	public Optional<List<DogParkDTO>> findByName(String name) {
		val result = repository.findByName(name);
		return buildOptional(result);
	}

	public Optional<List<DogParkDTO>> findByDistance(Double latitude, Double longitude, Double distance) {
		val result = repository.findByPosition(latitude, longitude, distance);
		return buildOptional(result);
	}

	private Optional<List<DogParkDTO>> buildOptional(List<DogParkDAO> list) {
		if (list.isEmpty()) {
			return Optional.empty();
		}
		val result = list.stream()
				.map(this::convertToDTO)
				.collect(Collectors.toList());
		return Optional.of(result);
	}

	private DogParkDTO convertToDTO(DogParkDAO dogpark) {
		return new DogParkDTO(dogpark.getLatitude(),
				dogpark.getLongitude(),
				dogpark.getName(),
				dogpark.getDescription());
	}

}
