package com.harish.springbootexample.controller;

import com.harish.springbootexample.exception.InactiveOrganizationException;
import com.harish.springbootexample.exception.NotFoundException;
import com.harish.springbootexample.model.Organization;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionController {

   @ExceptionHandler(value = InactiveOrganizationException.class)
   public ResponseEntity<Object> exception(InactiveOrganizationException exception) {

      Organization organization = new Organization();
      organization.setId(555l);
      organization.setFirstName("Inactive");
      return new ResponseEntity<>(organization, HttpStatus.valueOf(200));
   }

}