package yps_all;

import java.util.* ;

public class YST_Info {
	String YST_SLOTNO;//	VARCHAR2(6)	场箱位，唯一索引，主键
	String YST_YBY_BAYID;//	NUMBER(10)	倍位ID
	String YST_RFSTATUS;//	VARCHAR2(1)	是否有冷藏箱插座

	String YST_YRW_ID;//	NUMBER(10)	排ID
	String YST_TIERNO;//	VARCHAR2(1)	层号
	int YST_IYC_CNTRID;//	NUMBER(10)	在场箱标识

	String YST_OCCURFG;//	VARCHAR2(1)	占位状态,放箱状态

	String YST_RSTFG;//	VARCHAR2(1)	翻箱位标识
	
	public void set(){
		
	}

}
