package com.crm.mapper;

import java.util.List;

import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;

/**
 * �ͻ���Ϣ�־û��ӿ�
 * @author dmarco
 *
 */
public interface CustomerMapper {

	/**
	 * ���ݲ�ѯ������ѯ�ͻ��б�
	 * @param vo
	 * @return
	 */
	public List<Customer> getCustomerByQueryVo(QueryVo vo);
	
	/**
	 * ���ݲ�ѯ��������������
	 * @param vo
	 * @return
	 */
	public Integer getCountByQueryVo(QueryVo vo);

	/**
	 * ����id���ҿͻ���Ϣ
	 * @param id
	 * @return
	 */
	public Customer getCustomerById(Integer id);
	
	/**
	 * ���¿ͻ���Ϣ
	 * @param id
	 */
	public void updateCustomer(Customer customer);
	
	/**
	 * ɾ���ͻ���Ϣ
	 * @param id
	 */
	public void deleteCustomer(Integer id);
}
