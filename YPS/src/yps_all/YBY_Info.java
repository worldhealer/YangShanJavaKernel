package yps_all;

public class YBY_Info {
	int YBY_BAYID;//	NUMBER(10)	倍位ID，唯一索引，主键
	String YBY_BAYNO;//	VARCHAR2(2)	倍位号
	int YBY_ROWNUM;//	NUMBER(2)	排数
	int YBY_TIERNUM;//	NUMBER(2)	层数
	String YBY_STATUS;//	VARCHAR2(1)	状态 ,空位/小箱/大箱

	String YBY_USEFG;//	VARCHAR2(1)	使用标志

	String YBY_YAA_AREANO;//	VARCHAR2(2)	箱区号
	String YBY_ENABLECSIZECD;//	VARCHAR2(100)	可放尺寸(尺寸组合)
	int YBY_CNTRNUM;//	NUMBER(2)	允许翻箱数,用来翻箱的数量(可能具体位置)

	public void set(){
		
	}
}
