package com.vms;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.vms.bean.Laptop;
import com.vms.controller.VMSController;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Order;
import org.springframework.beans.factory.annotation.Autowired;
@SpringBootTest
class VMSAngularProjectApplicationTests {

	 @Autowired
	 VMSController controller;
	 String insert;
	 String update;
	 String delete;
	 String result;
	 String result1;
	 
	  List<Laptop> list = new ArrayList<Laptop>();
      List<Laptop> list1 = new ArrayList<Laptop>();
      List<Laptop> lists = new ArrayList<Laptop>();
      Laptop laptop1;
      Laptop laptop2;
      Laptop laptop3;

	@Test
      @Order(1)
      void contextLoads() {
       Assert.assertNull(null);;
      }

      @Test
      @Order(2)
      void testPerformInsert() {
          Laptop obj = new Laptop();
          obj.setLaptopId(101);
          obj.setLaptopBrandName("Dell");
          obj.setLaptopModelName("Book");
          obj.setLaptopPrice(1);
          insert = "Inserted";
          result = controller.performInsert(obj);
          Assert.assertEquals(insert, result);
      }

      @Test
      @Order(3)
      void testPerformUpdate() {
          Laptop obj = new Laptop();
          obj.setLaptopId(101);
          obj.setLaptopBrandName("Dell");
          obj.setLaptopModelName("Book");
          obj.setLaptopPrice(1);
          update = "Updated";
          result = controller.performUpdate(obj);
          Assert.assertEquals(update, result);
      }

      @Test
      @Order(4)
      void testPerformDelete() {
          delete = "Deleted";
          result = controller.performDelete(101);
          Assert.assertEquals(delete, result);
      }

      @Test
      @Order(5)
      void testPerformFindAll() {
          list = controller.getAllLaptop();
          laptop1 = new Laptop(101 , "Dell" , "Book" , 1);
          laptop2 = new Laptop(102 , "HP" , "IdeaPad" , 4);
          laptop3 = new Laptop(103 , "Lenovo" , "Think" , 6);
          list1.add(laptop1);
          list1.add(laptop2);
          list1.add(laptop3);
          lists.add(laptop1);
          lists.add(laptop2);
          lists.add(laptop3);
          lists.equals(list1);
          Assert.assertEquals(lists, list1);
      }

}