package com.bridgelabz.javaio;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class EmployeePayrollServiceTest {

	@Test
	public void given3Employees_WhenWrittenToFile_ShouldMatchTotalEntries() {
		EmployeePayrollData[] arrayOfEmployee= {
				new EmployeePayrollData(1, "Sampada", 10000.0),
				new EmployeePayrollData(2, "Sid", 20000.0),
				new EmployeePayrollData(3, "V", 30000.0)
		};
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployee));
		employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
		long entries=employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
		assertEquals(3,entries);
	}

}
