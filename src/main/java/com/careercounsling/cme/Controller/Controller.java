package com.careercounsling.cme.Controller;


import com.careercounsling.cme.Repo.ProductRepository;
import com.careercounsling.cme.response.Error;
import com.careercounsling.cme.response.Success;
import com.careercounsling.cme.service.CmeService;
import com.careercounsling.cme.tables.Tenth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
//@CrossOrigin(origins = "http://localhost:8085")


@RequestMapping("/10th")
public class Controller {
    private final CmeService cmeService;
    @Autowired
    private ProductRepository productRepository;

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    public Controller(CmeService cmeService) {
        this.cmeService = cmeService;
    }


    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllUsers() {
        logger.info("success");

        if (cmeService.getTenthRecord().size() == 0) {
            return ResponseEntity.badRequest()
                    .body(new Error(HttpStatus.BAD_REQUEST, "No Record Found"));
        }


        return new ResponseEntity<>(new Success(HttpStatus.OK, cmeService.getTenthRecord()), HttpStatus.OK);
    }

    @RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllProducts() {


        return new ResponseEntity<>(new Success(HttpStatus.OK, productRepository.findAllApi()), HttpStatus.OK);
    }

    @RequestMapping(value = "/getAllStreams", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllStreams() {


        return new ResponseEntity<>(new Success(HttpStatus.OK, cmeService.Streams()), HttpStatus.OK);
    }


    @RequestMapping(value = "/getByStream/Stream/{name}", method = RequestMethod.GET)
    public ResponseEntity<Object> getStreamBasedValues(@PathVariable("name") String name) {


        return new ResponseEntity<>(new Success(HttpStatus.OK, cmeService.findByStreamName(name)), HttpStatus.OK);
    }


    @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody Tenth tenth) {
        cmeService.addCategory(tenth);
        return new ResponseEntity<>(new Success(HttpStatus.CREATED, "New Category is created successfully"), HttpStatus.CREATED);
    }


    @RequestMapping(value = "/updateCategory/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateProduct(@PathVariable("id") Integer id, @RequestBody Tenth tenth) {
        //cmeService.deleteCategory(id);

        cmeService.updateCategory(id, tenth);


        return new ResponseEntity<>(new Success(HttpStatus.OK, "Category is updated successsfully"), HttpStatus.OK);
    }


    @RequestMapping(value = "/deleteCategory/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") Integer id) {
        cmeService.deleteCategory(id);

        return new ResponseEntity<>(new Success(HttpStatus.OK, "Category is deleted successsfully"), HttpStatus.OK);
    }
}
