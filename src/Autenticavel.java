// definir um contrato Autenticável
	// quem assina o contrato precisa implementar: 
		// método setSenha
		// método autentica
// para isso, eu uso "implements" em vez de "extends"

public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
}
