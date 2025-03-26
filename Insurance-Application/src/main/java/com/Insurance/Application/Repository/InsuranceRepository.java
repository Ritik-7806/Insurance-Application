package com.Insurance.Application.Repository;


import com.Insurance.Application.Entity.Insurance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceRepository extends MongoRepository<Insurance,String> {
}
