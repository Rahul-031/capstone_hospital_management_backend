package com.p1.doctors;

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
@RequestMapping({"/apidoc"})
public class doctorController {
@Autowired
private doctorService ds;
@PostMapping(value="/doctor")
public doctor create(@RequestBody doctor doctor){
    return ds.create(doctor);
}

@GetMapping(path = {"/{id}"})
public List<doctor> findOne(@PathVariable("id") int id){
    return ds.findById(id);
}

@PutMapping
public doctor update(@RequestBody doctor doctor){
    return ds.update(doctor);
}

//@DeleteMapping(path ={"/{id}"})
//public doctor delete(@PathVariable("id") int id) {
//    return ds.delete(id);
//}

@GetMapping(value="/doctors")
public List findAll(){
    return ds.findAll();
}
}
