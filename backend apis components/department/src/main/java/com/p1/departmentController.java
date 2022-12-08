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
public class departmentController {
@Autowired
private departmentService ds;
@PostMapping(value="/department")
public department create(@RequestBody department department){
    return ds.create(department);
}

@GetMapping(path = {"/{id}"})
public department findOne(@PathVariable("id") int id){
    return ds.findById(id);
}

@PutMapping
public department update(@RequestBody department department){
    return ds.update(department);
}

@DeleteMapping(path ={"/{id}"})
public department delete(@PathVariable("id") int id) {
    return ds.delete(id);
}

@GetMapping(value="/departments")
public List findAll(){
    return ds.findAll();
}
}
