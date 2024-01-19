package com.vms.dao;
import org.springframework.data.repository.CrudRepository;
import com.vms.bean.Laptop;
public interface LaptopDAO extends CrudRepository<Laptop, Integer> {

}
