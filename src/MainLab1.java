import java.util.Vector;

public class MainLab1 {
	public static void printHelp(){
		
	}
	public static void main(String[] args) {
		Vector<Integer> data = new Vector<Integer>(args.length);
		try {
			for(int i = 0; i < args.length; i++)
				data.add(Integer.parseInt(args[i]));
		} 
		catch(NumberFormatException e) {
			printHelp();
			System.exit(1);			
		}
		System.out.print("Input : " + data + "\n");
		BubleSort.sort(data);
		System.out.print("Output: " + data + "\n");	
	}
}
