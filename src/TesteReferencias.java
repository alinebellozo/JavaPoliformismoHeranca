
public class TesteReferencias {

	public static void main(String[] args) {
	
		Gerente g1 = new Gerente();
		g1.setNome("Patrícia");
		g1.setSalario(6000.0);
	
		EditorVideo ev = new EditorVideo();
		ev.setSalario(3000.0);
		
		Designer d = new Designer();
		d.setSalario(3500.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(d);
		controle.registra(ev);
			
		System.out.println(controle.getSoma());
	}

}
