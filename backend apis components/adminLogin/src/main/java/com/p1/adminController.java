package com.p1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping({"/api"})
public class adminController {
@Autowired
private adminService as;
@PostMapping(value="/admin")
public admin create(@RequestBody admin admin){
    return as.create(admin);
}

@GetMapping(path = {"/{id}"})
public admin findOne(@PathVariable("id") int id){
    return as.findById(id);
}

@PutMapping
public admin update(@RequestBody admin admin){
    return as.update(admin);
}

@DeleteMapping(path ={"/{id}"})
public admin delete(@PathVariable("id") int id) {
    return as.delete(id);
}

@GetMapping(value="/admins")
public List findAll(){
    return as.findAll();
}
}
