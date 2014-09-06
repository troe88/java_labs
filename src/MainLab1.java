import java.util.Vector;

public class MainLab1 {
	public static void main(String[] args) {

		if(args.length < 2){
			System.out.print("What do you want to sort ?\n");
			System.out.print("Input only integer numbers\n");
			System.out.print("Example:java MainLab1 5 4 3 2 1\n");
			System.exit(1);
		}

		Vector<Integer> data = new Vector<Integer>(args.length);
		for(int i = 0; i < args.length; i++)
			data.add(Integer.parseInt(args[i]));

		System.out.print("Input : " + data + "\n");
		BubleSort.sort(data);
		System.out.print("Output: " + data + "\n");	
	}
}
