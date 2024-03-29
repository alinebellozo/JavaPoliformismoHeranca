// Gerente é um funcionário; Gerente herda da classe Funcionario, assina o contrato Autenticavel, é um autenticável
public class Gerente extends Funcionario implements Autenticavel {
		
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do gerente");
		return super.getSalario(); 
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}	

}

//substituo "this" por "super", porque o o atributo está definido em outra classe, na classe mãe, aka super classe