package com.app.abhi.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.abhi.entity.Employee;
import com.app.abhi.repo.MyRepositoty;
import com.app.abhi.service.IServiceEmployee;

@Service
public class ServiceEmployeeImpl implements IServiceEmployee {

	@Autowired
	private MyRepositoty repo;

	public void saveEmployee(Employee e) {

		Employee save = repo.save(e);

	}

	public Employee updateEmployee(Employee employee) {

		getOneEmployee(employee.getEmpId());
		return repo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {

		return repo.findAll();
	}

	public Employee getOneEmployee(Integer id) {

		return repo.findById(id).orElseThrow(() -> new EmployeeNotFoundException("Employee '" + id + "'not Exist"));

	}

	@Override
	public void removeEmployee(Integer id) {

		getOneEmployee(id);
		repo.deleteById(id);

	}

}
