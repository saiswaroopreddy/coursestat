package com.lwl.jackson;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee implements Serializable {
		private static final long serialVersionUID = 1L;
		private int empno;
		private String ename;
		private Address address;
		private List<String> emails;
		private boolean workingStatus;
		private float salary;
		
		
		
}
