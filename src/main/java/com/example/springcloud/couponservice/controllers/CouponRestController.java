package com.example.springcloud.couponservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcloud.couponservice.model.Coupon;
import com.example.springcloud.couponservice.repo.CouponRepository;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {
	
	@Autowired
	private CouponRepository repo;
	
	@RequestMapping(value="/coupons", method=RequestMethod.POST)
	public Coupon create(@RequestBody Coupon coupon) {
		return repo.save(coupon);	
	}
	
	@RequestMapping(value="/coupon/{code}", method=RequestMethod.GET)
	public Coupon findCoupon(@PathVariable("code") String code) {
		return repo.findByCode(code);
	}

}
