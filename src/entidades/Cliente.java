package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date aniversario;
	
	
	public Cliente() {
		super();
	}


	public Cliente(String nome, String email, Date aniversario) {
		super();
		this.nome = nome;
		this.email = email;
		this.aniversario = aniversario;
	}


	public static SimpleDateFormat getSdf() {
		return sdf;
	}


	public static void setSdf(SimpleDateFormat sdf) {
		Cliente.sdf = sdf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getAniversario() {
		return aniversario;
	}


	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", aniversario=" + aniversario + "]";
	}
	
	
	
	
	
	
}
