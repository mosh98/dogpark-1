package com.pvt.dogpark.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pvt.dogpark.dao.DogParkDAO;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DogParkRepository extends CrudRepository<DogParkDAO, Integer> {

	public List<DogParkDAO> findAll();

	public Optional<DogParkDAO> findById(Long id);

	public List<DogParkDAO> findByName(String name);

	@Query("FROM DogParkDAO WHERE (6373 * acos (cos ( radians(?1) )* cos( radians( latitude ) )* cos( radians( longitude ) - radians(?2) )+ sin ( radians(?1) )* sin( radians( latitude ) )))"
			+ " < ?3 ")

	// "FROM DogPark"
	// +" WHERE (6371392.896 * acos(cos(radians(?1))*cos(radians(latitude))"
	// + "*cos(radians(longitude)-radians(?2)
	// )+sin(radians(?1))*sin(radians(latitude))))"
	// + " WHERE 2 * 3961 * asin(sqrt(power((sin(radians((latitude - ?1) / 2))), 2)"
	// + " + cos(radians(?1)) * cos(radians(latitude)) *
	// power((sin(radians((longitude - ?2) / 2))) , 2) ))"
	// + " WHERE (3959 *acos(cos(radians(?1)) * cos(radians(latitude)) *
	// cos(radians(longitude) - radians(?2)) + sin(radians(?1)) *
	// sin(radians(latitude))))"
	// + " < ?3")
	List<DogParkDAO> findByPosition(Double latitude2, Double longitude2, Double distance2);

}