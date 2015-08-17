package yps_kernel_model.PortSimulator;
import yps_kernel_model.yps_all.IYC_Info;
import yps_kernel_model.PortSimulator.port;
import java.util.HashMap;
import java.util.Vector;
public class YardManager {
	public Vector<YardEntityInterface> YardIndexList=new Vector<YardEntityInterface>();
	public HashMap<String,YardEntityInterface> YardNameList=new HashMap<String,YardEntityInterface>();
	public IYC_Info GetYardByLocation(int x,int y){
		return null;
	}
	public void DrawOpenGL(){
		for(int i=0;i<YardIndexList.size();i++) YardIndexList.get(i).DrawOpenGL();
	}
	public YardManager(){
		YardEntity YardItem;
		//Yard1================================================
		YardItem=new YardEntity();
		for(int i=0;i<25;i++)
			YardItem.InsertYBY(2480,141+i*6,10,20);
		YardItem.InsertYBY(2480,141+25*6,10,40);
		YardIndexList.add(YardItem);
		YardNameList.put("01", YardItem);
		//Yard2================================================
		YardItem=new YardEntity();
		for(int i=0;i<33;i++)
			YardItem.InsertYBY(2428,141+i*6,10,20);
		YardItem.InsertYBY(2428,141+33*6,10,40);
		YardIndexList.add(YardItem);
		YardNameList.put("02", YardItem);
		//Yard3================================================
		YardItem=new YardEntity();
		for(int i=0;i<33;i++)
			YardItem.InsertYBY(2392,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("03", YardItem);
		//Yard4================================================
		YardItem=new YardEntity();
		for(int i=0;i<38;i++)
			YardItem.InsertYBY(2356,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("04", YardItem);
		//Yard5================================================
		YardItem=new YardEntity();
		for(int i=0;i<41;i++)
			YardItem.InsertYBY(2319,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("05", YardItem);
		//Yard6================================================
		YardItem=new YardEntity();
		for(int i=0;i<44;i++)
			YardItem.InsertYBY(2284,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("06", YardItem);
		//Yard7================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(2246,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("07", YardItem);
		//Yard8================================================
		YardItem=new YardEntity();
		for(int i=0;i<52;i++)
			YardItem.InsertYBY(2211,141+i*6,10,20);
		YardItem.InsertYBY(2226,141+52*6,5,20);
		YardItem.InsertYBY(2226,141+53*6,5,20);
		YardItem.InsertYBY(2226,141+54*6,5,20);
		YardItem.InsertYBY(2226,141+55*6,5,40);
		YardIndexList.add(YardItem);
		YardNameList.put("08", YardItem);
		//Yard9================================================
		YardItem=new YardEntity();
		for(int i=0;i<54;i++)
			YardItem.InsertYBY(2160,141+i*6,10,20);
		YardItem.InsertYBY(2160,141+54*6,5,20);
		YardItem.InsertYBY(2160,141+55*6,5,20);
		YardItem.InsertYBY(2160,141+56*6,5,20);
		YardItem.InsertYBY(2160,141+57*6,5,40);
		YardIndexList.add(YardItem);
		YardNameList.put("09", YardItem);
		//Yard10================================================
		YardItem=new YardEntity();
		for(int i=0;i<52;i++)
			YardItem.InsertYBY(2122,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("10", YardItem);
		//Yard11================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(2084,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("11", YardItem);
		//Yard12================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(2049,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("12", YardItem);
		//Yard13================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(2012,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("13", YardItem);
		//Yard14================================================
		YardItem=new YardEntity();
		for(int i=0;i<33;i++)
			YardItem.InsertYBY(1977,141+i*6,10,20);
		YardItem.InsertYBY(1977,141+33*6,3,20);
		YardItem.InsertYBY(1977,141+34*6,3,20);
		YardItem.InsertYBY(1977,141+35*6,3,40);
		YardItem.InsertYBY(1977,141+35*6+1*13,3,40);
		YardItem.InsertYBY(1977,141+35*6+2*13,3,40);
		YardItem.InsertYBY(1977,141+35*6+3*13,3,40);
		YardItem.InsertYBY(1977,141+35*6+4*13,3,40);
		YardItem.InsertYBY(1977,141+35*6+5*13,3,40);
		YardItem.InsertYBY(1977,141+35*6+6*13,3,40);
		YardItem.InsertYBY(1977,141+35*6+7*13,3,40);
		YardItem.InsertYBY(1977,141+35*6+8*13,3,40);
		YardItem.InsertYBY(1977,141+35*6+9*13,3,40);
		YardIndexList.add(YardItem);
		YardNameList.put("14", YardItem);
		//Yard15================================================
		YardItem=new YardEntity();
		for(int i=0;i<33;i++)
			YardItem.InsertYBY(1925,141+i*6,10,20);
		YardItem.InsertYBY(1946,141+33*6,3,20);
		YardItem.InsertYBY(1946,141+34*6,3,20);
		YardItem.InsertYBY(1946,141+35*6,3,40);
		YardItem.InsertYBY(1946,141+35*6+1*13,3,40);
		YardItem.InsertYBY(1946,141+35*6+2*13,3,40);
		YardItem.InsertYBY(1946,141+35*6+3*13,3,40);
		YardItem.InsertYBY(1946,141+35*6+4*13,3,40);
		YardItem.InsertYBY(1946,141+35*6+5*13,3,40);
		YardItem.InsertYBY(1946,141+35*6+6*13,3,40);
		YardItem.InsertYBY(1946,141+35*6+7*13,3,40);
		YardItem.InsertYBY(1946,141+35*6+8*13,3,40);
		YardItem.InsertYBY(1946,141+35*6+9*13,3,40);
		YardIndexList.add(YardItem);
		YardNameList.put("15", YardItem);
		//Yard16================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(1887,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("16", YardItem);
		//Yard17================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(1850,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("17", YardItem);
		//Yard18================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(1815,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("18", YardItem);
		//Yard19================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(1777,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("19", YardItem);
		//Yard20================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(1742,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("20", YardItem);
		//Yard21================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(1705,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("21", YardItem);
		//Yard22================================================
		YardItem=new YardEntity();
		for(int i=0;i<57;i++)
			YardItem.InsertYBY(1670,141+i*6,10,20);
		YardItem.InsertYBY(1685,141+57*6,5,20);
		YardItem.InsertYBY(1685,141+58*6,5,20);
		YardItem.InsertYBY(1685,141+59*6,5,20);
		YardItem.InsertYBY(1685,141+60*6,5,40);
		YardIndexList.add(YardItem);
		YardNameList.put("22", YardItem);
		//Yard23================================================
		YardItem=new YardEntity();
		for(int i=0;i<57;i++)
			YardItem.InsertYBY(1632,141+i*6,10,20);
		YardItem.InsertYBY(1632,141+57*6,5,20);
		YardItem.InsertYBY(1632,141+58*6,5,20);
		YardItem.InsertYBY(1632,141+59*6,5,20);
		YardItem.InsertYBY(1632,141+60*6,5,40);
		YardIndexList.add(YardItem);
		YardNameList.put("23", YardItem);
		//Yard24================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(1580,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("24", YardItem);
		//Yard25================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(1543,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("25", YardItem);
		//Yard26================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(1508,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("26", YardItem);
		//Yard27================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(1470,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("27", YardItem);
		//Yard28================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(1435,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("28", YardItem);
		//Yard29================================================
		YardItem=new YardEntity();
		for(int i=0;i<53;i++)
			YardItem.InsertYBY(1398,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("29", YardItem);
		//Yard30================================================
		YardItem=new YardEntity();
		for(int i=0;i<29;i++)
			YardItem.InsertYBY(1363,141+i*6,10,20);
		YardItem.InsertYBY(1363,141+29*6,3,20);
		YardItem.InsertYBY(1363,141+30*6,3,20);
		YardItem.InsertYBY(1363,141+31*6,3,40);
		YardItem.InsertYBY(1363,141+31*6+1*13,3,40);
		YardItem.InsertYBY(1363,141+31*6+2*13,3,40);
		YardItem.InsertYBY(1363,141+31*6+3*13,3,40);
		YardItem.InsertYBY(1363,141+31*6+4*13,3,40);
		YardItem.InsertYBY(1363,141+31*6+5*13,3,40);
		YardItem.InsertYBY(1363,141+31*6+6*13,3,40);
		YardItem.InsertYBY(1363,141+31*6+7*13,3,40);
		YardItem.InsertYBY(1363,141+31*6+8*13,3,40);
		YardItem.InsertYBY(1363,141+31*6+9*13,3,40);
		YardIndexList.add(YardItem);
		YardNameList.put("30", YardItem);
		//Yard31================================================
		YardItem=new YardEntity();
		for(int i=0;i<27;i++)
			YardItem.InsertYBY(1325,141+i*6,10,20);
		YardItem.InsertYBY(1346,141+27*6,3,20);
		YardItem.InsertYBY(1346,141+28*6,3,20);
		YardItem.InsertYBY(1346,141+29*6,3,40);
		YardItem.InsertYBY(1346,141+29*6+1*13,3,40);
		YardItem.InsertYBY(1346,141+29*6+2*13,3,40);
		YardItem.InsertYBY(1346,141+29*6+3*13,3,40);
		YardItem.InsertYBY(1346,141+29*6+4*13,3,40);
		YardItem.InsertYBY(1346,141+29*6+5*13,3,40);
		YardItem.InsertYBY(1346,141+29*6+6*13,3,40);
		YardItem.InsertYBY(1346,141+29*6+7*13,3,40);
		YardItem.InsertYBY(1346,141+29*6+8*13,3,40);
		YardItem.InsertYBY(1346,141+29*6+9*13,3,40);
		YardIndexList.add(YardItem);
		YardNameList.put("31", YardItem);
		//Yard32================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(1273,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("32", YardItem);
		//Yard33================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(1236,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("33", YardItem);
		//Yard34================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(1201,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("34", YardItem);
		//Yard35================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(1163,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("35", YardItem);
		//Yard36================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(1128,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("36", YardItem);
		//Yard37================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(1091,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("37", YardItem);
		//Yard38================================================
		YardItem=new YardEntity();
		for(int i=0;i<49;i++)
			YardItem.InsertYBY(1056,141+i*6,10,20);
		YardItem.InsertYBY(1071,141+49*6,5,20);
		YardItem.InsertYBY(1071,141+50*6,5,20);
		YardItem.InsertYBY(1071,141+51*6,5,20);
		YardItem.InsertYBY(1071,141+52*6,5,40);
		YardIndexList.add(YardItem);
		YardNameList.put("38", YardItem);
		//Yard39================================================
		YardItem=new YardEntity();
		for(int i=0;i<49;i++)
			YardItem.InsertYBY(1018,141+i*6,10,20);
		YardItem.InsertYBY(1018,141+49*6,5,20);
		YardItem.InsertYBY(1018,141+50*6,5,20);
		YardItem.InsertYBY(1018,141+51*6,5,20);
		YardItem.InsertYBY(1018,141+52*6,5,40);
		YardIndexList.add(YardItem);
		YardNameList.put("39", YardItem);
		//Yard40================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(966,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("40", YardItem);
		//Yard41================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(929,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("41", YardItem);
		//Yard42================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(894,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("42", YardItem);
		//Yard43================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(856,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("43", YardItem);
		//Yard44================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(821,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("44", YardItem);
		//Yard45================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(783,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("45", YardItem);
		//Yard46================================================
		YardItem=new YardEntity();
		for(int i=0;i<25;i++)
			YardItem.InsertYBY(748,141+i*6,10,20);
		YardItem.InsertYBY(748,141+25*6,3,20);
		YardItem.InsertYBY(748,141+26*6,3,20);
		YardItem.InsertYBY(748,141+27*6,3,40);
		YardItem.InsertYBY(748,141+27*6+1*13,3,40);
		YardItem.InsertYBY(748,141+27*6+2*13,3,40);
		YardItem.InsertYBY(748,141+27*6+3*13,3,40);
		YardItem.InsertYBY(748,141+27*6+4*13,3,40);
		YardItem.InsertYBY(748,141+27*6+5*13,3,40);
		YardItem.InsertYBY(748,141+27*6+6*13,3,40);
		YardItem.InsertYBY(748,141+27*6+7*13,3,40);
		YardItem.InsertYBY(748,141+27*6+8*13,3,40);
		YardItem.InsertYBY(748,141+27*6+9*13,3,40);
		YardIndexList.add(YardItem);
		YardNameList.put("46", YardItem);
		//Yard47================================================
		YardItem=new YardEntity();
		for(int i=0;i<25;i++)
			YardItem.InsertYBY(696,141+i*6,10,20);
		YardItem.InsertYBY(717,141+25*6,3,20);
		YardItem.InsertYBY(717,141+26*6,3,20);
		YardItem.InsertYBY(717,141+27*6,3,40);
		YardItem.InsertYBY(717,141+27*6+1*13,3,40);
		YardItem.InsertYBY(717,141+27*6+2*13,3,40);
		YardItem.InsertYBY(717,141+27*6+3*13,3,40);
		YardItem.InsertYBY(717,141+27*6+4*13,3,40);
		YardItem.InsertYBY(717,141+27*6+5*13,3,40);
		YardItem.InsertYBY(717,141+27*6+6*13,3,40);
		YardItem.InsertYBY(717,141+27*6+7*13,3,40);
		YardItem.InsertYBY(717,141+27*6+8*13,3,40);
		YardItem.InsertYBY(717,141+27*6+9*13,3,40);
		YardIndexList.add(YardItem);
		YardNameList.put("47", YardItem);
		//Yard48================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(658,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("48", YardItem);
		//Yard49================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(623,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("49", YardItem);
		//Yard50================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(586,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("50", YardItem);
		//Yard51================================================
		YardItem=new YardEntity();
		for(int i=0;i<45;i++)
			YardItem.InsertYBY(551,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("51", YardItem);
		//Yard52================================================
		YardItem=new YardEntity();
		for(int i=0;i<47;i++)
			YardItem.InsertYBY(513,141+i*6,10,20);
		YardItem.InsertYBY(528,141+47*6,5,20);
		YardItem.InsertYBY(528,141+48*6,5,20);
		YardItem.InsertYBY(528,141+49*6,5,20);
		YardItem.InsertYBY(528,141+50*6,5,40);
		YardIndexList.add(YardItem);
		YardNameList.put("52", YardItem);
		//Yard53================================================
		YardItem=new YardEntity();
		for(int i=0;i<42;i++)
			YardItem.InsertYBY(461,141+i*6,10,20);
		YardItem.InsertYBY(461,141+42*6,5,20);
		YardItem.InsertYBY(461,141+43*6,5,20);
		YardItem.InsertYBY(461,141+44*6,5,20);
		YardItem.InsertYBY(461,141+45*6,5,40);
		YardIndexList.add(YardItem);
		YardNameList.put("53", YardItem);
		//Yard54================================================
		YardItem=new YardEntity();
		for(int i=0;i<33;i++)
			YardItem.InsertYBY(424,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("54", YardItem);
		//Yard55================================================
		YardItem=new YardEntity();
		for(int i=0;i<33;i++)
			YardItem.InsertYBY(389,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("55", YardItem);
		//Yard56================================================
		YardItem=new YardEntity();
		for(int i=0;i<37;i++)
			YardItem.InsertYBY(351,141+i*6,10,20);
		YardItem.InsertYBY(366, 141+37*6, 5, 20);
		YardItem.InsertYBY(366, 141+38*6, 5, 20);
		YardItem.InsertYBY(366, 141+39*6, 5, 20);
		YardItem.InsertYBY(366, 141+40*6, 5, 40);
		YardIndexList.add(YardItem);
		YardNameList.put("56", YardItem);
		//Yard57================================================
		YardItem=new YardEntity();
		for(int i=0;i<37;i++)
			YardItem.InsertYBY(299,141+i*6,10,20);
		YardItem.InsertYBY(299, 141+37*6, 5, 20);
		YardItem.InsertYBY(299, 141+38*6, 5, 20);
		YardItem.InsertYBY(299, 141+39*6, 5, 20);
		YardItem.InsertYBY(299, 141+40*6, 5, 40);
		YardIndexList.add(YardItem);
		YardNameList.put("57", YardItem);
		//Yard58================================================
		YardItem=new YardEntity();
		for(int i=0;i<33;i++)
			YardItem.InsertYBY(262,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("58", YardItem);
		//Yard59================================================
		YardItem=new YardEntity();
		for(int i=0;i<33;i++)
			YardItem.InsertYBY(227,165+i*6,10,20);
		YardIndexList.add(YardItem);
		YardNameList.put("59", YardItem);
		//Yard60================================================
		YardItem=new YardEntity();
		for(int i=0;i<29;i++)
			YardItem.InsertYBY(189,189+i*6,10,20);
		YardItem.InsertYBY(204, 189+29*6, 5, 20);
		YardItem.InsertYBY(204, 189+30*6, 5, 20);
		YardItem.InsertYBY(204, 189+31*6, 5, 20);
		YardItem.InsertYBY(204, 189+32*6, 5, 40);
		YardIndexList.add(YardItem);
		YardNameList.put("60", YardItem);
		//Yard61================================================
		YardItem=new YardEntity();
		for(int i=0;i<33;i++)
			YardItem.InsertYBY(137,165+i*6,10,20);
		YardItem.InsertYBY(137, 165+33*6, 5, 20);
		YardItem.InsertYBY(137, 165+34*6, 5, 20);
		YardItem.InsertYBY(137, 165+35*6, 5, 20);
		YardItem.InsertYBY(137, 165+36*6, 5, 40);
		YardIndexList.add(YardItem);
		YardNameList.put("61", YardItem);
		//================================================
	}
}
interface YardEntityInterface{
	abstract IYC_Info GetIYCByIndex(String index);
	abstract IYC_Info GetIYCByIndex(int YBYIndex,int YRWIndex,int YSTIndex);
	abstract IYC_Info GetIYCByLocation(int x,int y);
	abstract void DrawOpenGL();
}
class YRWEntity{//排数
	public Vector<IYC_Info> IYCList=new Vector<IYC_Info>();
}
class YBYEntity{//绘制倍位
	int YBYStartX=-1;
	int YBYStartY=-1;
	int YBYROWNUM=-1;
	int YBY_Length=-1;
	public Vector<YRWEntity> YRWList=null;
	public void DrawOpenGL(){
		for(int i=0;i<YBYROWNUM;i++){
			byte level=(byte)YRWList.get(i).IYCList.size();
			port.SingleItem.DrawBoxLevel(level, YBYStartX+3*i+1, YBYStartY, 2, YBY_Length==20?6:13);
		}
	}
	public YBYEntity(int YBYStartX,int YBYStartY,int YBYROWNUM,int YBY_Length){
		this.YBYStartX=YBYStartX;
		this.YBYStartY=YBYStartY;
		this.YBYROWNUM=YBYROWNUM;
		this.YBY_Length=YBY_Length;
		YRWList=new Vector<YRWEntity>();
		for(int i=0;i<YBYROWNUM;i++) YRWList.add(new YRWEntity());
	}
	
}
class YardEntity implements YardEntityInterface{//绘制箱区
	public Vector<YBYEntity> YBYEntityList=new Vector<YBYEntity>();
	public YardEntity(){
	}
	public void InsertYBY(int YBYStartX,int YBYStartY,int YBYROWNUM,int YBY_Length){
		YBYEntity newitem=new YBYEntity(YBYStartX,YBYStartY,YBYROWNUM,YBY_Length);
		YBYEntityList.add(newitem);
	}
	public void DrawOpenGL(){
		for(int i=0;i<YBYEntityList.size();i++) YBYEntityList.get(i).DrawOpenGL();
	}
	@Override
	public IYC_Info GetIYCByIndex(String index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IYC_Info GetIYCByIndex(int YBYIndex, int YRWIndex, int YSTIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IYC_Info GetIYCByLocation(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}
}