package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test2 {

	public static void main(String[] args) {
		List<Integer> score=new ArrayList<>(Arrays.asList(10,20,10,15,5,30,20));
		System.out.println(teamFormation(score, 2, 3));
		
	}
	
	public static long teamFormation(List<Integer> score,int team_size,int k) {
		long sum=0;
		if(score.size()<=k) {
			Collections.sort(score);
			List<Integer> score2=score.subList(score.size()-team_size,score.size());
			for(int i:score2)
				sum+=i;
		}else {
			for(int i=0;i<team_size;i++) {
				List<Integer> list1=score.subList(0,k);
				List<Integer> list2=score.subList(score.size()-k,score.size());
				int max=Collections.max(list1);
				if(Collections.max(list2)>max)
					max=Collections.max(list2);
				sum+=max;
				score.remove((Integer)max);
			}
		}
		return sum;
	}
	

}
