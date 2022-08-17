package entidades.servicos;

import entidades.Funcionario;
import entidades.enums.Departamento;

public class ServicoDeTaxas implements ServicoRecursosHumanos {
    public static final Double TAXA_INSS = 0.13;
    public static final Double TAXA_DEPENDENTES = 0.50;
    public static final Double TAXA_VALE_TRANSPORTE = 0.03;
    public static final Double TAXA_AD_NOTURNO = 0.05;
    public static final Double TAXA_COMISSAO = 0.02;
    @Override
    public double calcularINSS(Funcionario funcionario) {
        if(funcionario.getSalario() < 0){
            throw new IllegalArgumentException("Informe um numero positivo para Salario!");
        } else {
            return funcionario.getSalario() * TAXA_INSS;
        }
    }
    @Override
    public double calcularDependentes(Funcionario funcionario) {
        if(funcionario.getDependentes() < 0){
            throw  new IllegalArgumentException("Informe um numero positivo para Dependentes!");
        } else if (funcionario.getDependentes() <= 3 && funcionario.getDependentes() > 0) {
            return funcionario.getSalario() * ((funcionario.getDependentes() * TAXA_DEPENDENTES));
        }
        return 0;
    }
    @Override
    public double calcularValeTransporte(Funcionario funcionario) {
        if(funcionario.getValeTransporte() != 'S' && funcionario.getValeTransporte() != 'N'){
            throw new IllegalArgumentException("Informe 's' ou 'n' para Vale Transporte!");
        } else if (funcionario.getValeTransporte() == 'S') {
            return funcionario.getSalario() * TAXA_VALE_TRANSPORTE;
        }
        return 0;
    }
    @Override
    public double calcularAdicionalNoturno(Funcionario funcionario) {
        if(funcionario.getAdicionalNoturno() != 'S' && funcionario.getAdicionalNoturno() != 'N'){
            throw new IllegalArgumentException("Informe 's' ou 'n' para Adicional Noturno!");
        } else if (funcionario.getAdicionalNoturno() == 'S') {
            return funcionario.getSalario() * TAXA_AD_NOTURNO;
        }
        return 0;
    }
    @Override
    public double calcularComissao(Funcionario funcionario) {
        if(funcionario.getDepartamento() != Departamento.VENDAS && funcionario.getDepartamento() != Departamento.NENHUM){
            throw new IllegalArgumentException("Informe 'VENDAS' ou 'NENHUM' para Departamento!");
        } else if (funcionario.getDepartamento() == Departamento.VENDAS) {
            return funcionario.getTotalVendas() * TAXA_COMISSAO;
        }
        return 0;
    }
}
