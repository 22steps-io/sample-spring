import com.sidda.service.EmployeeService;
import com.sidda.service.EmployeeServiceImpl;

public class Application {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		System.out.println("Data : "+employeeService.findAll().get(0).getFirstName());

	}

}
