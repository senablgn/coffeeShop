package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService checkService;
	

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		super();
		this.checkService = checkService;
	}


	@Override
	public void add(Customer customer) {
		if(checkService.checkIfReelPerson()) {
			super.add(customer);
		}else {
			System.out.println("not a valid person");
		}
		
	}
	
	

	

}
