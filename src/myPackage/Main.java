package myPackage;
import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;

import concrete.CustomerCheckManager;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer(1, "Engin ", "Demiroğ", "01.06.1985", "555555555550");
		BaseCustomerManager bCustomerManager
		=new StarbucksCustomerManager(new CustomerCheckManager());
		bCustomerManager.add(customer);

	}

}
