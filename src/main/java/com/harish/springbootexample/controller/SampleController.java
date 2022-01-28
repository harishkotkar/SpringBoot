package com.harish.springbootexample.controller;

import com.harish.springbootexample.model.Customer;
import com.harish.springbootexample.model.Organization;
import com.harish.springbootexample.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SampleController {

    @Autowired
    OrganizationService organizationService;

    //rest api example

    @GetMapping("/customer/{id}")
    public String getCustomer(@PathVariable int id) {
        return "getCustomer/"+id;
    }

    @GetMapping("/customer")
    public String searchCustomer(@RequestParam(name= "id", required = false, defaultValue = "5") int id, @RequestParam(name= "name", required = false, defaultValue = "World") String name) {
        return "SearchCustomer | id = "+id+ "name = "+name;
    }

    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customer;

    }

    //Data JPA Example

    @GetMapping("/Organization/{id}")
    public Organization getOrganization(@PathVariable Long id) {

        return organizationService.getOrganization(id);
    }

    @GetMapping("/Organization")
    public List<Organization> searchOrganization(@RequestParam(name= "id", required = false, defaultValue = "5") int id, @RequestParam(name= "name", required = false, defaultValue = "World") String name) {

        return organizationService.searchOrgnization(name);
    }

    @PostMapping("/Organization")
    public Organization createOrganization(@RequestBody Organization organization) {
        organizationService.saveOrganization(organization);
        return organization;

    }


}
