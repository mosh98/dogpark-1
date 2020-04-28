package com.pvt.dogpark.payload.request;

import java.io.Serializable;

import lombok.Value;

@Value
public class DogRequest implements Serializable {

	private static final long serialVersionUID = 7720549112774381157L;

	String name;
	String owner;

}