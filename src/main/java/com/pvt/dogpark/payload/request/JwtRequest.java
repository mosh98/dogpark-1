package com.pvt.dogpark.payload.request;

import java.io.Serializable;

import lombok.Value;

@Value
public class JwtRequest implements Serializable {

	private static final long serialVersionUID = 5926468583005150707L;

	String username;
	String password;

}