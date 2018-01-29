package com.icl.placement.service;


import com.icl.placement.domain.Company;
import com.icl.placement.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@EnableMongoRepositories(basePackageClasses = CompanyRepository.class )
@Configuration
public class CompanyService {

    private String Name = "Hello world";

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies() {

        return companyRepository.findAll();
    }


    public void addCompany(Company company) {

        companyRepository.save(company);
    }


    public Company getCompany(Integer id) {

        return companyRepository.findOne(id);
    }


    public void updateCompany(Company company, Integer id) {

        companyRepository.save(company);
    }


    public void deleteCompany(Integer id) {

        companyRepository.delete(id);
    }

}

