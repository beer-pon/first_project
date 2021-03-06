package jp.co.sample.customer.biz.service;

import java.util.List;

import jp.co.sample.customer.biz.model.Customer;

public interface CustomerService {
	/**
	 * Úqîñð·×Äæ¾·é
	 * @return SÚqîñÌXg
	 */
	public List<Customer> findAll();
	
	/**
	 * IDÉR}­Úqîñðæ¾
	 * @param id ÚqID
	 * @return Úqîñ
	 * @throws DataNotFoundException f[^ª³¢êÌG[
	 */
	public Customer findById(int id) throws DataNotFoundException;
	
	/**
	 * ÚqîñÌo^
	 * @param customer Úqîñ
	 * @return Úqîñ
	 */
	public Customer register(Customer customer);
	
	/**
	 * ÚqîñÌXV
	 * @param customer
	 * @throws DataNotFoundException f[^ª³¢êÌG[
	 */
    public void update(Customer customer) throws DataNotFoundException;
    
    /**
     * ÚqîñÌí
     * @param id ÚqID
	 * @throws DataNotFoundException f[^ª³¢êÌG[
     */
    public void delete(int id) throws DataNotFoundException;

}
