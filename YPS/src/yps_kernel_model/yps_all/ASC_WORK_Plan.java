package yps_kernel_model.yps_all;

import java.util.Date;

public class ASC_WORK_Plan {
	String CONTAINER_ID ;//	VARCHAR2(12)	���
	String CONTAINER_WI_REF ;//	NUMBER(18)	����ҵ��������ֶ�
	Date ETC_ORIGIN_MOVE;//	DATE/TIME	������ʻ������Ԥ�����ʱ�䣨���ŵ�ж���������װ�������������������ҵ�鲢��
	Date EST_DESTINATION_MOVE;//	DATE/TIME	������ʻ���յ��Ԥ�ƿ�ʼʱ�䣨���ŵ�ж���������װ�������������������ҵ�鲢��
	String ORDER_SEQ;//	VARCHAR2(30)	�������

	String CARRY_REFERENCE ;//	VARCHAR2(30)	��������

	String MOVE_KIND ;//	VARCHAR2(5)	��ҵ����
	//DSCH--ж��
	//LOAD--װ��
	String MOVE_STATUS ;//	VARCHAR2(25)	PLAN
	String FETCH_CHE ;//	VARCHAR2(16)	װж��е��
 	String ORIGIN_LOCATION ;//	VARCHAR2(32)	��ҵ������ʼλ��
	String ORIGIN_TRANSFER_ZONE ;//	VARCHAR2(32)	��ҵ���񽻻���λ��
	String DESTINATION_LOCATION ;//	VARCHAR2(32)	Ŀ��λ��
	String DESTINATION_TRANSFER_ZONE;//	VARCHAR2(32)	Ŀ��λ�ý�����

	
	public void set(){
		
	}
	public void set_CONTAINER_ID(String s){
		
	}
	
	
	public void set_CONTAINER_WI_REF(String s){
		
	}
	
	public void get(){
		
	}
	
}
