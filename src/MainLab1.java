import java.util.Vector;

public class MainLab1 {
	public static void main(String[] args) {
		Vector<Integer> data = new Vector<Integer>(args.length);
		for(int i = 0; i < args.length; i++)
			data.add(Integer.parseInt(args[i]));

		System.out.print("Input : " + data + "\n");
		BubleSort.sort(data);
		System.out.print("Output: " + data + "\n");	
	}
}
