package com.insuranceapp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuranceapp.exceptions.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;
import com.insuranceapp.repository.IInsuranceRepository;

@Service
public class InsuranceServiceImpl implements IInsuranceService {

	@Autowired
	IInsuranceRepository insuranceRepository;

	@Override
	public void addInsurance(Insurance insurance) {
		insuranceRepository.addInsurance(insurance);
	}

	@Override
	public void updateInsurance(int insuranceId, double premium) {
		insuranceRepository.updateInsurance(insuranceId, premium);
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		insuranceRepository.deleteInsurance(insuranceId);
	}

	@Override
	public List<Insurance> getAll() {
		return insuranceRepository.findAll();
	}

	@Override
	public List<Insurance> getByBrand(String brand) throws InsuranceNotFoundException {
		List<Insurance> list = insuranceRepository.findByBrand(brand);
		if(list.isEmpty()) throw new InsuranceNotFoundException("Insurance not found with brand");
		return null;
	}

	@Override
	public List<Insurance> getByBrandAndType(String brand, String type) throws InsuranceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Insurance> getByTypeAndLesserPremium(String type, double premium) throws InsuranceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Insurance getById(int insuranceId) throws InsuranceNotFoundException {
		Insurance insurance = insuranceRepository.getById(insuranceId);
		if(insurance == null) throw new InsuranceNotFoundException("Insurance not found");
		return insurance;
	}

}
