package com.crm.service;

import java.util.List;

import com.crm.pojo.BaseDict;

/**
 * �ֵ����ݱ�ҵ���߼��ӿ�
 * @author dmarco
 *
 */
public interface BaseDictService {

	/**
	 * �����ֵ�����ѯ�ֵ��б�
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseDictByCode(String code);
}
