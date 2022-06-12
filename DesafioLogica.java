package desafiologica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdTotalC, qtdTotalE, qtdTotalV;
		qtdTotalC = qtdTotalE = qtdTotalV = 0;
		double valorTotalC, valorTotalE, valorTotalV;
		valorTotalC = valorTotalE = valorTotalV = 0;
		
		int quantidadeProdutos = 0;
		while (quantidadeProdutos < 15) {
			System.out.print("\nCategoria do produto a ser adicionado: ");
			char categoria = Character.toUpperCase( sc.next().charAt(0) );
			
			double imposto, lucro;
			double valorProduto, valorImposto, valorLucro;
			
			switch (categoria) {
			case 'C':
					System.out.println("Categoria selecionada: Cama, mesa e banho");
					qtdTotalC++;
					imposto = 37.41 / 100;
					lucro = 30 / 100;
					
					System.out.print("Preço do produto: ");
					valorProduto = sc.nextDouble();
					
					valorImposto = valorProduto * imposto;
					valorLucro = valorProduto * lucro;
					
					valorTotalC += valorProduto + valorImposto + valorLucro;
					
					break;
			case 'E':
					System.out.println("Categoria selecionada: Eletrodomésticos");
					qtdTotalE++;
					imposto = 43.14 / 100;
					lucro = 35 / 100;
					
					System.out.print("Preço do produto: ");
					valorProduto = sc.nextDouble();
					
					valorImposto = valorProduto * imposto;
					valorLucro = valorProduto * lucro;
					
					valorTotalE += valorProduto + valorImposto + valorLucro;
					
					break;
			case 'V':
					System.out.println("Categoria selecionada: Vestuário");
					qtdTotalV++;
					imposto = 38.42 / 100;
					lucro = 50 / 100;
					
					System.out.print("Preço do produto: ");
					valorProduto = sc.nextDouble();
					
					valorImposto = valorProduto * imposto;
					valorLucro = valorProduto * lucro;
					
					valorTotalV += valorProduto + valorImposto + valorLucro;
					
					break;
				default:
					System.out.println("Categoria inexistente, as categorias são: C (cama, mesa e banho), E (eletrodomésticos) e V (vestuário)");
					continue; // Retorna para o começo do loop
			}
			
			quantidadeProdutos++;
		}
		
		System.out.printf("%-22s%-16s%-20s\n", "Categoria", "Quantidade", "Valor Total");
		System.out.printf("%-22s%-16d%-20.2f\n", "[C]ama, mesa e banho", qtdTotalC, valorTotalC);
		System.out.printf("%-22s%-16d%-20.2f\n", "[E]letrodomésticos", qtdTotalE, valorTotalE);
		System.out.printf("%-22s%-16d%-20.2f\n", "[V]estuário", qtdTotalV, valorTotalV);
		
		sc.close();
	}

}
