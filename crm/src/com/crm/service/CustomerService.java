package com.crm.service;

import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;
import com.crm.utils.Page;

/**
 * 客户信息业务逻辑接口
 * @author dmarco
 *
 */
public interface CustomerService {

	/**
	 * 根据查询条件查询客户列表
	 * @param vo
	 * @return
	 */
	public Page<Customer> getCustomerByQueryVo(QueryVo vo);

	/**
	 * 根据id查询客户信息
	 * @param id
	 * @return
	 */
	public Customer getCustomerById(Integer id);
	
	/**
	 * 更新客户信息
	 * @param customer
	 */
	public void updateCustomer(Customer customer);
	
	/**
	 * 删除客户信息
	 * @param id
	 */
	public void deleteCustomer(Integer id);
}
