package com.careercounsling.cme.Controller;

import com.careercounsling.cme.response.Error;

import com.careercounsling.cme.response.Success;
import com.careercounsling.cme.service.CmeITIService;
import com.careercounsling.cme.tables.ITI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins = "http://localhost:8085")
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "false")

@RequestMapping("/ITI")
public class ITIController {


    private final CmeITIService cmeService;


    private static final Logger logger = LoggerFactory.getLogger(ScholarShipController.class);

    @Autowired
    public ITIController(CmeITIService cmeService) {
        this.cmeService = cmeService;
    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllUsers() {
        logger.info("success");

        if (cmeService.getITIRecord().size() == 0) {
            return ResponseEntity.badRequest()
                    .body(new Error(HttpStatus.BAD_REQUEST, "No Record Found"));
        }


        return new ResponseEntity<>(new Success(HttpStatus.OK, cmeService.getITIRecord()), HttpStatus.OK);
    }


    @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody ITI twelth) {
        cmeService.addCategory(twelth);
        return new ResponseEntity<>(new Success(HttpStatus.CREATED, "New Category is created successfully"), HttpStatus.CREATED);
    }


    @RequestMapping(value = "/updateCategory/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") Long id, @RequestBody ITI twelth) {
        //cmeService.deleteCategory(id);

        cmeService.updateCategory(id, twelth);


        return new ResponseEntity<>(new Success(HttpStatus.OK, "Category is updated successsfully"), HttpStatus.OK);
    }


    @RequestMapping(value = "/deleteCategory/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") Long id) {
        cmeService.deleteCategory(id);

        return new ResponseEntity<>(new Success(HttpStatus.OK, "Category is deleted successsfully"), HttpStatus.OK);
    }
}

