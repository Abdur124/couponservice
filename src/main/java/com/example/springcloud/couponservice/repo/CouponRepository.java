package com.example.springcloud.couponservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springcloud.couponservice.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
