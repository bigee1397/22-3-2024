package com.insuranceapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.insuranceapp.exceptions.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;

@Mapper
public interface IInsuranceRepository {
	
	@Insert("insert into insurance (policy_name, brand, type, duration, premium) values (#{policyName},#{brand},#{type},#{duration},#{premium})")
	void addInsurance(Insurance insurance);
	
	@Update("update insurance set premium=#{premium} where insurance_id=#{insuranceId}")
	void updateInsurance(int insuranceId, double premium);
	
	@Delete("delete from insurance where insurance_id=#{insuranceId}")
	void deleteInsurance(int insuranceId);
	
	@Select("Select * from insurance")
	@Results({
			@Result(property="insuranceId", column="insurance_id"),
			@Result(property="policyName", column="policy_name")
		})
	List<Insurance> findAll();
	
	@Select("Select * from insurance where brand=#{brand}")
	@Results({
			@Result(property="insuranceId", column="insurance_id"),
			@Result(property="policyName", column="policy_name")
		})
	List<Insurance> findByBrand(String brand) throws InsuranceNotFoundException;

	@Select("Select * from insurance where brand=#{brand} and type=#{type}")
	@Results({
			@Result(property="insuranceId", column="insurance_id"),
			@Result(property="policyName", column="policy_name")
		})
	List<Insurance> findByBrandAndType(String brand, String type) throws InsuranceNotFoundException;
	
	@Select("Select * from insurance where type=#{type} and premium<=#{premium}")
	@Results({
			@Result(property="insuranceId", column="insurance_id"),
			@Result(property="policyName", column="policy_name")
		})
	List<Insurance> findByTypeAndLesserPremium(String type, double premium) throws InsuranceNotFoundException;
	
	@Select("Select * from insurance where insurance_id=#{insuranceId}")
	@Results({
			@Result(property="insuranceId", column="insurance_id"),
			@Result(property="policyName", column="policy_name")
		})
	Insurance getById(int insuranceId) throws InsuranceNotFoundException;
}
