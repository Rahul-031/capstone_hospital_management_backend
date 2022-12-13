package com.p1.appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.p1.appointment.appointment;
import com.p1.appointment.appointmentService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/api"})
public class appointmentController {
	@Autowired
	private appointmentService as;
	
	@PostMapping(value="/appointment")
    public appointment create(@RequestBody appointment appointment){
        return as.create(appointment);
    }
	
	@GetMapping(path = {"/{id}"})
    public appointment findOne(@PathVariable("id") int id){
        return as.findById(id);
    }
	
	@PutMapping
    public appointment update(@RequestBody appointment appointment){
        return as.update(appointment);
    }
	
	@DeleteMapping(path ={"/{id}"})
    public appointment delete(@PathVariable("id") int id) {
        return as.delete(id);
    }
	
	@GetMapping(value="/appointments")
    public List findAll(){
        return as.findAll();
    }
	
}
