package entidades.servicos;

import entidades.Funcionario;

public interface ServicoRecursosHumanos {
    double calcularINSS(Funcionario funcionario);
    double calcularDependentes(Funcionario funcionario);
    double calcularValeTransporte(Funcionario funcionario);
    double calcularAdicionalNoturno(Funcionario funcionario);
    double calcularComissao(Funcionario funcionario);
}
