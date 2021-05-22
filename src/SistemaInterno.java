
public class SistemaInterno {

	private int senha = 4444;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if (autenticou) {
			System.out.println("Entrada válida!");
		} else {
			System.out.println("Entrada inválida!");
		}
	}
	
}
