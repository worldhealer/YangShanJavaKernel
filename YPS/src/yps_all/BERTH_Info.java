package yps_all;

import java.util.*;

public class BERTH_Info {
	int SCHEDULE_ID;//	Number(10)	船期ID, 到港船舶的唯一索引，主键
	String BERTH_BERTHNO;//	Varchar2(10)	计划靠泊泊位
	double START_POSITION;//	Number(6,2)	计划靠泊起始位置
	double END_POSITION;//	Number(6,2)	计划靠泊终止位置

	String BERTH_DIRECTION;//	Varchar2(1)	计划靠泊方向
	Date BERTH_DATE;//	Date/Time	计划靠泊时间
	Date DEPART_DATE;//	Date/Time	计划离泊时间

	public void set(){
		
	}

}
