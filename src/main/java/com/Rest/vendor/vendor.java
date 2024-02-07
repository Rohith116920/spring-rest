package com.Rest.vendor;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class vendor {
	public vendor() {
		super();
	}

	public vendor(int id, String name, String address, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	int id;
	String name;
	String address;
	String phoneNumber;

}
