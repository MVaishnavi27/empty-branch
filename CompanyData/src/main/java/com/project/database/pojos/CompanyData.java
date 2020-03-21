package com.project.database.pojos;

import java.util.List;

import javax.persistence.Column;


import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;
import javax.persistence.Transient;

@Entity

@Table(name = "companydata")

public class CompanyData {

	@Id

	private String companyname;
	@Override
	public String toString() {
		return "CompanyData [companyname=" + companyname + ", turnover=" + turnover + ", ceoname=" + ceoname + ", bod="
				+ bod + ", listedinse=" + listedinse + ", sector=" + sector + ", remarks=" + remarks + ", stockcode="
				+ stockcode + "]";
	}

	private int turnover;

	private String ceoname;

	private String bod;

	private int listedinse;

	private String sector;

	private String remarks;

	private int stockcode;
	@Transient
	List<StockPrice> stockPriceList;
	public List<StockPrice> getStockPriceList() {
		return stockPriceList;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public int getTurnover() {
		return turnover;
	}

	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}

	public String getCeoname() {
		return ceoname;
	}

	public void setCeoname(String ceoname) {
		this.ceoname = ceoname;
	}

	public String getBod() {
		return bod;
	}

	public void setBod(String bod) {
		this.bod = bod;
	}

	public int getListedinse() {
		return listedinse;
	}

	public void setListedinse(int listedinse) {
		this.listedinse = listedinse;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getStockcode() {
		return stockcode;
	}

	public void setStockcode(int stockcode) {
		this.stockcode = stockcode;
	}

	public void setStockPriceList(List<StockPrice> findByCompanyname) {
		// TODO Auto-generated method stub
		
	}

	
}

	