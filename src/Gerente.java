
public class Gerente extends Funcionario{
	
	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	

	public double getBonificacao() {
		System.out.println("Chamando o metodo de bonificação do Gerente");
		return salario;
	}
	
	public boolean autenticaSenha(int senha) {
		if (this.senha == senha) {	
			return true; 
		} else {
			return false;
		}
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

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
