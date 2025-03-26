package com.Insurance.Application.Controller;

import com.Insurance.Application.Entity.Insurance;
import com.Insurance.Application.Entity.User;
import com.Insurance.Application.Repository.InsuranceRepository;
import com.Insurance.Application.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("public")
public class PublicController {

    @Autowired private UserService userService ;
    @Autowired private InsuranceRepository insuranceRepository ;

    @PostMapping
    public ResponseEntity<?> signup(@RequestBody User user){
        userService.saveNewUser(user) ;
        return new ResponseEntity<>(HttpStatus.CREATED) ;
    }

    @GetMapping
    public ResponseEntity<?> viewInsurances(){
        List<Insurance> all = insuranceRepository.findAll();
        return new ResponseEntity<>(all,HttpStatus.OK) ;
    }
}
