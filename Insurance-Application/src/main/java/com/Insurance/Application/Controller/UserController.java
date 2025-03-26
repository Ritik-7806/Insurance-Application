package com.Insurance.Application.Controller;

import com.Insurance.Application.Entity.Insurance;
import com.Insurance.Application.Repository.InsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


@RestController
@RequestMapping("insurance")
public class UserController {

    @Autowired
    private InsuranceRepository insuranceRepository ;

    @GetMapping
    public ResponseEntity<?> getAllInsurance(){
        List<Insurance> insurances = insuranceRepository.findAll() ;
        return new ResponseEntity<>(insurances, HttpStatus.OK) ;
    }

    @PostMapping
    public ResponseEntity<?> purchaseInsurance(@PathVariable String name){
        return new ResponseEntity<>(name,HttpStatus.OK) ;
    }

    @GetMapping("download")
    public ResponseEntity<?> downloadPolicy() throws IOException {
        File file = ResourceUtils.getFile("classpath:dummy.pdf");
        InputStream inputStream = new FileInputStream(file);
        byte[] fileBytes = inputStream.readAllBytes();
        inputStream.close();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/pdf");
        headers.add("Content-Disposition", "attachment; filename=dummy.pdf");
        return new ResponseEntity<>(fileBytes, headers, HttpStatus.OK);
    }

}
