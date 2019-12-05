package com.crm.mapper;

import java.util.List;

import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;

/**
 * 客户信息持久化接口
 * @author dmarco
 *
 */
public interface CustomerMapper {

	/**
	 * 根据查询条件查询客户列表
	 * @param vo
	 * @return
	 */
	public List<Customer> getCustomerByQueryVo(QueryVo vo);
	
	/**
	 * 根据查询条件计算总条数
	 * @param vo
	 * @return
	 */
	public Integer getCountByQueryVo(QueryVo vo);

	/**
	 * 根据id查找客户信息
	 * @param id
	 * @return
	 */
	public Customer getCustomerById(Integer id);
	
	/**
	 * 更新客户信息
	 * @param id
	 */
	public void updateCustomer(Customer customer);
	
	/**
	 * 删除客户信息
	 * @param id
	 */
	public void deleteCustomer(Integer id);
}
