package com.vms.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.vms.bean.Laptop;
import com.vms.dao.LaptopDAO;
@RestController
@CrossOrigin("http://localhost:4200") //@CrossOrigin("*")
public class VMSController {
	@Autowired
	LaptopDAO dao;
	@PostMapping("/PerformInsert")
    public String performInsert(@RequestBody Laptop vms)
    {
 	   dao.save(vms);
	return "Inserted";
    }
	@PutMapping("/PerformUpdate")
    public String performUpdate(@RequestBody Laptop vms)
    {
 	   dao.save(vms);
	return "Updated";
    }
	@DeleteMapping("/PerformDelete/{laptop_id}")
    public String performDelete(@PathVariable("laptop_id") int laptopid)
    {
 	   dao.deleteById(laptopid);
	return "Deleted";
    }
}
