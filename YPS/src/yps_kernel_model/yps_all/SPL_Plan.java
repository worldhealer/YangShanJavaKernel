package yps_kernel_model.yps_all;

import java.util.Date;

public class SPL_Plan {
	String SPL_YPLANID ;//	NUMBER(10)	堆存计划的唯一键
	String SPL_TYPE;//	VARCHAR2 (1)	堆存计划类型，出口、卸船。。。
	String SPL_VOYID;//	NUMBER(10)	进口航次ID，用以关联到船
	String SPL_FILTER;//  VARCHAR2 (2000)	箱属性组合,具体要求（重量）

	String SPL_VALIDFG;//  VARCHAR2 (1)	是否有效
	Date SPL_STTM;//	DATE	计划开始时间,计划的有效时间

	Date SPL_EDTM;//	DATE	计划结束时间,计划的有效时间

	String SPL_CNTRNUM;//	NUMBER(4)	计划箱量

	public void set(){
		
	}
}
