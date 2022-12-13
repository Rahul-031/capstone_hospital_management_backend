package com.p1.patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/api"})

public class patientController {
	@Autowired
	private patientService ps;
	
	@PostMapping(value="/patient")
    public patient create(@RequestBody patient patient){
        return ps.create(patient);
    }
	
	@GetMapping(path = {"/{id}"})
    public patient findOne(@PathVariable("id") int id){
        return ps.findById(id);
    }
	
	@PutMapping(path={"/{id}"})
    public int update(@PathVariable("id") int id){
        return ps.update(id);
    }
	
	@DeleteMapping(path ={"/{id}"})
    public patient delete(@PathVariable("id") int id) {
        return ps.delete(id);
    }
	
	@GetMapping(value="/patients")
    public List findAll(){
        return ps.findAll();
    }
	
}
