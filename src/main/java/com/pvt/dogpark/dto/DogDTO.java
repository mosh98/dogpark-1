package com.pvt.dogpark.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
// Det som står i JSON Body ex { "username":"namn", "password":"hemligt" }
public class DogDTO {

	private String name;
	private String owner;

}