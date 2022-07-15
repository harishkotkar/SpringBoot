package com.harish.springbootexample.service;

import com.harish.springbootexample.model.Organization;
import com.harish.springbootexample.repository.OrganizationRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class OrganizationServiceTest {


    @MockBean
    private OrganizationRepository organizationRepository;

    @Autowired
    private OrganizationService organizationService;


    @BeforeEach
    public void setUp() {

    }

    @Test
    void searchOrgnization() {
    }

    @Test
    void getOrganization() {

        organizationService.getOrganization(1l);

    }

    @Test
    void saveOrganization() {
        organizationService.saveOrganization(new Organization(1l, "HHHH", "KKKK"));

    }

}