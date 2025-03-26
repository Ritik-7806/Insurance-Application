package com.Insurance.Application.Controller;

import com.Insurance.Application.Entity.Insurance;
import com.Insurance.Application.Entity.User;
import com.Insurance.Application.Repository.InsuranceRepository;
import com.Insurance.Application.Repository.UserRepository;
import com.Insurance.Application.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired private UserRepository userRepository ;
    @Autowired private UserService userService ;
    @Autowired private InsuranceRepository insuranceRepository ;

    @GetMapping("users")
    public ResponseEntity allUsers(){
        List<User> all = userRepository.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK) ;
    }

    @GetMapping("insurances")
    public ResponseEntity<?> allInsurances(){
        List<Insurance> all = insuranceRepository.findAll();
        return new ResponseEntity<>(all, HttpStatus.OK) ;
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable String id){

        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED) ;
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND) ;
    }

    @DeleteMapping("/trainer/{id}")
    public ResponseEntity<?> deleteInsurance(@PathVariable String id){

        if(insuranceRepository.existsById(id)){
            insuranceRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.ACCEPTED) ;
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND) ;
    }

    @PostMapping
    public void addInsurance(@RequestBody Insurance insurance){
        insuranceRepository.save(insurance) ;
    }

    @PostMapping("new_admin")
    public ResponseEntity<Object> newAdmin(@RequestBody User user){
        userService.saveAdmin(user) ;
        return new ResponseEntity<>(HttpStatus.OK) ;
    }

}
