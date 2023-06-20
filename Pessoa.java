
public class Pessoa {
	private String nome;
	private int idade;
    private float peso;
    private int anoNascimento;
    private Endereco endereco;
    private Setor setor;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public int getIdade (){
		return this.idade;
	}
	
	public void setIdade (int idade) {
		this.idade = idade;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public void setPeso (int peso) {
		this.peso = peso;
	}
	
	public int getAnoNascimento () {
		return this.anoNascimento;
	}
	
	public void setAnoNascimento (int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco (Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Setor getSetor() {
		return this.setor;
	}
	
	public void setSetor (Setor setor) {
		this.setor = setor;
	}
	
	

}
