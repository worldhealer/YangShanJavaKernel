package yps_kernel_model.yps_all;

import java.util.*;
import org.json.* ;

public class IYC_Info {
	String IYC_CNTRID ;//	Number(10)	��ID�����ӵ�Ψһ����������
	String IYC_CNTRNO ; //	VARCHAR2(11) 	��� 
	String IYC_IVOY_ID;//	NUMBER(10)	һ�̺���ID ,����
	String IYC_EVOY_ID;//	NUMBER(10)	���̺���ID,���ڣ� 

	Date IYC_INYTM ;//	DATE 	����ʱ�� 
	String IYC_DOCTYPE ;//	VARCHAR2(3) 	��������,����Ҫ

	String IYC_TYPE ;// 	VARCHAR2(3) 	�䶯̬ ,���ӵ�ǰ�Ƿ��ڶѳ�����������������λ��

	String IYC_CSZ_CSIZECD ;//	VARCHAR2(2) 	�ߴ� 
	String IYC_CTYPECD ;//	VARCHAR2(2) 	���� 
	String IYC_CHEIGHTCD ;//	VARCHAR2(2) 	��ߴ��� 
	String IYC_STS_CSTATUSCD ; //VARCHAR2(2)	��״̬,����/����/��ת/����

	String IYC_CST_COPERCD	;//VARCHAR2(8)	������
	String IYC_YLOCATION ;//	VARCHAR2(8)	����λ,6λ���ݽ��б�ʾ

	String IYC_CST_TO	;//VARCHAR2(8)	����

	String IYC_TRANSMODE ;//VARCHAR2(1)	���䷽ʽ

	String IYC_BRKDMGCD; //VARCHAR2(7)	�������, ���⴦��
	String IYC_DIRTYCD ; //VARCHAR2(1)	���۱�־,���⴦��

	String IYC_ISOCD  ;//	VARCHAR2(4) 	����ISO���� , �������Լ���

	int IYC_CWEIGHT ;//	NUMBER(6) 	���� , ����ʹ��

	int IYC_MAXLOAD ;//	NUMBER(5) 	������󸺺� 
	int IYC_CNETWG ;//	NUMBER(5) 	�侻�� 
	String IYC_REFSTATUS ;//	VARCHAR2(1) 	�����״̬ 

	String IYC_DTP_DNGGCD ;// 	VARCHAR2(3) 	Σ��Ʒ���� 
	String IYC_POT_UNLDPORT ;//	VARCHAR2(5)	ж����, ����ж���۶ѷţ���Ҫ��

	String IYC_OVLMTCD ; //	VARCHAR2(2) 	���ޱ�־ 
	double IYC_OVHEIGHT ;//	NUMBER(4,1) 	���� 
	
	void init(String Jsontype_string){
		
		
	}
	
	void get(){
		
	}
	
	
}
