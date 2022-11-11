import java.util.Calendar;
public class Pessoa {

	private String nome;
	private int anonasc;
	
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + CalculaIdade() + "]";
	}

	public Pessoa(String nome, int anonasc) {
		super();
		this.nome = nome;
		this.anonasc = anonasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnonasc() {
		return anonasc;
	}

	public void setAnonasc(int anonasc) {
		this.anonasc = anonasc;
	}
	
	public int CalculaIdade() {
		int idade;
		int anoatual = Calendar.getInstance().get(Calendar.YEAR);
		idade = anoatual - anonasc;
		return idade;
	}
	
}
