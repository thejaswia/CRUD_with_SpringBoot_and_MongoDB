package com.icl.placement.web.rest;

import com.icl.placement.domain.Company;
import com.icl.placement.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/company/all")
    public List<Company> getAllCompanies(){
        return companyService.getAllCompanies();
    }

    @RequestMapping("/company/{id}")
    public Company getCompany(@PathVariable Integer id){
        return companyService.getCompany(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/company")
    public void addCompany(@RequestBody Company company) {
        companyService.addCompany(company);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/company/{id}")
    public void updateCompany(@RequestBody Company company, @PathVariable Integer id) {
        companyService.updateCompany(company,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/company/{id}")
    public void deleteCompany(@PathVariable Integer id) {
        companyService.deleteCompany(id);
    }

}
