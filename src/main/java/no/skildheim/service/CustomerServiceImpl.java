package no.skildheim.service;

import no.skildheim.model.Customer;
import no.skildheim.repository.CustomerRepository;
import no.skildheim.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
