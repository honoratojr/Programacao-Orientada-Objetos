import Pessoas.Funcionario;
import Pessoas.PessoaFisica;
import Pessoas.PessoaJuridica;
import Superclasse.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
       
        Pessoa pessoa = new Pessoa("Cirillo");
        System.out.println(pessoa);

        PessoaJuridica pj = new PessoaJuridica("Casa do Dinheiro", 2005698700010L);/*O "L" ao final do número é um casting, ou seja, uma conversão temporária do código*/
        System.out.println(pj);

        PessoaFisica pf = new PessoaFisica("Giulia", 17429348378L);
        System.out.println(pf);

        Funcionario funcionario = new Funcionario("Giulia", 174293483, 117);
        System.out.println(funcionario);
    }
}
