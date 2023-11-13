public class MultiThread_Engine {

	public static void main() {
		
		
		int TOTAL_DEVICE_PROCESSORS;
		TOTAL_DEVICE_PROCESSORS=Runtime.getRuntime().availableProcessors();
		int TDP=TOTAL_DEVICE_PROCESSORS;
		
		int TOTAL_THREADS_DESIRED=25;
		
		
		
		for (int i=1;i<=TOTAL_THREADS_DESIRED;i++) {
			
			Employee_Manager ED = new Employee_Manager(i);
			Thread Manage_Employees_Thread = new Thread(ED);
			Manage_Employees_Thread.start();
			
		}
		//+++END OF LOOP+++//
		
		
		
		
		
	}
	//+++END OF MAIN OBJECT+++//
	
}
//+++END OF MAIN CLASS+++//
