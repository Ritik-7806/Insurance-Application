package com.Insurance.Application.Service;

import com.Insurance.Application.Entity.Insurance;
import com.Insurance.Application.Repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceService {

    @Autowired
    private InsuranceRepository insuranceRepository ;

    public boolean saveInsurance(Insurance insurance){
        insuranceRepository.save(insurance) ;
        return true ;
    }
}
