package jp.co.sample.customer.biz.serviceimpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import jp.co.sample.customer.biz.model.Customer;
import jp.co.sample.customer.biz.service.CustomerService;
import jp.co.sample.customer.biz.service.DataNotFoundException;

import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	private Map<Integer, Customer> customerMap = new LinkedHashMap<Integer, Customer>();

	private int nextId = 1;

	private boolean isExists(int id) {
		return customerMap.containsKey(id);
	}

	public List<Customer> findAll() {
		return new ArrayList<Customer>(customerMap.values());
	}

	public Customer findById(int id) throws DataNotFoundException {
		if (!isExists(id)) {
			throw new DataNotFoundException();
		}
		return customerMap.get(id);
	}

	public Customer register(Customer customer) {
		customer.setId(nextId++);
		customerMap.put(customer.getId(), customer);

		return customer;
	}

	public void update(Customer customer) throws DataNotFoundException {
		if (!isExists(customer.getId())) {
			throw new DataNotFoundException();
		}
		customerMap.put(customer.getId(), customer);
	}

	public void delete(int id) throws DataNotFoundException {
		if (!isExists(id)) {
			throw new DataNotFoundException();
		}
		customerMap.remove(id);
	}

	@PostConstruct
	public void initCustomer() {
		nextId = 1;

		register(new Customer("‘¾˜Y", "“Œ‹“sVh‹æ", "taro@aa.bb.cc"));
		register(new Customer("Ÿ˜Y", "“Œ‹“s–L“‡‹æ", "jiro@aa.bb.cc"));
		register(new Customer("O˜Y", "“Œ‹“s”Â‹´‹æ", "sabu@aa.bb.cc"));
	}
}
