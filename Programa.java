package aplicacao;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);	

	Produto produto = new Produto();
			
	System.out.println("Informe o produto que ser� cadastrado");
	produto.produto = teclado.next();
	
	System.out.println("Informe a quantidade");
	produto.quantidade = teclado.nextDouble();
	
	System.out.println("Informe o pre�o individual");
	produto.preco = teclado.nextDouble();
	
	System.out.println("confirma��o: " + produto.produto + ", Estoque atual: " + produto.quantidade + " , Pre�o: " + produto.preco);
	
	System.out.println("Deseja inserir mais produtos? Quantos: ");
	int estoque = teclado.nextInt();
	
	produto.addProduto(estoque);
	
	System.out.println("Atualiza��o: " + produto.produto + ", Estoque Atual: " + produto.quantidade + ", Pre�o: " + produto.preco);
	
	System.out.println("Atualmente, alguma venda foi realizada? ");
	estoque = teclado.nextInt();
	produto.subProduto(estoque);
	
	System.out.println("Atualiza��o p�s vendas: " + produto.produto + ", Estoque Atual: " + produto.quantidade + "Pre�o: " + produto.preco);
	
	teclado.close();
	
	}

}