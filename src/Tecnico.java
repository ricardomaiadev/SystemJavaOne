
public class Tecnico extends Pessoa {

	private String setor;
	private String siape;
	
	public Tecnico(String nome, int anonasc, String setor, String siape) {
		super(nome, anonasc);
		this.setor = setor;
		this.siape = siape;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	@Override
	public String toString() {
		return "Tecnico [ " + super.toString() + "Setor = " + setor + ", Siape = " + siape + "]";
	}
	
}
