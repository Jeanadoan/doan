package switching;
import java.util.Scanner;
public class switchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println ("Put a grade score: ");
			int score = sc.nextInt(); 
			
			if (score>100) {
				System.out.println ("Invalid input: it cannot be more than 100");
			}
				else {
			
		switch(score) {
		case 100 :
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
			System.out.println ("Excellent");
			break ;
		
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			System.out.println ("Very good");
			break ;
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
			System.out.println ("Good");
			break;
		case 84:
		case 83:
		case 82:
		case 81:
		case 80:
			System.out.println ("Average");
			break;
		default:
			System.out.println ("You need to improve");
			break;

		}
	}
}
}

