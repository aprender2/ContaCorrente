
public class TestContaCorrente 
{

	public static void main(String[] args) 
	{
		ContaCorrente c1 = new ContaCorrente();
		
		c1.nomeTitu = "italo";
		c1.saldo = 700;
		c1.senha = "exemplo";
		c1.verSaldo(); 
		c1.sacar(1000);
		
		c1.verSaldo();
		c1.depositar(5000);
		c1.verSaldo();
	}

}
