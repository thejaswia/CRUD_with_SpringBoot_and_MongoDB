package com.icl.placement.repository;

import com.icl.placement.domain.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company, Integer> {
}
