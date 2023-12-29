package com.vms.dao;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.vms.bean.Laptop;
public interface LaptopDAO extends CrudRepository<Laptop, Integer> {

}
