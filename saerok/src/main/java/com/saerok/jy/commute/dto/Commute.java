 package com.saerok.jy.commute.dto;

import java.sql.Date;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Commute {
	
	private int commuteNo;
	private LocalDateTime inDtime;
	private LocalDateTime outDtime;
	private String lateYN;
	private String status;
	private long overtime;
	private Date workingDay;
	private String empNo;
	
	//test
	//test111

}
