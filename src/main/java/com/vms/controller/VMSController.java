package com.vms.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.Repository;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vms.bean.Laptop;
import com.vms.dao.LaptopDAO;
@RestController
@CrossOrigin("*")
public class VMSController {
	@Autowired
	LaptopDAO dao;
	@PostMapping("/PerformInsert")
    public void performInsert(@RequestBody Laptop vms)
    {
 	   dao.save(vms);
    }
	@PutMapping("/PerformUpdate")
    public void performUpdate(@RequestBody Laptop vms)
    {
 	   dao.save(vms);
    }
	@DeleteMapping("/PerformDelete/{laptop_id}")
    public void performDelete(@PathVariable("laptop_id") int laptop_id)
    {
 	   dao.deleteById(laptop_id);
    }
	@GetMapping("/ViewAll")
    public List<Laptop> getAllLaptop()
    {
 	   Iterator<Laptop> it = dao.findAll().iterator();
 	   List<Laptop> list = new ArrayList<Laptop>();
 	   while(it.hasNext())
 	   {
 		   list.add(it.next());
 	   } 
 	   return list;
    }
}
