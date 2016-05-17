package start;


public class Main {

	public static void main(String[] args){
		final String USAGE = "Please run this program with flags \"-ax\", where x is the number of the task you want to run.";
		
		switch(args.length){
		case 1 : switch (args[0]){
			case "a1" : aufgabe1.Print.main(args);
						break;
			case "a2" : aufgabe2.Print.main(args);
						break;
			default : System.out.println(USAGE);
						break;
			}
			break;
		default: System.out.println(USAGE);
		break;
		}
	}
}
