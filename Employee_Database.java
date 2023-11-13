import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Employee_Database {

	
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
	
		public static void Employee_1() {
			
			
			
					//++++WORK SCHEDULE - 24 HOUR TIME+++//
					int WORK_SHIFT_START_HOUR=8;
					int WORK_SHIFT_START_MINUTE=30;

					int WORK_SHIFT_END_HOUR=17;
					int WORK_SHIFT_END_MINUTE=30;
					
					String DAYS_TO_WORK="Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday";
					String DAYS_TO_WORK_UPPERCASE=DAYS_TO_WORK.toUpperCase();
					//++++++++++++++++++++//
			
					
					//+++SET AI NAME+++//
					String AI_NAME="Employee 1";
					//+++++++++++++++++//
					
					String DAY_OF_THE_WEEK="";
					
					String AM_I_AUTHORIZED_TO_BEGIN_WORK="";
					
					String SWITCH="";
					
					String TIME_STRING="";
					String TIME_HOUR_STRING="";
					String TIME_MINUTE_STRING="";
					
					String IS_TODAY_A_WORK_DAY="";
					
					int IS_TODAYS_WORKING_SHIFT_OVER_KEY=0;
					
					int DAY=0;
					char ENTER=10;
					
					int TIME_HOUR_NUMBER=0;
					int TIME_MINUTE_NUMBER=0;
					
					int ACTIVATION_KEY_1=0;
					
					int WORKING_ACTIVATION_KEY_1=0;
					int WORKING_ACTIVATION_KEY_2=0;
				
					
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
					
					
					SWITCH="ON";
					
					
					//+++++++++++++++++++//
					//+++INFINITE LOOP+++//
					//+++++++++++++++++++//
					
					while (SWITCH.equalsIgnoreCase("ON")) {
						
						//++++++++++++++++++++++++++++++++++++++//
						//+++DETERMINE IF TODAY IS A WORK DAY+++//
						//++++++++++++++++++++++++++++++++++++++//
						
						//+++GET THE DAY OF THE WEEK+++//
						Calendar calendar=Calendar.getInstance();
						DAY=calendar.get(Calendar.DAY_OF_WEEK);
						if (DAY==1) {DAY_OF_THE_WEEK="SUNDAY";} 
						if (DAY==2) {DAY_OF_THE_WEEK="MONDAY";}
						if (DAY==3) {DAY_OF_THE_WEEK="TUESDAY";}
						if (DAY==4) {DAY_OF_THE_WEEK="WEDNESDAY";}
						if (DAY==5) {DAY_OF_THE_WEEK="THURSDAY";}
						if (DAY==6) {DAY_OF_THE_WEEK="FRIDAY";}
						if (DAY==7) {DAY_OF_THE_WEEK="SATURDAY";}
						//-----------------------------//
								
						if (DAYS_TO_WORK_UPPERCASE.contains(DAY_OF_THE_WEEK)) {
							IS_TODAY_A_WORK_DAY="YES";	
						}
						//+++END OF CONDITION+++//
						
						//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
						
						//++++++++++++++++++++++//
						//+++TIME PROGRAMMING+++//
						//++++++++++++++++++++++//
						
						LocalTime TIME=LocalTime.now();
						LocalDate DATE=LocalDate.now();
						
						//----------//
						
						TIME_STRING=String.valueOf(TIME);
						
						try {
							TIME_HOUR_STRING=TIME_STRING.substring(0,2);
						} catch (StringIndexOutOfBoundsException e) {}
						
						
						try {
							TIME_MINUTE_STRING=TIME_STRING.substring(3,5);
						} catch (StringIndexOutOfBoundsException e) {}
						
						
						TIME_HOUR_NUMBER=Integer.valueOf(TIME_HOUR_STRING);
						TIME_MINUTE_NUMBER=Integer.valueOf(TIME_MINUTE_STRING);
						
						//+++++++++++++++++++++++++++++//
						//+++END OF TIME PROGRAMMING+++//
						//+++++++++++++++++++++++++++++//
						
						//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
						
						
						
						
						
						
						//+++DETERMINE IF I SHOULD START WORKING+++//
						
							if (TIME_HOUR_NUMBER==WORK_SHIFT_START_HOUR && TIME_MINUTE_NUMBER>=WORK_SHIFT_START_MINUTE || TIME_HOUR_NUMBER>WORK_SHIFT_START_HOUR && TIME_HOUR_NUMBER<WORK_SHIFT_END_HOUR || TIME_HOUR_NUMBER==WORK_SHIFT_END_HOUR && TIME_MINUTE_NUMBER<WORK_SHIFT_END_MINUTE) {
								AM_I_AUTHORIZED_TO_BEGIN_WORK="YES";
							}
							//+++END OF CONDIITON+++//
							
						//+++++++++++++++++++++++++++++++++++++++++//
							
							
						
							
						//+++DETERMINE WHEN I SHOULD STOP WORKING+++//
							
							if (TIME_HOUR_NUMBER==WORK_SHIFT_END_HOUR && TIME_MINUTE_NUMBER>=WORK_SHIFT_END_MINUTE || TIME_HOUR_NUMBER>WORK_SHIFT_END_HOUR) {
								AM_I_AUTHORIZED_TO_BEGIN_WORK="NO";
							}
							//+++END OF CONDITION+++//
							
						//++++++++++++++++++++++++++++++++++++++++++//
							
							
							
						//++++++++++++++++++++++++++++++++++++++++++++++++++//
						//+++END OF DETERMINING IF I SHOULD START WORKING+++//
						//++++++++++++++++++++++++++++++++++++++++++++++++++//
						
						//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
						
						//+++++++++++++++++++//
						//+++START WORKING+++//
						//+++++++++++++++++++//
						
						if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("YES") && WORKING_ACTIVATION_KEY_1==0 && IS_TODAY_A_WORK_DAY.equalsIgnoreCase("YES")) {
							
							
							System.out.println(AI_NAME+" clocked in.");
							WORKING_ACTIVATION_KEY_1=1;
							
							//+++IMPORT THE AI CAREER, OR JOB HERE+++//
							Career_Database.career_1();
							
							
							
						}
						//+++END OF CONDITION FOR AUTHORIZATION TO WORK+++//
						
						//+++++++++++++++++++++++//
						//+++END OF WORK LOGIC+++//
						//+++++++++++++++++++++++//
						
						//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
						
						//++++++++++++++++++++++//
						//+++NOT WORKING LOGIC++//
						//++++++++++++++++++++++//
						
						if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_1==1 && ACTIVATION_KEY_1==0) {
							System.out.println(AI_NAME+" clocked out.");
							ACTIVATION_KEY_1=1;
							IS_TODAY_A_WORK_DAY="";
							WORKING_ACTIVATION_KEY_1=0;
						}
						//+++END OF CONDITION+++//
						
						
						if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==0 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==1 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equals("") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==0 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equals("") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==1) {
							WORKING_ACTIVATION_KEY_2=1;
						}
						//+++END OF CONDITION+++//
						
						//++++++++++++++++++++++++++++++//
						//+++END OF NOT WORKING LOGIC+++//
						//++++++++++++++++++++++++++++++//
						
					//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
						
					}
					
					//++++++++++++++++++++++++++//
					//+++END OF INFINITE LOOP+++//
					//++++++++++++++++++++++++++//
					
					
					
			
			
			
			
		}
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		public static void Employee_2() {
			
			
			//++++WORK SCHEDULE - 24 HOUR TIME+++//
			int WORK_SHIFT_START_HOUR=8;
			int WORK_SHIFT_START_MINUTE=30;

			int WORK_SHIFT_END_HOUR=17;
			int WORK_SHIFT_END_MINUTE=30;
			
			String DAYS_TO_WORK="Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday";
			String DAYS_TO_WORK_UPPERCASE=DAYS_TO_WORK.toUpperCase();
			//++++++++++++++++++++//
	
			
			//+++SET AI NAME+++//
			String AI_NAME="Employee 2";
			//+++++++++++++++++//
			
			String DAY_OF_THE_WEEK="";
			
			String AM_I_AUTHORIZED_TO_BEGIN_WORK="";
			
			String SWITCH="";
			
			String TIME_STRING="";
			String TIME_HOUR_STRING="";
			String TIME_MINUTE_STRING="";
			
			String IS_TODAY_A_WORK_DAY="";
			
			int IS_TODAYS_WORKING_SHIFT_OVER_KEY=0;
			
			int DAY=0;
			char ENTER=10;
			
			int TIME_HOUR_NUMBER=0;
			int TIME_MINUTE_NUMBER=0;
			
			int ACTIVATION_KEY_1=0;
			
			int WORKING_ACTIVATION_KEY_1=0;
			int WORKING_ACTIVATION_KEY_2=0;
		
			
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
			
			
			SWITCH="ON";
			
			
			//+++++++++++++++++++//
			//+++INFINITE LOOP+++//
			//+++++++++++++++++++//
			
			while (SWITCH.equalsIgnoreCase("ON")) {
				
				//++++++++++++++++++++++++++++++++++++++//
				//+++DETERMINE IF TODAY IS A WORK DAY+++//
				//++++++++++++++++++++++++++++++++++++++//
				
				//+++GET THE DAY OF THE WEEK+++//
				Calendar calendar=Calendar.getInstance();
				DAY=calendar.get(Calendar.DAY_OF_WEEK);
				if (DAY==1) {DAY_OF_THE_WEEK="SUNDAY";} 
				if (DAY==2) {DAY_OF_THE_WEEK="MONDAY";}
				if (DAY==3) {DAY_OF_THE_WEEK="TUESDAY";}
				if (DAY==4) {DAY_OF_THE_WEEK="WEDNESDAY";}
				if (DAY==5) {DAY_OF_THE_WEEK="THURSDAY";}
				if (DAY==6) {DAY_OF_THE_WEEK="FRIDAY";}
				if (DAY==7) {DAY_OF_THE_WEEK="SATURDAY";}
				//-----------------------------//
						
				if (DAYS_TO_WORK_UPPERCASE.contains(DAY_OF_THE_WEEK)) {
					IS_TODAY_A_WORK_DAY="YES";	
				}
				//+++END OF CONDITION+++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				//++++++++++++++++++++++//
				//+++TIME PROGRAMMING+++//
				//++++++++++++++++++++++//
				
				LocalTime TIME=LocalTime.now();
				LocalDate DATE=LocalDate.now();
				
				//----------//
				
				TIME_STRING=String.valueOf(TIME);
				
				try {
					TIME_HOUR_STRING=TIME_STRING.substring(0,2);
				} catch (StringIndexOutOfBoundsException e) {}
				
				
				try {
					TIME_MINUTE_STRING=TIME_STRING.substring(3,5);
				} catch (StringIndexOutOfBoundsException e) {}
				
				
				TIME_HOUR_NUMBER=Integer.valueOf(TIME_HOUR_STRING);
				TIME_MINUTE_NUMBER=Integer.valueOf(TIME_MINUTE_STRING);
				
				//+++++++++++++++++++++++++++++//
				//+++END OF TIME PROGRAMMING+++//
				//+++++++++++++++++++++++++++++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				
				
				
				
				
				//+++DETERMINE IF I SHOULD START WORKING+++//
				
					if (TIME_HOUR_NUMBER==WORK_SHIFT_START_HOUR && TIME_MINUTE_NUMBER>=WORK_SHIFT_START_MINUTE || TIME_HOUR_NUMBER>WORK_SHIFT_START_HOUR && TIME_HOUR_NUMBER<WORK_SHIFT_END_HOUR || TIME_HOUR_NUMBER==WORK_SHIFT_END_HOUR && TIME_MINUTE_NUMBER<WORK_SHIFT_END_MINUTE) {
						AM_I_AUTHORIZED_TO_BEGIN_WORK="YES";
					}
					//+++END OF CONDIITON+++//
					
				//+++++++++++++++++++++++++++++++++++++++++//
					
					
				
					
				//+++DETERMINE WHEN I SHOULD STOP WORKING+++//
					
					if (TIME_HOUR_NUMBER==WORK_SHIFT_END_HOUR && TIME_MINUTE_NUMBER>=WORK_SHIFT_END_MINUTE || TIME_HOUR_NUMBER>WORK_SHIFT_END_HOUR) {
						AM_I_AUTHORIZED_TO_BEGIN_WORK="NO";
					}
					//+++END OF CONDITION+++//
					
				//++++++++++++++++++++++++++++++++++++++++++//
					
					
					
				//++++++++++++++++++++++++++++++++++++++++++++++++++//
				//+++END OF DETERMINING IF I SHOULD START WORKING+++//
				//++++++++++++++++++++++++++++++++++++++++++++++++++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				//+++++++++++++++++++//
				//+++START WORKING+++//
				//+++++++++++++++++++//
				
				if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("YES") && WORKING_ACTIVATION_KEY_1==0 && IS_TODAY_A_WORK_DAY.equalsIgnoreCase("YES")) {
					
					
					System.out.println(AI_NAME+" clocked in.");
					WORKING_ACTIVATION_KEY_1=1;
					
					//+++IMPORT THE AI CAREER, OR JOB HERE+++//
					Career_Database.career_1();;
					
					
					
				}
				//+++END OF CONDITION FOR AUTHORIZATION TO WORK+++//
				
				//+++++++++++++++++++++++//
				//+++END OF WORK LOGIC+++//
				//+++++++++++++++++++++++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				//++++++++++++++++++++++//
				//+++NOT WORKING LOGIC++//
				//++++++++++++++++++++++//
				
				if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_1==1 && ACTIVATION_KEY_1==0) {
					System.out.println(AI_NAME+" clocked out.");
					ACTIVATION_KEY_1=1;
					IS_TODAY_A_WORK_DAY="";
					WORKING_ACTIVATION_KEY_1=0;
				}
				//+++END OF CONDITION+++//
				
				
				if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==0 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==1 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equals("") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==0 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equals("") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==1) {
					WORKING_ACTIVATION_KEY_2=1;
				}
				//+++END OF CONDITION+++//
				
				//++++++++++++++++++++++++++++++//
				//+++END OF NOT WORKING LOGIC+++//
				//++++++++++++++++++++++++++++++//
				
			//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
			}
			
			//++++++++++++++++++++++++++//
			//+++END OF INFINITE LOOP+++//
			//++++++++++++++++++++++++++//
			
			
		
			
		}
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		public static void Employee_3() {
			
			
			//++++WORK SCHEDULE - 24 HOUR TIME+++//
			int WORK_SHIFT_START_HOUR=8;
			int WORK_SHIFT_START_MINUTE=30;

			int WORK_SHIFT_END_HOUR=17;
			int WORK_SHIFT_END_MINUTE=30;
			
			String DAYS_TO_WORK="Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday";
			String DAYS_TO_WORK_UPPERCASE=DAYS_TO_WORK.toUpperCase();
			//++++++++++++++++++++//
	
			
			//+++SET AI NAME+++//
			String AI_NAME="Employee 3";
			//+++++++++++++++++//
			
			String DAY_OF_THE_WEEK="";
			
			String AM_I_AUTHORIZED_TO_BEGIN_WORK="";
			
			String SWITCH="";
			
			String TIME_STRING="";
			String TIME_HOUR_STRING="";
			String TIME_MINUTE_STRING="";
			
			String IS_TODAY_A_WORK_DAY="";
			
			int IS_TODAYS_WORKING_SHIFT_OVER_KEY=0;
			
			int DAY=0;
			char ENTER=10;
			
			int TIME_HOUR_NUMBER=0;
			int TIME_MINUTE_NUMBER=0;
			
			int ACTIVATION_KEY_1=0;
			
			int WORKING_ACTIVATION_KEY_1=0;
			int WORKING_ACTIVATION_KEY_2=0;
		
			
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
			
			
			SWITCH="ON";
			
			
			//+++++++++++++++++++//
			//+++INFINITE LOOP+++//
			//+++++++++++++++++++//
			
			while (SWITCH.equalsIgnoreCase("ON")) {
				
				//++++++++++++++++++++++++++++++++++++++//
				//+++DETERMINE IF TODAY IS A WORK DAY+++//
				//++++++++++++++++++++++++++++++++++++++//
				
				//+++GET THE DAY OF THE WEEK+++//
				Calendar calendar=Calendar.getInstance();
				DAY=calendar.get(Calendar.DAY_OF_WEEK);
				if (DAY==1) {DAY_OF_THE_WEEK="SUNDAY";} 
				if (DAY==2) {DAY_OF_THE_WEEK="MONDAY";}
				if (DAY==3) {DAY_OF_THE_WEEK="TUESDAY";}
				if (DAY==4) {DAY_OF_THE_WEEK="WEDNESDAY";}
				if (DAY==5) {DAY_OF_THE_WEEK="THURSDAY";}
				if (DAY==6) {DAY_OF_THE_WEEK="FRIDAY";}
				if (DAY==7) {DAY_OF_THE_WEEK="SATURDAY";}
				//-----------------------------//
						
				if (DAYS_TO_WORK_UPPERCASE.contains(DAY_OF_THE_WEEK)) {
					IS_TODAY_A_WORK_DAY="YES";	
				}
				//+++END OF CONDITION+++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				//++++++++++++++++++++++//
				//+++TIME PROGRAMMING+++//
				//++++++++++++++++++++++//
				
				LocalTime TIME=LocalTime.now();
				LocalDate DATE=LocalDate.now();
				
				//----------//
				
				TIME_STRING=String.valueOf(TIME);
				
				try {
					TIME_HOUR_STRING=TIME_STRING.substring(0,2);
				} catch (StringIndexOutOfBoundsException e) {}
				
				
				try {
					TIME_MINUTE_STRING=TIME_STRING.substring(3,5);
				} catch (StringIndexOutOfBoundsException e) {}
				
				
				TIME_HOUR_NUMBER=Integer.valueOf(TIME_HOUR_STRING);
				TIME_MINUTE_NUMBER=Integer.valueOf(TIME_MINUTE_STRING);
				
				//+++++++++++++++++++++++++++++//
				//+++END OF TIME PROGRAMMING+++//
				//+++++++++++++++++++++++++++++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				
				
				
				
				
				//+++DETERMINE IF I SHOULD START WORKING+++//
				
					if (TIME_HOUR_NUMBER==WORK_SHIFT_START_HOUR && TIME_MINUTE_NUMBER>=WORK_SHIFT_START_MINUTE || TIME_HOUR_NUMBER>WORK_SHIFT_START_HOUR && TIME_HOUR_NUMBER<WORK_SHIFT_END_HOUR || TIME_HOUR_NUMBER==WORK_SHIFT_END_HOUR && TIME_MINUTE_NUMBER<WORK_SHIFT_END_MINUTE) {
						AM_I_AUTHORIZED_TO_BEGIN_WORK="YES";
					}
					//+++END OF CONDIITON+++//
					
				//+++++++++++++++++++++++++++++++++++++++++//
					
					
				
					
				//+++DETERMINE WHEN I SHOULD STOP WORKING+++//
					
					if (TIME_HOUR_NUMBER==WORK_SHIFT_END_HOUR && TIME_MINUTE_NUMBER>=WORK_SHIFT_END_MINUTE || TIME_HOUR_NUMBER>WORK_SHIFT_END_HOUR) {
						AM_I_AUTHORIZED_TO_BEGIN_WORK="NO";
					}
					//+++END OF CONDITION+++//
					
				//++++++++++++++++++++++++++++++++++++++++++//
					
					
					
				//++++++++++++++++++++++++++++++++++++++++++++++++++//
				//+++END OF DETERMINING IF I SHOULD START WORKING+++//
				//++++++++++++++++++++++++++++++++++++++++++++++++++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				//+++++++++++++++++++//
				//+++START WORKING+++//
				//+++++++++++++++++++//
				
				if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("YES") && WORKING_ACTIVATION_KEY_1==0 && IS_TODAY_A_WORK_DAY.equalsIgnoreCase("YES")) {
					
					
					System.out.println(AI_NAME+" clocked in.");
					WORKING_ACTIVATION_KEY_1=1;
					
					//+++IMPORT THE AI CAREER, OR JOB HERE+++//
					Career_Database.career_1();;
					
					
					
				}
				//+++END OF CONDITION FOR AUTHORIZATION TO WORK+++//
				
				//+++++++++++++++++++++++//
				//+++END OF WORK LOGIC+++//
				//+++++++++++++++++++++++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				//++++++++++++++++++++++//
				//+++NOT WORKING LOGIC++//
				//++++++++++++++++++++++//
				
				if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_1==1 && ACTIVATION_KEY_1==0) {
					System.out.println(AI_NAME+" clocked out.");
					ACTIVATION_KEY_1=1;
					IS_TODAY_A_WORK_DAY="";
					WORKING_ACTIVATION_KEY_1=0;
				}
				//+++END OF CONDITION+++//
				
				
				if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==0 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==1 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equals("") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==0 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equals("") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==1) {
					WORKING_ACTIVATION_KEY_2=1;
				}
				//+++END OF CONDITION+++//
				
				//++++++++++++++++++++++++++++++//
				//+++END OF NOT WORKING LOGIC+++//
				//++++++++++++++++++++++++++++++//
				
			//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
			}
			
			//++++++++++++++++++++++++++//
			//+++END OF INFINITE LOOP+++//
			//++++++++++++++++++++++++++//
			
			
			
			
			
		}
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		public static void Employee_4() {
			
			//++++WORK SCHEDULE - 24 HOUR TIME+++//
			int WORK_SHIFT_START_HOUR=8;
			int WORK_SHIFT_START_MINUTE=30;

			int WORK_SHIFT_END_HOUR=17;
			int WORK_SHIFT_END_MINUTE=30;
			
			String DAYS_TO_WORK="Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday";
			String DAYS_TO_WORK_UPPERCASE=DAYS_TO_WORK.toUpperCase();
			//++++++++++++++++++++//
	
			
			//+++SET AI NAME+++//
			String AI_NAME="Employee 4";
			//+++++++++++++++++//
			
			String DAY_OF_THE_WEEK="";
			
			String AM_I_AUTHORIZED_TO_BEGIN_WORK="";
			
			String SWITCH="";
			
			String TIME_STRING="";
			String TIME_HOUR_STRING="";
			String TIME_MINUTE_STRING="";
			
			String IS_TODAY_A_WORK_DAY="";
			
			int IS_TODAYS_WORKING_SHIFT_OVER_KEY=0;
			
			int DAY=0;
			char ENTER=10;
			
			int TIME_HOUR_NUMBER=0;
			int TIME_MINUTE_NUMBER=0;
			
			int ACTIVATION_KEY_1=0;
			
			int WORKING_ACTIVATION_KEY_1=0;
			int WORKING_ACTIVATION_KEY_2=0;
		
			
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
			
			
			SWITCH="ON";
			
			
			//+++++++++++++++++++//
			//+++INFINITE LOOP+++//
			//+++++++++++++++++++//
			
			while (SWITCH.equalsIgnoreCase("ON")) {
				
				//++++++++++++++++++++++++++++++++++++++//
				//+++DETERMINE IF TODAY IS A WORK DAY+++//
				//++++++++++++++++++++++++++++++++++++++//
				
				//+++GET THE DAY OF THE WEEK+++//
				Calendar calendar=Calendar.getInstance();
				DAY=calendar.get(Calendar.DAY_OF_WEEK);
				if (DAY==1) {DAY_OF_THE_WEEK="SUNDAY";} 
				if (DAY==2) {DAY_OF_THE_WEEK="MONDAY";}
				if (DAY==3) {DAY_OF_THE_WEEK="TUESDAY";}
				if (DAY==4) {DAY_OF_THE_WEEK="WEDNESDAY";}
				if (DAY==5) {DAY_OF_THE_WEEK="THURSDAY";}
				if (DAY==6) {DAY_OF_THE_WEEK="FRIDAY";}
				if (DAY==7) {DAY_OF_THE_WEEK="SATURDAY";}
				//-----------------------------//
						
				if (DAYS_TO_WORK_UPPERCASE.contains(DAY_OF_THE_WEEK)) {
					IS_TODAY_A_WORK_DAY="YES";	
				}
				//+++END OF CONDITION+++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				//++++++++++++++++++++++//
				//+++TIME PROGRAMMING+++//
				//++++++++++++++++++++++//
				
				LocalTime TIME=LocalTime.now();
				LocalDate DATE=LocalDate.now();
				
				//----------//
				
				TIME_STRING=String.valueOf(TIME);
				
				try {
					TIME_HOUR_STRING=TIME_STRING.substring(0,2);
				} catch (StringIndexOutOfBoundsException e) {}
				
				
				try {
					TIME_MINUTE_STRING=TIME_STRING.substring(3,5);
				} catch (StringIndexOutOfBoundsException e) {}
				
				
				TIME_HOUR_NUMBER=Integer.valueOf(TIME_HOUR_STRING);
				TIME_MINUTE_NUMBER=Integer.valueOf(TIME_MINUTE_STRING);
				
				//+++++++++++++++++++++++++++++//
				//+++END OF TIME PROGRAMMING+++//
				//+++++++++++++++++++++++++++++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				
				
				
				
				
				//+++DETERMINE IF I SHOULD START WORKING+++//
				
					if (TIME_HOUR_NUMBER==WORK_SHIFT_START_HOUR && TIME_MINUTE_NUMBER>=WORK_SHIFT_START_MINUTE || TIME_HOUR_NUMBER>WORK_SHIFT_START_HOUR && TIME_HOUR_NUMBER<WORK_SHIFT_END_HOUR || TIME_HOUR_NUMBER==WORK_SHIFT_END_HOUR && TIME_MINUTE_NUMBER<WORK_SHIFT_END_MINUTE) {
						AM_I_AUTHORIZED_TO_BEGIN_WORK="YES";
					}
					//+++END OF CONDIITON+++//
					
				//+++++++++++++++++++++++++++++++++++++++++//
					
					
				
					
				//+++DETERMINE WHEN I SHOULD STOP WORKING+++//
					
					if (TIME_HOUR_NUMBER==WORK_SHIFT_END_HOUR && TIME_MINUTE_NUMBER>=WORK_SHIFT_END_MINUTE || TIME_HOUR_NUMBER>WORK_SHIFT_END_HOUR) {
						AM_I_AUTHORIZED_TO_BEGIN_WORK="NO";
					}
					//+++END OF CONDITION+++//
					
				//++++++++++++++++++++++++++++++++++++++++++//
					
					
					
				//++++++++++++++++++++++++++++++++++++++++++++++++++//
				//+++END OF DETERMINING IF I SHOULD START WORKING+++//
				//++++++++++++++++++++++++++++++++++++++++++++++++++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				//+++++++++++++++++++//
				//+++START WORKING+++//
				//+++++++++++++++++++//
				
				if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("YES") && WORKING_ACTIVATION_KEY_1==0 && IS_TODAY_A_WORK_DAY.equalsIgnoreCase("YES")) {
					
					
					System.out.println(AI_NAME+" clocked in.");
					WORKING_ACTIVATION_KEY_1=1;
					
					//+++IMPORT THE AI CAREER, OR JOB HERE+++//
					Career_Database.career_1();;
					
					
					
				}
				//+++END OF CONDITION FOR AUTHORIZATION TO WORK+++//
				
				//+++++++++++++++++++++++//
				//+++END OF WORK LOGIC+++//
				//+++++++++++++++++++++++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				//++++++++++++++++++++++//
				//+++NOT WORKING LOGIC++//
				//++++++++++++++++++++++//
				
				if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_1==1 && ACTIVATION_KEY_1==0) {
					System.out.println(AI_NAME+" clocked out.");
					ACTIVATION_KEY_1=1;
					IS_TODAY_A_WORK_DAY="";
					WORKING_ACTIVATION_KEY_1=0;
				}
				//+++END OF CONDITION+++//
				
				
				if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==0 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==1 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equals("") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==0 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equals("") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==1) {
					WORKING_ACTIVATION_KEY_2=1;
				}
				//+++END OF CONDITION+++//
				
				//++++++++++++++++++++++++++++++//
				//+++END OF NOT WORKING LOGIC+++//
				//++++++++++++++++++++++++++++++//
				
			//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
			}
			
			//++++++++++++++++++++++++++//
			//+++END OF INFINITE LOOP+++//
			//++++++++++++++++++++++++++//
			
			
			
			
		}
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		public static void Employee_5() {
			
			//++++WORK SCHEDULE - 24 HOUR TIME+++//
			int WORK_SHIFT_START_HOUR=8;
			int WORK_SHIFT_START_MINUTE=30;

			int WORK_SHIFT_END_HOUR=17;
			int WORK_SHIFT_END_MINUTE=30;
			
			String DAYS_TO_WORK="Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday";
			String DAYS_TO_WORK_UPPERCASE=DAYS_TO_WORK.toUpperCase();
			//++++++++++++++++++++//
	
			
			//+++SET AI NAME+++//
			String AI_NAME="Employee 5";
			//+++++++++++++++++//
			
			String DAY_OF_THE_WEEK="";
			
			String AM_I_AUTHORIZED_TO_BEGIN_WORK="";
			
			String SWITCH="";
			
			String TIME_STRING="";
			String TIME_HOUR_STRING="";
			String TIME_MINUTE_STRING="";
			
			String IS_TODAY_A_WORK_DAY="";
			
			int IS_TODAYS_WORKING_SHIFT_OVER_KEY=0;
			
			int DAY=0;
			char ENTER=10;
			
			int TIME_HOUR_NUMBER=0;
			int TIME_MINUTE_NUMBER=0;
			
			int ACTIVATION_KEY_1=0;
			
			int WORKING_ACTIVATION_KEY_1=0;
			int WORKING_ACTIVATION_KEY_2=0;
		
			
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
			
			
			SWITCH="ON";
			
			
			//+++++++++++++++++++//
			//+++INFINITE LOOP+++//
			//+++++++++++++++++++//
			
			while (SWITCH.equalsIgnoreCase("ON")) {
				
				//++++++++++++++++++++++++++++++++++++++//
				//+++DETERMINE IF TODAY IS A WORK DAY+++//
				//++++++++++++++++++++++++++++++++++++++//
				
				//+++GET THE DAY OF THE WEEK+++//
				Calendar calendar=Calendar.getInstance();
				DAY=calendar.get(Calendar.DAY_OF_WEEK);
				if (DAY==1) {DAY_OF_THE_WEEK="SUNDAY";} 
				if (DAY==2) {DAY_OF_THE_WEEK="MONDAY";}
				if (DAY==3) {DAY_OF_THE_WEEK="TUESDAY";}
				if (DAY==4) {DAY_OF_THE_WEEK="WEDNESDAY";}
				if (DAY==5) {DAY_OF_THE_WEEK="THURSDAY";}
				if (DAY==6) {DAY_OF_THE_WEEK="FRIDAY";}
				if (DAY==7) {DAY_OF_THE_WEEK="SATURDAY";}
				//-----------------------------//
						
				if (DAYS_TO_WORK_UPPERCASE.contains(DAY_OF_THE_WEEK)) {
					IS_TODAY_A_WORK_DAY="YES";	
				}
				//+++END OF CONDITION+++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				//++++++++++++++++++++++//
				//+++TIME PROGRAMMING+++//
				//++++++++++++++++++++++//
				
				LocalTime TIME=LocalTime.now();
				LocalDate DATE=LocalDate.now();
				
				//----------//
				
				TIME_STRING=String.valueOf(TIME);
				
				try {
					TIME_HOUR_STRING=TIME_STRING.substring(0,2);
				} catch (StringIndexOutOfBoundsException e) {}
				
				
				try {
					TIME_MINUTE_STRING=TIME_STRING.substring(3,5);
				} catch (StringIndexOutOfBoundsException e) {}
				
				
				TIME_HOUR_NUMBER=Integer.valueOf(TIME_HOUR_STRING);
				TIME_MINUTE_NUMBER=Integer.valueOf(TIME_MINUTE_STRING);
				
				//+++++++++++++++++++++++++++++//
				//+++END OF TIME PROGRAMMING+++//
				//+++++++++++++++++++++++++++++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				
				
				
				
				
				//+++DETERMINE IF I SHOULD START WORKING+++//
				
					if (TIME_HOUR_NUMBER==WORK_SHIFT_START_HOUR && TIME_MINUTE_NUMBER>=WORK_SHIFT_START_MINUTE || TIME_HOUR_NUMBER>WORK_SHIFT_START_HOUR && TIME_HOUR_NUMBER<WORK_SHIFT_END_HOUR || TIME_HOUR_NUMBER==WORK_SHIFT_END_HOUR && TIME_MINUTE_NUMBER<WORK_SHIFT_END_MINUTE) {
						AM_I_AUTHORIZED_TO_BEGIN_WORK="YES";
					}
					//+++END OF CONDIITON+++//
					
				//+++++++++++++++++++++++++++++++++++++++++//
					
					
				
					
				//+++DETERMINE WHEN I SHOULD STOP WORKING+++//
					
					if (TIME_HOUR_NUMBER==WORK_SHIFT_END_HOUR && TIME_MINUTE_NUMBER>=WORK_SHIFT_END_MINUTE || TIME_HOUR_NUMBER>WORK_SHIFT_END_HOUR) {
						AM_I_AUTHORIZED_TO_BEGIN_WORK="NO";
					}
					//+++END OF CONDITION+++//
					
				//++++++++++++++++++++++++++++++++++++++++++//
					
					
					
				//++++++++++++++++++++++++++++++++++++++++++++++++++//
				//+++END OF DETERMINING IF I SHOULD START WORKING+++//
				//++++++++++++++++++++++++++++++++++++++++++++++++++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				//+++++++++++++++++++//
				//+++START WORKING+++//
				//+++++++++++++++++++//
				
				if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("YES") && WORKING_ACTIVATION_KEY_1==0 && IS_TODAY_A_WORK_DAY.equalsIgnoreCase("YES")) {
					
					
					System.out.println(AI_NAME+" clocked in.");
					WORKING_ACTIVATION_KEY_1=1;
					
					//+++IMPORT THE AI CAREER, OR JOB HERE+++//
					Career_Database.career_1();;
					
					
					
				}
				//+++END OF CONDITION FOR AUTHORIZATION TO WORK+++//
				
				//+++++++++++++++++++++++//
				//+++END OF WORK LOGIC+++//
				//+++++++++++++++++++++++//
				
				//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
				//++++++++++++++++++++++//
				//+++NOT WORKING LOGIC++//
				//++++++++++++++++++++++//
				
				if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_1==1 && ACTIVATION_KEY_1==0) {
					System.out.println(AI_NAME+" clocked out.");
					ACTIVATION_KEY_1=1;
					IS_TODAY_A_WORK_DAY="";
					WORKING_ACTIVATION_KEY_1=0;
				}
				//+++END OF CONDITION+++//
				
				
				if (AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==0 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equalsIgnoreCase("NO") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==1 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equals("") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==0 || AM_I_AUTHORIZED_TO_BEGIN_WORK.equals("") && WORKING_ACTIVATION_KEY_2==0 && WORKING_ACTIVATION_KEY_1==1) {
					WORKING_ACTIVATION_KEY_2=1;
				}
				//+++END OF CONDITION+++//
				
				//++++++++++++++++++++++++++++++//
				//+++END OF NOT WORKING LOGIC+++//
				//++++++++++++++++++++++++++++++//
				
			//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------//
				
			}
			
			//++++++++++++++++++++++++++//
			//+++END OF INFINITE LOOP+++//
			//++++++++++++++++++++++++++//
			
			
			
			
			
		}
		
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
