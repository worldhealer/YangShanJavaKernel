package yps_all;

public class YAA_Info {
	String YAA_AREANO ;//	VARCHAR2(2)	箱区号，唯一索引，主键
	String YAA_CRAFT ;//	VARCHAR2(1)	箱区工艺, 静态表
	String YAA_STBAYNO;//	VARCHAR2(2)	起始位,倍位编号
	String YAA_EDBAYNO;//	VARCHAR2(2)	终止位,倍位编号
	int YAA_ROWS ;//	NUMBER(2)	排数
	int YAA_TIERS ;//	NUMBER(2)	层数
	int YAA_RACKNUM	; //NUMBER(3) 	海侧rac数量
	int YAA_OUTTRKNUM; //	NUMBER(3)	陆侧外集卡车位
	String YAA_BERTHNO; //	VARCHAR2(2)	对应泊位,最靠近的泊位
	double YAA_ALERTNUM ;//	NUMBER(4,1)	报警阈值％,暂时无用
	String YAA_FITSTATUS;//	VARCHAR2(100)	适用箱状态,暂时无用
	double YAA_AREAX;//	NUMBER(6,2)	起始X坐标
	double YAA_AREAY;//	NUMBER(6,2)	起始Y坐标
	
	
	public void set(){
		
	}

}
