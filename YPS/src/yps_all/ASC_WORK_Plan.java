package yps_all;

import java.util.Date;

public class ASC_WORK_Plan {
	String CONTAINER_ID ;//	VARCHAR2(12)	箱号
	String CONTAINER_WI_REF ;//	NUMBER(18)	与作业任务关联字段
	Date ETC_ORIGIN_MOVE;//	DATE/TIME	吊机行驶到起点的预计完成时间（如桥吊卸船，轨道吊装船，轨道吊在箱区内作业归并）
	Date EST_DESTINATION_MOVE;//	DATE/TIME	吊机行驶到终点的预计开始时间（如桥吊卸船，轨道吊装船，轨道吊在箱区内作业归并）
	String ORDER_SEQ;//	VARCHAR2(30)	任务次序

	String CARRY_REFERENCE ;//	VARCHAR2(30)	任务批次

	String MOVE_KIND ;//	VARCHAR2(5)	作业类型
	//DSCH--卸船
	//LOAD--装船
	String MOVE_STATUS ;//	VARCHAR2(25)	PLAN
	String FETCH_CHE ;//	VARCHAR2(16)	装卸机械号
 	String ORIGIN_LOCATION ;//	VARCHAR2(32)	作业任务起始位置
	String ORIGIN_TRANSFER_ZONE ;//	VARCHAR2(32)	作业任务交换区位置
	String DESTINATION_LOCATION ;//	VARCHAR2(32)	目的位置
	String DESTINATION_TRANSFER_ZONE;//	VARCHAR2(32)	目的位置交换区

}
