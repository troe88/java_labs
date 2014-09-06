import java.util.Vector;

public class MainLab1 {
	public static void printHelp(){
		System.out.print("Input only 2 or more integer numbers\n");
		System.out.print("Example:java MainLab1 3 1 4 5\n");
	}
	public static void main(String[] args) {

		Vector<Integer> data = new Vector<Integer>(args.length);
		try {
			if(args.length < 2)
				throw new IllegalArgumentException();
			for(int i = 0; i < args.length; i++)
				data.add(Integer.parseInt(args[i]));
		} 
		catch(Exception e) {
			printHelp();
			System.exit(1);			
		}
		System.out.print("Input : " + data + "\n");
		BubleSort.sort(data);
		System.out.print("Output: " + data + "\n");	
	}
}
