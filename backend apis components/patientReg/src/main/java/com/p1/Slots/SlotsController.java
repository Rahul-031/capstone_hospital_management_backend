package com.p1.Slots;

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



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/apis"})
public class SlotsController {
	@Autowired
	private SlotService ps;
	
	@PostMapping(value="/slot")
    public Slots create(@RequestBody Slots Slots){
        return ps.create(Slots);
    }
	
	@GetMapping(path = {"/{id}"})
    public Slots findOne(@PathVariable("id") int id){
        return ps.findById(id);
    }
	
	@PutMapping
    public Slots update(@RequestBody Slots Slots){
        return ps.update(Slots);
    }
	
	@DeleteMapping(path ={"/{id}"})
    public Slots delete(@PathVariable("id") int id) {
        return ps.delete(id);
    }
	
	@GetMapping(value="/Slots")
    public List findAll(){
        return ps.findAll();
    }
	
}
