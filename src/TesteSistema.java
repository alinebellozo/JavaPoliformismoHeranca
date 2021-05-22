
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(4444);
		
		Administrador adm = new Administrador();
		adm.setSenha(3232);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(4444);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);
	
	}
}
