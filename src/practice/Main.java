package practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("曜日を入力して下さい：");
	    String week = new Scanner(System.in).nextLine();
	    // 以下に処理を記述
	    switch(DayOfWeek.valueOf(week)) {
	    case Sun:
	    	System.out.println(DayOfWeek.Sun.getDayOfWeek());
	    	break;
	    case Mon:
	    	System.out.println(DayOfWeek.Mon.getDayOfWeek());
	    	break;
	    case Tue:
	    	System.out.println(DayOfWeek.Tue.getDayOfWeek());
	    	break;
	    case Wed:
	    	System.out.println(DayOfWeek.Wed.getDayOfWeek());
	    	break;
	    case Thu:
	    	System.out.println(DayOfWeek.Thu.getDayOfWeek());
	    	break;
	    case Fri:
	    	System.out.println(DayOfWeek.Fri.getDayOfWeek());
	    	break;
	    case Sat:
	    	System.out.println(DayOfWeek.Sat.getDayOfWeek());
	    	break;
	    }
	    
	    //解答
	    /*
	    System.out.print("曜日を入力して下さい：");
	    String input = new Scanner(System.in).nextLine();
	    DayOfWeek week = DayOfWeek.valueOf(input);
	    switch (week) {
	    case Sun:
	    	System.out.println("日曜日です");
	    	break;
	    case Mon:
	    	System.out.println("月曜日です");
	    	break;
	    case Tue:
	    	System.out.println("火曜日です");
	    	break;
	    case Wed:
	    	System.out.println("水曜日です");
	    	break;
	    case Thu:
	    	System.out.println("木曜日です");
	    	break;
	    case Fri:
	    	System.out.println("金曜日です");
	    	break;
	    case Sat:
	    	System.out.println("土曜日です");
	    	break;
	    }
	    */
	}
}
