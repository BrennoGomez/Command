package ExemploGO;

public class Pai implements Familia{

	public String nome;
	public int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String dados(){
		return 	"NOME: "+ this.getNome() + " " +
				"IDADE: " + this.getIdade(); 
	}
}