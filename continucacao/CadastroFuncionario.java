package continucacao;



import basicas.Funcionario;

public class CadastroFuncionario {

 Funcionario[] func = new  Funcionario[5];
	int cont= 0 ;

	public void cadastrarFuncionario(Funcionario fun) {
	func[cont]=fun;
	
}
	public Funcionario[] listar() {
		return func;
	}
}