package lessons_EU7.day8_controlFlowStatements_Part2;

public class Task39 {

	public static void main(String[] args) {
		
		char light='G';
		
		switch (light) {
		
		case 'r':case 'R':
			System.out.println("Red");
			break;
		case 'o':case 'O':
			System.out.println("Orange");
			break;
					
		case 'g':
			System.out.println("Green");
			break;	
		case 'G':
			System.out.println("Greenn");
			break;
		default:
			System.out.println("Invalid color");
				
		}

	}

}
