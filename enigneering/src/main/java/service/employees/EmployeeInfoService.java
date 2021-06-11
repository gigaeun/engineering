package service.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import model.EmployeeDTO;
import repository.EmployeeRepository;

public class EmployeeInfoService {
	@Autowired
	EmployeeRepository employeeRepository;
	public void empInfo(String empNo, Model model) {
		EmployeeDTO dto = employeeRepository.empInfo(empNo); // 직원 정보 다 받아오기 위해서
		model.addAttribute("emp", dto);
	}
}
