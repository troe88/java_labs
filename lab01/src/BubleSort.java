import java.util.Vector;

public class BubleSort {
	public static Vector<Integer> sort(Vector<Integer> data){
		int size = data.size();
		for(int i = 0; i < size - 1; i++)
			for(int j = 0; j < size - i - 1; j++){
				Integer a = data.get(j);
				Integer b = data.get(j + 1);
				if(a > b){
					data.set(j, b);
					data.set(j + 1, a);
				}
			}
		return data;
	}
}
