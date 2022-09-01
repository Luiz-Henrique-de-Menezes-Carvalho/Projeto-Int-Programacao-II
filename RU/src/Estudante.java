import java.time.LocalDate;

public class Estudante extends Usuario{
    
    public String matricula;

    public Estudante(String codigo, String nome, String cpf, LocalDate dataDeNascimento, String email, String senha) {
        super(codigo, nome, cpf, dataDeNascimento, email, senha);
        
    }
    
    public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

    @Override
    public String toString() {
        return String.format("Estudante: %s\nCPF: %s\nData de nascimento: %s\nE-mail: %s\nCódigo: %s\nQuantidade de refeições disponíveis: %d", super.getNome(),
                                super.getCpf(), super.getDataDeNascimento(), super.getEmail(), super.getCodigo() );
    }

    

}
