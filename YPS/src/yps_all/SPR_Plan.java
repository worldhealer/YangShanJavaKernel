package yps_all;

import java.util.Date;

public class SPR_Plan {
	int SPR_RANGEID;//	NUMBER(10)	堆存区间的唯一键
	int SPR_SPL_YPLANID;//	NUMBER(10)	堆存计划类型，出口、卸船。。。
	String SPR_STBAY;//	VARCHAR2(4)	起始位
	String SPR_EDBAY;//	VARCHAR2(4)	终止位
	String SPR_STROW;//	VARCHAR2 (1)	起始排
	String SPR_EDROW;//	VARCHAR2 (1)	终止排
	String SPR_STTIER;//	VARCHAR2 (1)	起始层
	String SPR_EDTIER;//	VARCHAR2 (1)	终止层
	String SPR_VALIDFG;//	VARCHAR2 (1)	区间有效标志
	Date SPR_STDATE;//	DATE	区间开始时间
	String SPR_EDDATE;//	DATE	区间结束时间
	String SPR_FILTER;//	VARCHAR2 (2000)	区间堆放规则,难以满足具体Group 规则在放箱子时才会确定

    public void set(){
    	
    }

}
