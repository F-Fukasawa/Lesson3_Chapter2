package practice;

public enum DayOfWeek{
	Sun("日曜日"), Mon("月曜日"), Tue("火曜日"), Wed("水曜日"), Thu("木曜日"), Fri("金曜日"), Sat("土曜日");
	
	private String dayOfWeek;
	
	private DayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
	public String getDayOfWeek() {
		return dayOfWeek;
	}
}
