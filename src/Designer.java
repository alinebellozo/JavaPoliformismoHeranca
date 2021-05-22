// Gerente é um funcionário; Gerente herda da classe Funcionario 
public class Designer extends Funcionario {
		
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do designer");
		return 200;
	}	

}
