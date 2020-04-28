package com.pvt.dogpark.payload.request;

import java.io.Serializable;

import lombok.Value;

@Value
public class DogParkRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150701L;

	Float latitude;
	Float longitude;
	Float distance;

}