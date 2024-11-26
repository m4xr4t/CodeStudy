package leetcodeProblems;

public class LC1450 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		//for ST and ET, take index i and go
		// is qT in Range between STi and ETi
		//this would mean STi < qT < ETi
		
		int[] sT = startTime;
		int[] eT = endTime;
		int qT =queryTime;
		int students = 0;
		//st and eT have size of 1-100
		//sT and eT and qT integers can range 1-1000 (valid "times")
		
		//return how many indexes in st/et have range qT
		//example (100, 400) (500, 500) (300) only first valid
		for(int i = 0; i < sT.length; i++) {
			if(sT[i] <= qT && qT <= eT[i]) students++;
			continue;
			
		}
		return students;
	}

}
