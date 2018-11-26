
public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		
		nico.setNome("Nico Sepat");
		nico.setCpf("121121121-08");
		nico.setSalario(2000.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
		
	}

}
