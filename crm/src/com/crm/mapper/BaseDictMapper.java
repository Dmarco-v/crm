package com.crm.mapper;

import java.util.List;

import com.crm.pojo.BaseDict;

/**
 * �ֵ����ݱ�־û��ӿ�
 * @author dmarco
 *
 */
public interface BaseDictMapper {

	/**
	 * �����ֵ�����ѯ�ֵ��б�
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseDictByCode(String code);
}
