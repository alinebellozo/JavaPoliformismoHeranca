// não pode instanciar objetos dessa classe, porque é abstrata
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	//protected double salario; // protected significa público apenas para si e para os filhos, as demais classes, não.
	
	// método sem corpo, não há implementação aqui, os filhos implementam
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
