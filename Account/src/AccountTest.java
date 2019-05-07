import java.util.Scanner;

public class AccountTest {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nameOwn;
		double balance;
		
		System.out.printf("Inserisci nome intestatario -> ");
		nameOwn = input.nextLine();
		System.out.printf("Inserisci il deposito iniziale -> ");
		balance = input.nextDouble();
		
		Account myAccount = new Account(nameOwn, balance);
		Account myAccount2 = new Account("Bettino Craxi", 90123.70);
		
		//myAccount.setName(nameOwn);
		
	
		System.out.println("INTESTATARIO " + myAccount.getName());
		System.out.println("SALDO "+ myAccount.getBalance());
		
		System.out.println("INTESTATARIO " + myAccount2.getName());
		System.out.println("SALDO "+ myAccount2.getBalance());
		
		System.out.println("Inserire valore deposito-> ");
		myAccount.deposit(input.nextDouble());
		System.out.println("Nuovo SALDO "+ myAccount.getBalance());
		
		System.out.println("Inserire denaro da prelevare-> ");
		myAccount.withdraw(input.nextDouble());
		System.out.println("Nuovo SALDO "+ myAccount.getBalance());
						
		input.close();
	}
}
