package com.syntax.homework;

public class ClockClass08 {

	public static void main(String[] args) {
		
		/*
		 *  Clock exercise
		 */
		
		String time;
		
		for(int hour=1; hour<=12; hour++) {
			for(int min=0; min<=59; min++) {
				if(hour<10 && min<10) {
					time="0"+hour+":"+"0"+min;
					System.out.println(time);
				}else if(hour<10 && min>10) {
					time="0"+hour+":"+min;
					System.out.println(time);
				}else if(hour>=10 && min<10) {
					time=hour+":"+"0"+min;
					System.out.println(time);
					
				}else {
					time=hour+":"+min;
					System.out.println(time);
				}
				
				//for(int sec=0; sec<=59; sec++) {
					//System.out.println(hour+":"+min+":"+sec);
				}
			}
		}

	}

//}
