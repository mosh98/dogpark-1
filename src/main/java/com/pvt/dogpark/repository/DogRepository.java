package com.pvt.dogpark.repository;

import java.util.List;
import java.util.Optional;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pvt.dogpark.dao.DogDAO;
import com.pvt.dogpark.dto.DogDTO;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DogRepository extends CrudRepository<DogDAO, Integer> {

	public List<DogDAO> findAll();

	public Optional<DogDAO> findById(Long id);

	List<DogDAO> findByName(String name);

	List<DogDAO> findByOwner(String owner);

	public String save(DogDTO dog);

	public void deleteById(Long id);
}