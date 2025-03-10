package com.saerok.ch.sales.model.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface SalesService {

	BigDecimal findTodaySalesTotal();

	BigDecimal findCurrentMonthSalesTotal();

	BigDecimal findCurrentYearSalesTotal();

	List<Map<String, Object>> findMonthlySalesTotals();

	List<Map<String, Object>> findCurrentMonthBranchSales();

	List<Map<String, Object>> getBranchSales(String searchKeyword, String sortOrder);

	Map<String, Object> getBranchDetailSales(Integer branchNo);

	List<Map<String, Object>> getCurrentMonthSalesByDay(Integer branchNo);
	
	
	
	//점주전용

	 //멘토님 Map<String, Object> getBranchOwnerDetailSales2(String empNo);
	 List<Map<String, Object>> getBranchOwnerDetailSales(String empNo);
	 List<Map<String, Object>> getBranchOwnerCurrentMonthSales(String empNo);
	 List<Map<String, Object>> getCurrentMonthSalesByCategoryForOwner(String empNo);

	 List<Map<String, Object>> getAllItems();
	 void addBranchSales(List<Map<String, Object>> salesDataList);

}