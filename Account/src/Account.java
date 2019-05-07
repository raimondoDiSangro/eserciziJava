
public class Account  {
	private String name; //variabile d'istanza contenente il nome dell'intestatario
	private double balance;
	
	//costruttore con inizializzazione
	public Account(String name, double balance) 
	{
		this.name = name;
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	
	//Metodo per impostare il nome
	public void setName(String name) 
	{
		this.name = name;
	}
	
	//Metodo per versare denaro
	public void deposit(double deposit) 
	{
		if (deposit > 0.0) 
		{
		balance = balance + deposit;
		}
	}
	
	//Metodo per prelavare denaro
	public void withdraw(double withdraw)
	{
		if (balance - withdraw >= 0) {
			balance -= withdraw;
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
}
