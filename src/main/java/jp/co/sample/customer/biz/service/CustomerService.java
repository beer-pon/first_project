package jp.co.sample.customer.biz.service;

import java.util.List;

import jp.co.sample.customer.biz.model.Customer;

public interface CustomerService {
	/**
	 * 顧客情報をすべて取得する
	 * @return 全顧客情報のリスト
	 */
	public List<Customer> findAll();
	
	/**
	 * IDに紐図く顧客情報を取得
	 * @param id 顧客ID
	 * @return 顧客情報
	 * @throws DataNotFoundException データが無い場合のエラー
	 */
	public Customer findById(int id) throws DataNotFoundException;
	
	/**
	 * 顧客情報の登録
	 * @param customer 顧客情報
	 * @return 顧客情報
	 */
	public Customer register(Customer customer);
	
	/**
	 * 顧客情報の更新
	 * @param customer
	 * @throws DataNotFoundException データが無い場合のエラー
	 */
    public void update(Customer customer) throws DataNotFoundException;
    
    /**
     * 顧客情報の削除
     * @param id 顧客ID
	 * @throws DataNotFoundException データが無い場合のエラー
     */
    public void delete(int id) throws DataNotFoundException;

}
