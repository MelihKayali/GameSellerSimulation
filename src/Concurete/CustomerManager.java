package Concurete;

import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println("Oyuncu sisteme eklendi : " + customer.getFirstName() + customer.getLastName() + customer.getId());
		
	}

	@Override
	public void remove(Customer customer) {
		System.out.println("Oyuncu sistemden kaldýrýldý : " + customer.getFirstName() + customer.getLastName() + customer.getId());		
	}

}
