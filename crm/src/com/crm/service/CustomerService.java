package com.crm.service;

import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;
import com.crm.utils.Page;

/**
 * �ͻ���Ϣҵ���߼��ӿ�
 * @author dmarco
 *
 */
public interface CustomerService {

	/**
	 * ���ݲ�ѯ������ѯ�ͻ��б�
	 * @param vo
	 * @return
	 */
	public Page<Customer> getCustomerByQueryVo(QueryVo vo);

	/**
	 * ����id��ѯ�ͻ���Ϣ
	 * @param id
	 * @return
	 */
	public Customer getCustomerById(Integer id);
	
	/**
	 * ���¿ͻ���Ϣ
	 * @param customer
	 */
	public void updateCustomer(Customer customer);
	
	/**
	 * ɾ���ͻ���Ϣ
	 * @param id
	 */
	public void deleteCustomer(Integer id);
}
