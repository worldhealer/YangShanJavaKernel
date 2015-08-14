package yps_all;

import java.util.*;
import org.json.* ;

public class IYC_Info {
	int IYC_CNTRID ;//	Number(10)	箱ID，箱子的唯一索引，主键
	String IYC_CNTRNO ; //	VARCHAR2(11) 	箱号 
	int IYC_IVOY_ID;//	NUMBER(10)	一程航次ID ,进口
	int IYC_EVOY_ID;//	NUMBER(10)	二程航次ID,出口， 

	Date IYC_INYTM ;//	DATE 	进场时间 
	String IYC_DOCTYPE ;//	VARCHAR2(3) 	资料类型,不需要

	String IYC_TYPE ;// 	VARCHAR2(3) 	箱动态 ,箱子当前是否在堆场；或是在其他具体位置

	String IYC_CSZ_CSIZECD ;//	VARCHAR2(2) 	尺寸 
	String IYC_CTYPECD ;//	VARCHAR2(2) 	箱型 
	String IYC_CHEIGHTCD ;//	VARCHAR2(2) 	箱高代码 
	String IYC_STS_CSTATUSCD ; //VARCHAR2(2)	箱状态,进口/出口/中转/空重

	String IYC_CST_COPERCD	;//VARCHAR2(8)	持箱人
	String IYC_YLOCATION ;//	VARCHAR2(8)	场箱位,6位数据进行表示

	String IYC_CST_TO	;//VARCHAR2(8)	流向

	String IYC_TRANSMODE ;//VARCHAR2(1)	运输方式

	String IYC_BRKDMGCD; //VARCHAR2(7)	残损代码, 特殊处理
	String IYC_DIRTYCD ; //VARCHAR2(1)	坏污标志,特殊处理

	String IYC_ISOCD  ;//	VARCHAR2(4) 	箱型ISO代码 , 几种属性集合

	int IYC_CWEIGHT ;//	NUMBER(6) 	箱重 , 决策使用

	int IYC_MAXLOAD ;//	NUMBER(5) 	箱重最大负荷 
	int IYC_CNETWG ;//	NUMBER(5) 	箱净重 
	String IYC_REFSTATUS ;//	VARCHAR2(1) 	冷藏箱状态 

	String IYC_DTP_DNGGCD ;// 	VARCHAR2(3) 	危险品代码 
	String IYC_POT_UNLDPORT ;//	VARCHAR2(5)	卸货港, 按照卸货港堆放（重要）

	String IYC_OVLMTCD ; //	VARCHAR2(2) 	超限标志 
	double IYC_OVHEIGHT ;//	NUMBER(4,1) 	超高 
	
	void init(String Jsontype_string){
		
		
	}
	
	void get(){
		
	}
	
	
}
