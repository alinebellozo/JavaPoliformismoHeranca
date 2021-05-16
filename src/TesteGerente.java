
public class TesteGerente {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setCpf("987654321-09");
		g1.setSalario(6000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.autentica(9876);
		
		g1.setSenha(9876);
		boolean autenticou = g1.autentica(9876);
		System.out.println(autenticou);
	}
}
