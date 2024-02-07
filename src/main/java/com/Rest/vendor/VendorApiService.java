package com.Rest.vendor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor")
class PersonController {
	vendor vendor;

	@GetMapping("/get")
	public vendor callvendor() {
		return this.vendor;
	}

	@PostMapping("/post")
	public String createVendor(@RequestBody vendor vendor) {
//		System.out.println(vendor.getAddress());
//		return "success";
		this.vendor=vendor;	
		return vendor.getName();

	}
	@PutMapping("/put")
	public String updateVendor(@RequestBody vendor vendor) {
		this.vendor = vendor;
		return vendor.getName();
	}
	@DeleteMapping("/delete")
	public String deleteVendor(@RequestBody vendor vendor) {
		this.vendor = null;
		return "deleted";
	}
	
	

}
