import java.util.ArrayList;
import java.util.List;

public class getTargetSum {

	public static void main(String[] args) {
		int[] a = {2,5,9,11};
		int target=11;
		List<Integer> ls= new ArrayList<Integer>();
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					ls.add(i);
					ls.add(j);
					break;
				}
				if(!ls.isEmpty()) {
					break;
				}
			}
		}
		System.out.println("Output of index is : "+ls.toString());
	}
}
