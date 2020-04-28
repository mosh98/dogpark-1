package com.pvt.dogpark.payload.response;

import java.io.Serializable;

import lombok.Value;

@Value
public class DogParkResponse implements Serializable {

	private static final long serialVersionUID = 6584382150451379143L;

	Float latitude;
	Float longitude;

}