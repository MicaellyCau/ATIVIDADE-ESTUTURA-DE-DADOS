package principal;

import java.util.Arrays;

import basicas.Empresa;
import basicas.Funcionario;
import continucacao.CadastroEmpresa;
import continucacao.CadastroFuncionario;

public class Imprimir {
public static void main(String[] args) {
	Empresa emp1 = new Empresa("33.4432/0001", "harilla","(89) 9 64543212");
	Empresa emp2= new Empresa("333.4434/0001", "millian b", "(12)9 97677867");
	Empresa emp3 = new Empresa("64.44432/0001", "mari's baby","(32) 9 68685432");
	Empresa emp4 = new Empresa("56.6653/0001", "vega CELL", "(78) 9 93211123");
	Empresa emp5= new Empresa("37.77657/0001", "la casebre foods", "(65)43434212");
	
	Funcionario fun1 = new Funcionario("092.123.456-01","Mari Mar","54.37432-21","854656",emp1);
	Funcionario fun2 = new Funcionario("082.123.776-01","Mari Mari","34.65633-02","(32)  9 95843246",emp2);
	Funcionario fun3 = new Funcionario("192.255.255-01","Mari Maria","21.23654-80","(78) 9 88563221",emp5);
	Funcionario fun4 = new Funcionario("090.653.496-01","Maria Mali","32.98742-34","(13) 9 98685432",emp3);
	Funcionario fun5 = new Funcionario("071.113.459-01","Maria Malia","21.98212-98","(92)9 89899896",emp4);

	CadastroEmpresa em = new CadastroEmpresa();
	
	em.cadastrarEmpresa(emp1);
	em.cadastrarEmpresa(emp2);
	em.cadastrarEmpresa(emp5);
	em.cadastrarEmpresa(emp3);
	em.cadastrarEmpresa(emp4);
	
	CadastroFuncionario cafu = new CadastroFuncionario();
	
	cafu.cadastrarFuncionario(fun2);
	cafu.cadastrarFuncionario(fun1);
	cafu.cadastrarFuncionario(fun3);
	cafu.cadastrarFuncionario(fun5);
	cafu.cadastrarFuncionario(fun4);
	
	System.out.println(Arrays.toString(em.listarEmpresas()));
	System.out.println(Arrays.toString(cafu.listar()));

}
}
