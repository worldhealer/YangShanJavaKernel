package yps_all;

import java.util.Date;

public class SPL_Plan {
	String SPL_YPLANID ;//	NUMBER(10)	�Ѵ�ƻ���Ψһ��
	String SPL_TYPE;//	VARCHAR2 (1)	�Ѵ�ƻ����ͣ����ڡ�ж��������
	String SPL_VOYID;//	NUMBER(10)	���ں���ID�����Թ�������
	String SPL_FILTER;//  VARCHAR2 (2000)	���������,����Ҫ��������

	String SPL_VALIDFG;//  VARCHAR2 (1)	�Ƿ���Ч
	Date SPL_STTM;//	DATE	�ƻ���ʼʱ��,�ƻ�����Чʱ��

	Date SPL_EDTM;//	DATE	�ƻ�����ʱ��,�ƻ�����Чʱ��

	String SPL_CNTRNUM;//	NUMBER(4)	�ƻ�����

	public void set(){
		
	}
}
