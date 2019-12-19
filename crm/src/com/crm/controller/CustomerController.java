package com.crm.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.util.StringUtils;
import com.crm.pojo.BaseDict;
import com.crm.pojo.Customer;
import com.crm.pojo.QueryVo;
import com.crm.service.BaseDictService;
import com.crm.service.CustomerService;
import com.crm.utils.Page;

/**
 * @author dmarco
 *
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private BaseDictService baseDictService;
	
	@Autowired
	private CustomerService customerService;
	
	//ʹ��@Valueע���������
	@Value("${customer_from_type}")
	private String customer_from_type;
	@Value("${customer_industry_type}")
	private String customer_industry_type;
	@Value("${customer_level_type}")
	private String customer_level_type;
	
	
	@RequestMapping("list")
	public String list(Model model,QueryVo vo){
		
		//���get������������
		try {
			if(!StringUtils.isEmpty(vo.getCustName())){
				vo.setCustName(new String(vo.getCustName().getBytes("ISO-8859-1"),"utf-8"));
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//��ѯ��Դ
		List <BaseDict> fromType=baseDictService.getBaseDictByCode(customer_from_type);
		//��ѯ��ҵ
		List <BaseDict> industryType=baseDictService.getBaseDictByCode(customer_industry_type);
		//��ѯ����
		List <BaseDict> levelType=baseDictService.getBaseDictByCode(customer_level_type);
		
		
		//��������ģ�͵ķ���
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		//���ݲ�ѯ������ѯ�ͻ��б�
		Page<Customer> page=customerService.getCustomerByQueryVo(vo);
				
		//���÷�ҳ������
		model.addAttribute(page);
		
		//���ݻ���
		model.addAttribute("custName",vo.getCustName());
		model.addAttribute("custSource",vo.getCustSource());
		model.addAttribute("custIndustry",vo.getCustIndustry());
		model.addAttribute("custLevel",vo.getCustLevel());

		
		return "customer";
	}
	
	@RequestMapping("edit")
	@ResponseBody
	public Customer edit(Integer id){
		Customer customer=customerService.getCustomerById(id);
		return customer;
	}
	
	@RequestMapping("update")
	public String update(Customer customer){
		customerService.updateCustomer(customer);
		return "customer";
	}
	
	@RequestMapping("delete")
	public String delete(Integer id ){
		customerService.deleteCustomer(id);
		return "customer";
	}
	
	
	@RequestMapping("myTag")
	public String myTag(){
		return "myTag";
	}
}
