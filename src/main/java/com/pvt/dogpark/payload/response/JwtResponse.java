package com.pvt.dogpark.payload.response;

import java.io.Serializable;
import lombok.Value;

@Value
public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;

	String token;
}