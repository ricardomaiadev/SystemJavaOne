
public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Maria",1980);
		Pessoa x = new Pessoa("Pedro",1990);
		System.out.println(p.toString());
		System.out.println(x.toString());
		p.setNome("Maria Carvalho");
		p.setAnonasc(1986);
		System.out.println(p.toString());
		Estudante e = new Estudante("Joao" , 2003, "202219786 ", 8.5f, 9 );
		System.out.println(e.toString());
		e.setNota1(9.5f);
		System.out.println(e.toString());
		Tecnico t = new Tecnico ("Pedrinho", 1990, "Eletrico", "156658223" );
		System.out.println(t.toString());
		t.setSetor("Programador");
		System.out.println(t.toString());
	}
}
