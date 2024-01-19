package com.vms.bean;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "LSMS")
public class Laptop {
@Id
@Column(name = "laptopId")
private  int laptopId;
@Column(name = "laptopBrandName")
private  String laptopBrandName;
@Column(name = "laptopModelName")
private  String laptopModelName;
@Column(name = "laptopPrice")
private  int laptopPrice;
public Laptop(int laptopId, String laptopBrandName, String laptopModelName, int laptopPrice) {
	super();
	this.laptopId = laptopId;
	this.laptopBrandName = laptopBrandName;
	this.laptopModelName = laptopModelName;
	this.laptopPrice = laptopPrice;
}
public Laptop() {
	super();
}
public int getLaptopId() {
	return laptopId;
}
public void setLaptopId(int laptopId) {
	this.laptopId = laptopId;
}
public String getLaptopBrandName() {
	return laptopBrandName;
}
public void setLaptopBrandName(String laptopBrandName) {
	this.laptopBrandName = laptopBrandName;
}
public String getLaptopModelName() {
	return laptopModelName;
}
public void setLaptopModelName(String laptopModelName) {
	this.laptopModelName = laptopModelName;
}
public int getLaptopPrice() {
	return laptopPrice;
}
public void setLaptopPrice(int laptopPrice) {
	this.laptopPrice = laptopPrice;
}
@Override
public String toString() {
	return "Laptop [laptopId=" + laptopId + ", laptopBrandName=" + laptopBrandName + ", laptopModelName="
			+ laptopModelName + ", laptopPrice=" + laptopPrice + "]";
}

}
