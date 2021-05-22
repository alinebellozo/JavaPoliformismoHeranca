
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario mario = new Gerente();
		mario.setNome("Mário Silva");
		mario.setCpf("1234567890-12");
		mario.setSalario(3200.00);
		
		System.out.println(mario.getNome());
		System.out.println(mario.getBonificacao());
		
	}
}
