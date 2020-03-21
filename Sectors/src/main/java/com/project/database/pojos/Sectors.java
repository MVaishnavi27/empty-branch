package com.project.database.pojos;




import javax.persistence.Column;


import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;



@Entity

@Table(name = "sectors")

public class Sectors {



 @Id

 private int sectorid;



 public int getSectorid() {
	return sectorid;
}






public void setSectorid(int sectorid) {
	this.sectorid = sectorid;
}



private String sectorname;

 private String brief;



 @Override

 public String toString() {

 return "Sectors [sectorid=" + sectorid + ", sectorname=" + sectorname + ", brief=" + brief + "]";

 }






 public String getSectorname() {

 return sectorname;

 }



 public void setSectorname(String sectorname) {

 this.sectorname = sectorname;

 }



 public String getBrief() {

 return brief;

 }



 public void setBrief(String brief) {

 this.brief = brief;

 }



}


