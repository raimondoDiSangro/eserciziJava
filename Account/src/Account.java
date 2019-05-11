
public class Account  {
	private String name; //variabile d'istanza contenente il nome dell'intestatario
	private double balance; //variabile che contiene il saldo del conto bancario
	private double credit; //variabile che contiene il fido
	
	//costruttore con inizializzazione
	//del nome dell'intestario del conto
	//e relativo bilancio iniziale che deve essere maggiore di 0
	public Account(String name, double balance) 
	{
		this.name = name;
		if (balance > 0.0) {
			this.balance = balance;
		}
		this.credit = 0;
	}
	
	//Metodo per impostare il nome dell'intestatario
	//del conto
	public void setName(String name) 
	{
		this.name = name;
	}
	
	//Metodo per versare denaro
	//Se viene inserito un numero minore o uguale a zero
	//il versamento non viene effettuato
	public void deposit(double deposit) 
	{
		if (deposit > 0.0) 
		{
		balance += deposit;
		} else {
			System.out.println("Operazione non effettuata, valore non consentito");
		}
	}
	
	//metodo per impostare il fido
	public void setCredit(double credit)
	{
		if (credit > 0.0) {
			this.credit = credit;
		} else {
			System.out.println("Operazione non effettuata, valore non consentito");
		}
	}
	
	//Metodo per prelevare denaro
	//se il saldo non è sufficiente a coprire il prelievo,
	//il prelievo non viene effettuato
	public void withdraw(double withdraw)
	{
		if (balance + credit - withdraw >= 0 && withdraw > 0.0) {
			balance -= withdraw;
		} else {
			System.out.println("Operazione non effettuata, fondi insufficienti");
		}
	}
	
	//Metodo per ottenere il nome
	public String getName()
	{
		return name;
	}
	
	//metodo per ottenere il saldo
	public double getBalance()
	{
		return balance;
	}
	
	//Metodo per ottenere il fidot
	public double getCredit()
	{
		return credit;
	}
}
