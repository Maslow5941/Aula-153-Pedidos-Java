package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enuns.StatusPedido;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private StatusPedido status;
	private Cliente cliente;
	private List<PedidoItem> items = new ArrayList<>();
	
	public Pedido(Date date, StatusPedido status2, Cliente cliente2) {
		super();
	}

	public Pedido(Date momento, StatusPedido status, Cliente cliente, List<PedidoItem> items) {
		super();
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
		this.items = items;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	public static void setSdf(SimpleDateFormat sdf) {
		Pedido.sdf = sdf;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<PedidoItem> getItems() {
		return items;
	}

	public void setItems(List<PedidoItem> items) {
		this.items = items;
	}
	
	public void addProduto(PedidoItem item) {
		items.add(item);
	}
	
	public void removerProduto(PedidoItem item) {
		items.remove(item);
		
	}
	
	public double total() {
		double soma = 0.0;
		for(PedidoItem it: items) {
			soma+=it.subtotal();
		}
		return soma;
		
	}

	@Override
	public String toString() {
		StringBuilder scBuilder = new StringBuilder();
		scBuilder.append("Momento do pedido: ");
		scBuilder.append(sdf.format(momento) + "\n");
		scBuilder.append("status do pedido: ");
		scBuilder.append(status + "\n");
		scBuilder.append("Cliente: ");
		scBuilder.append(cliente + "\n");
		scBuilder.append("Pedido:\n");
		for(PedidoItem item: items) {
			scBuilder.append(item+ "\n");
		}
		scBuilder.append("Preco total: ");
		scBuilder.append(String.format("%.2f", total()));
		return scBuilder.toString();
	}
	
		
	
	
	

}
