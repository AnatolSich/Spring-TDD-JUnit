package com.hanselnpetal.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="customer_contact")
public class CustomerContact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_contact_id", unique = true, nullable = false)
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String deliveryAddressLine1;
	private String deliveryAddressLine2;
	private String deliveryAddressCity;
	private String deliveryAddressState;
	private String deliveryAddressLZipCode;

}
