package jp.co.sample.customer.biz.service;

import java.util.List;

import jp.co.sample.customer.biz.model.Customer;

public interface CustomerService {
	/**
	 * �ڋq�������ׂĎ擾����
	 * @return �S�ڋq���̃��X�g
	 */
	public List<Customer> findAll();
	
	/**
	 * ID�ɕR�}���ڋq�����擾
	 * @param id �ڋqID
	 * @return �ڋq���
	 * @throws DataNotFoundException �f�[�^�������ꍇ�̃G���[
	 */
	public Customer findById(int id) throws DataNotFoundException;
	
	/**
	 * �ڋq���̓o�^
	 * @param customer �ڋq���
	 * @return �ڋq���
	 */
	public Customer register(Customer customer);
	
	/**
	 * �ڋq���̍X�V
	 * @param customer
	 * @throws DataNotFoundException �f�[�^�������ꍇ�̃G���[
	 */
    public void update(Customer customer) throws DataNotFoundException;
    
    /**
     * �ڋq���̍폜
     * @param id �ڋqID
	 * @throws DataNotFoundException �f�[�^�������ꍇ�̃G���[
     */
    public void delete(int id) throws DataNotFoundException;

}
