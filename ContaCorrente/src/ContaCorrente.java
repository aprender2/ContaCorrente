import java.util.Scanner;

import javax.swing.JOptionPane;



public class ContaCorrente 
{
	public String nomeTitu;
	public double saldo;
	public String senha;
	
	Scanner leitor = new Scanner(System.in);
	public void sacar (double valor)
	{
		valor =Double.parseDouble(JOptionPane.showInputDialog("digite o saque: "));
		
		
		if (valor>saldo)
			JOptionPane.showMessageDialog(null, "saldo insuficiente!\nseu saldo � de: "+ saldo);
			
		else
		{
			saldo = saldo - valor;
			JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso!");
	}

	public void depositar (double valor)
	{
		valor = Double.parseDouble (JOptionPane.showInputDialog("digite o deposito: "));
		
		
		saldo = saldo + valor;
	}
	
	public void verSaldo()
	{
		JOptionPane.showMessageDialog(null, "seu saldo � de:saldo);
	}





}



