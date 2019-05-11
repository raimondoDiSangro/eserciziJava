//Classe driver per provare Account

import java.util.Scanner;

public class AccountTest {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nameOwn;
		double balance;
		int ch;
		
		System.out.printf("Inserisci nome intestatario -> ");
		nameOwn = input.nextLine();
		System.out.printf("Inserisci il deposito iniziale -> ");
		balance = input.nextDouble();
		
		Account myAccount = new Account(nameOwn, balance);
		//Account myAccount2 = new Account("Giovanni Rossi", 90123.70);
		do {
				System.out.println("OPERAZIONI DISPONIBILI: ");
				System.out.println("1. DEPOSITA DENARO ");
				System.out.println("2. PRELEVA DENARO ");
				System.out.println("3. CONCEDI FIDO ");
				System.out.println("4. MOSTRA SALDO ");
				System.out.println("5. MOSTRA FIDO ");
				System.out.println("0. ESCI ");
				System.out.println("Scegliere operazione-> ");
				ch = input.nextInt();

				switch(ch)
				{
					case 1: 
						System.out.println("Inserire valore deposito-> ");
						myAccount.deposit(input.nextDouble());
						break;
				
					case 2:
						System.out.println("Inserire valore da prelevare-> ");
						myAccount.withdraw(input.nextDouble());
						break;
					
					case 3:
						System.out.println("Inserire fido da concedere: ");
						myAccount.setCredit(input.nextDouble());
					
					
					case 4:
						System.out.println("INTESTATARIO " + myAccount.getName());
						System.out.println("SALDO "+ myAccount.getBalance());
						break;
					
					case 5:	
						System.out.println("INTESTATARIO " + myAccount.getName());
						System.out.println("FIDO " + myAccount.getCredit());
						break;
					
										
					case 0:
						System.out.println("Programma terminato, grazie e arrivederci");
						break;
				}
		}while (ch != 0);
		input.close();
	}
}
