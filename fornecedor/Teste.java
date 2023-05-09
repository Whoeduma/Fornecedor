
package fornecedor;

import Classes.Administrador;
import Classes.Empregado;
import Classes.Fornecedor;
import Classes.Operario;
import Classes.Pessoa;
import Classes.Vendedor;




public class Teste {

    public static void main(String[] args) {
      Pessoa pessoa1 = new Pessoa("Joao Pedro", "Samambaia, SMSE", "(61) 98965-8888");

        System.out.println("------/CLIENTE/------");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Endereco: " + pessoa1.getEndereco());
        System.out.println("Telefone: " + pessoa1.getTelefone());
        
        System.out.println("------/FORNECEDOR/------");
        
        Fornecedor fornecedor1 = new Fornecedor("Victor", "Taguatinga", "(61) 9999-7777", 5000.0, 2000.0);
        System.out.println("Fornecedor: " + fornecedor1.getNome());
        System.out.println("Endereco: " + fornecedor1.getEndereco());
        System.out.println("Telefone: " + fornecedor1.getTelefone());
        System.out.println("Valor do credito: " + fornecedor1.getValorCredito());
        System.out.println("Valor da divida: " + fornecedor1.getValorDivida());
        System.out.println("Saldo: " + fornecedor1.obterSaldo());
        
        System.out.println("------/EMPREGADO/------");
        
        Empregado empregado1 = new Empregado("Ryann", "Taguatinga Sul", "(61) 9999-6666", 1, 2000.0, 10.0);
        System.out.println("Nome: " + empregado1.getNome());
        System.out.println("Endereco: " + empregado1.getEndereco());
        System.out.println("Telefone: " + empregado1.getTelefone());
        System.out.println("Codigo do setor: " + empregado1.getCodigoSetor());
        System.out.println("Salario base: " + empregado1.getSalarioBase());
        System.out.println("Imposto: " + empregado1.getImposto());
        System.out.println("Salario: " + empregado1.calcularSalario());
        
        System.out.println("------/ADMINISTRADOR/------");
        
        Administrador administrador1 = new Administrador("Lucas", "Aguas Claras", "(61) 9999-5555", 2, 3000.0, 20.0, 100.0);
        System.out.println("Nome: " + administrador1.getNome());
        System.out.println("Endereco: " + administrador1.getEndereco());
        System.out.println("Telefone: " + administrador1.getTelefone());
        System.out.println("Codigo do setor: " + administrador1.getCodigoSetor());
        System.out.println("Salario base: " + administrador1.getSalarioBase());
        System.out.println("Imposto: " + administrador1.getImposto());
        System.out.println("Ajuda de custo: " + administrador1.getAjudaDeCusto());
        System.out.println("Salario: " + administrador1.calcularSalario());
        
        Operario operario = new Operario("Gabriel", "Santo Antonio","(61) 7777-8888", 4, 2000, 20, 50, 40);
        operario.setValorProducao(10000);
        System.out.println("------/OPERARIO/------");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereco: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Codigo do setor: " + operario.getCodigoSetor());
        System.out.println("Salario base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto());
        System.out.println("Valor da producao: " + operario.getValorProducao());
        System.out.println("Comissao: " + operario.getComissao());
        System.out.println("Salario liquido: " + operario.calcularSalario());
        
        Vendedor vendedor = new Vendedor("Vinicius", "Riacho Fundo", "(61) 6666-4444", 3, 4500, 20, 5000, 40);
        
        System.out.println("------/VENDEDOR/------");
        System.out.println("Nome do vendedor: " + vendedor.getNome());
        System.out.println("Endereco: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Salario base: R$ " + vendedor.getSalarioBase());
        System.out.println("Comissao: " + (vendedor.getComissao() * 100) + "%");
        System.out.println("Valor de vendas: R$ " + vendedor.getValorVendas());
        System.out.println("Salario total: R$ " + vendedor.calcularSalario());
    }
}
  
 
