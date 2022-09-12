package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pedido;
import entidades.PedidoItem;
import entidades.Produto;
import entidades.enuns.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		
		System.out.println("Dados do cliente:");
		System.out.print("nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Aniversario (DD/MM/YYYY): ");
		Date aniversario = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, aniversario);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		
		Pedido pedido = new Pedido(new Date(),status,cliente);
		
	
		System.out.print("Quantos itens no pedido? ");
		int N = sc.nextInt();
		for (int i=1; i<=N; i++) {
			System.out.println("Entre com  #" + i + " item data:");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preco do produto: ");
			double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			PedidoItem it = new PedidoItem(quantidade, precoProduto, produto);
			
			pedido.addProduto(it);	
		}
		
		
	
		System.out.println(pedido);
		sc.close();

	}

}
