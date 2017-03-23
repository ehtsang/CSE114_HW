import java.util.Calendar;
public class Time{
	
	long hour, minute, second;
	
	public Time(){
		Calendar cal = Calendar.getInstance();
		this.hour = cal.get(Calendar.HOUR_OF_DAY);
		this.minute = cal.get(Calendar.MINUTE);
		this.second = cal.get(Calendar.SECOND);
	}
	
	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public Time(long elapsed){
		long totalSeconds = elapsed / 1000;
		this.second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		this.minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		this.hour = totalHours % 24;
	}
	
	//Get Methods
	
	public long getHour(){
		return this.hour;
	}
	
	public long getMinute(){
		return this.minute;
	}
	
	public long getSecond(){
		return this.second;
	}
	
	// setTime(long elapseTime)
	
	public void setTime(long elapsedTime){
		long totalSeconds = elapsedTime / 1000;
		this.second += totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		this.minute += totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		this.hour += totalHours % 24;
	}
	
}
	
		