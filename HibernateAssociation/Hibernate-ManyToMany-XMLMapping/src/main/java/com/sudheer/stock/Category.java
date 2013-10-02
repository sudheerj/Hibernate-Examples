package com.sudheer.stock;

import java.util.HashSet;
import java.util.Set;

public class Category implements java.io.Serializable {

	private Integer categoryId;
	private String name;
	private String desc;
	private Set<Stock> stocks = new HashSet<Stock>(0);

	public Category() {
	}

	public Category(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}

	public Category(String name, String desc, Set<Stock> stocks) {
		this.name = name;
		this.desc = desc;
		this.stocks = stocks;
	}

	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Set<Stock> getStocks() {
		return this.stocks;
	}

	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}

}