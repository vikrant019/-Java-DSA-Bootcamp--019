//Kunal is allowed to go out with his friends only on the even days of a given month. 
//Write a program to count the number of days he can go out in the month of August.
public class Q26_theoryQue {

	public static void main(String[] args) {
		int monthDays=31;
		int totalDays=0;
		for(int i=1; i<=monthDays; i++) {
			if(i%2==0) {
				totalDays++;
			}
			
		}
		System.out.println("Kunal out with his friends total day in August: "+totalDays);
	}

}
