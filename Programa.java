package exemplo_poo;
import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
	
	Produto produto = new Produto();	
		
	System.out.println("Informe o produto que deseja cadastrar: ");
	
	produto.produto = teclado.next();
	
	System.out.println("Informe a quantidade: ");
	
	produto.quantidade = teclado.nextDouble();
	
	System.out.println("Informe o preço: ");
	
	produto.preco = teclado.nextDouble();
	
	System.out.println("Confirmação: " + produto.produto + "Estoque: " + produto.quantidade + "Preço: " + produto.preco);
	
	System.out.println("Quer adicionar mais itens para o estoque? Quantos: ");
	
	int estoque = teclado.nextInt();
	
	produto.addProduto(estoque);
	
	System.out.println("Atualização: " + produto.produto + "Estoque: " + produto.quantidade + "Preço: " + produto.preco);
	
	System.out.println("Atualmente, alguma venda foi realizada? ");
	
	estoque = teclado.nextInt();
	produto.subProduto(estoque);
			
	System.out.println("Atualização: " + produto.produto + "Estoque: " + produto.quantidade + "Preço: " + produto.preco +
			             "Venda: " + produto.preco*produto.quantidade);
	
	JOptionPane.showConfirmDialog(null, "Atualização pós vendas: " + produto.produto + "Estoque atual: " + produto.quantidade + ", Preço: "
			                        + produto.preco + "Valor atual do estoque " + produto.preco*produto.quantidade);
	
	teclado.close();
	}

}
