package com.sudheer.stock;

import java.util.HashSet;
import java.util.Set;

public class Stock implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9110143536725821190L;
	private Integer stockId;
	private String stockCode;
	private String stockName;
	private Set<StockDailyRecord> stockDailyRecords = new HashSet<StockDailyRecord>(0);

	public Stock() {
	}

	public Stock(String stockCode, String stockName) {
		this.stockCode = stockCode;
		this.stockName = stockName;
	}

	public Stock(String stockCode, String stockName,
			Set<StockDailyRecord> stockDailyRecords) {
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.stockDailyRecords = stockDailyRecords;
	}

	public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockCode() {
		return this.stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Set<StockDailyRecord> getStockDailyRecords() {
		return this.stockDailyRecords;
	}

	public void setStockDailyRecords(Set<StockDailyRecord> stockDailyRecords) {
		this.stockDailyRecords = stockDailyRecords;
	}

}
