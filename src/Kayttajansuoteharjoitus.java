import java.util.Scanner;

public class Kayttajansuoteharjoitus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

		
		Scanner in = new Scanner(System.in);
		
		String answer1;
		String answer2;
		String answer3;
		int sum;
		int miinus;
		
		
		// Lisätty muutos/commit: Kysy nimeä käyttäjältä
		String answer6;
		System.out.println("Mikä on etunimesi?");
		answer6 = in.nextLine();
		
		// Lisätty muutos/committi: Kysy sukunimeä käyttäjältä
		String answer7;
		System.out.println("Mikä on sukunimesi?");
		answer7 = in.nextLine();
		
		// Lisätty muutos/comitti: Ohjelma tulostaa käyttäjän koko nimen.
		System.out.println("Nimesi on " + answer6 + " " + answer7 + ".");

//		1. Pyydä käyttäjää kirjoittamaan numero
		System.out.println("Kirjoita 1. numero");
		answer1 = in.nextLine();

//		2. Kysy toista numeroa
		System.out.println("Kirjoita 2. numero");
		answer2 = in.nextLine();	
	
//
//		3. Summaa numerot ja tulosta tulos konsoliin.
		sum = Integer.parseInt(answer1) + Integer.parseInt(answer2);
		if (sum <= 11)
		System.out.println("Tulos on " + sum +".");
		
//		4. Jatka ohjelmaa siten, että jos tulos on yli 10, tulosta tähän tyyliin: “Tulos on yli 10. Tulos on...”. Muuten tulosta yllä olevalla tavalla.
		
		else {
		System.out.println("Tulos on yli 10. Tulos on "+ sum + ".");
		}
		
//		5. Jatka vielä siten, että kysyt käyttäjältä numeroiden kysymisen jälkeen, haluaako hän laskea luvut yhteen vai vähentää. Jos esimerkiksi käyttäjä haluaa vähentää, hän vastaa “miinus”.
		
		miinus = Integer.parseInt(answer1) - Integer.parseInt(answer2);
		System.out.println("Haluatko laskea luvut yteen vai vähentää. Kirjoita plus tai miinus.");
		answer3 = in.nextLine();
		if (answer3.equals("plus")) {
		System.out.println("Tulos on " + sum);
		}
		else if (answer3.equals("miinus")){
		System.out.println("Tulos on " + miinus);
		}
		
		
//		6. Tee uusi ohjelma tai jatka edellistä. Pyydä edelleen kaksi lukua ja jaa luvut. Tulosta jakolaskun tulos.
		
		
		double answer4;
		double answer5;
		double jako;
		
		System.out.println("Kirjoita 1. numero");
		answer4 = in.nextDouble(); 
		System.out.println(answer4);
		
		System.out.println("Kirjoita 2. numero");
		answer5 = in.nextDouble();
		System.out.println(answer5);
		
		jako = (answer4) / (answer5);
		System.out.println("Jakolaskun tulos on "+ jako);
		
		
		
		
		}
	}




