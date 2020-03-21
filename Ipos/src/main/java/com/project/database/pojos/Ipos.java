package com.project.database.pojos;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity

@Table(name = "ipos")

public class Ipos {
@Id
 private Integer ipoid;
@Override
public String toString() {
	return "Ipos [ipoid=" + ipoid + ", companyname=" + companyname + ", stockexchange=" + stockexchange
			+ ", pricepershare=" + pricepershare + ", totalnoofshares=" + totalnoofshares + ", opendatetime="
			+ opendatetime + ", remarks=" + remarks + "]";
}
private String companyname ;

private String stockexchange;

private Integer pricepershare ;

private Integer totalnoofshares;

private Date opendatetime ;
private String remarks;



public Integer getIpoid() {
	return ipoid;
}
public void setIpoid(Integer ipoid) {
	this.ipoid = ipoid;
}
public String getCompanyname() {
	return companyname;
}
public void setCompanyname(String companyname) {
	this.companyname = companyname;
}
public String getStockexchange() {
	return stockexchange;
}
public void setStockexchange(String stockexchange) {
	this.stockexchange = stockexchange;
}
public Integer getPricepershare() {
	return pricepershare;
}
public void setPricepershare(Integer pricepershare) {
	this.pricepershare = pricepershare;
}
public Integer getTotalnoofshares() {
	return totalnoofshares;
}
public void setTotalnoofshares(Integer totalnoofshares) {
	this.totalnoofshares = totalnoofshares;
}
public Date getOpendatetime() {
	return opendatetime;
}
public void setOpendatetime(Date opendatetime) {
	this.opendatetime = opendatetime;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}





}