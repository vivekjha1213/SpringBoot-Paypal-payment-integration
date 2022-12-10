package com.vivek.spring.paypal.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class model {

	private double price;
	private String currency;
	private String method;
	private String intent;
	private String description;

}

