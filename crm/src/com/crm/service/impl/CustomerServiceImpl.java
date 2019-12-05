package com.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.mapper.CustomerMapper;
import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;
import com.crm.service.CustomerService;
import com.crm.utils.Page;

/**
 * @author dmarco
 */

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerMapper customerMapper;
	
	
	public Page<Customer> getCustomerByQueryVo(QueryVo vo) {
		
		//������ʼֵ
		vo.setStart((vo.getPage()-1)*vo.getRows());
		
		//��ѯ�ܼ�¼��
		Integer total=customerMapper.getCountByQueryVo(vo);
		
		//��ѯÿҳ���б�
		List<Customer> list=customerMapper.getCustomerByQueryVo(vo);
		
		//��װ��ҳ����
		Page<Customer> page=new Page<Customer>(total, vo.getPage(), vo.getRows(), list);
		
		return page;
	}


	public Customer getCustomerById(Integer id) {
		return customerMapper.getCustomerById(id);
	}


	public void updateCustomer(Customer customer) {
		customerMapper.updateCustomer(customer);
	}


	public void deleteCustomer(Integer id) {
		customerMapper.deleteCustomer(id);
	}

}
