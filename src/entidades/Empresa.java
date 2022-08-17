package entidades;

import entidades.servicos.ServicoRecursosHumanos;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private ServicoRecursosHumanos servicoRecursosHumanos;
    private List<Funcionario> funcionarios = new ArrayList<>();
    public Empresa(){}
    public Empresa(ServicoRecursosHumanos servicoRecursosHumanos){
        this.servicoRecursosHumanos = servicoRecursosHumanos;
    }
    public Empresa(String nome, ServicoRecursosHumanos servicoRecursosHumanos) {
        this.nome = nome;
        this.servicoRecursosHumanos = servicoRecursosHumanos;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ServicoRecursosHumanos getServicoRecursosHumanos() {
        return servicoRecursosHumanos;
    }

    public void setServicoRecursosHumanos(ServicoRecursosHumanos servicoRecursosHumanos) {
        this.servicoRecursosHumanos = servicoRecursosHumanos;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void removeFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }
    public void emitirHolerite(){
        System.out.println("HOLERITES:");
        for(Funcionario f : funcionarios){
            System.out.println("Nome: " + f.getNome()
                    + " - Salario: R$ "
                    + String.format("%.2f", (f.getSalario() +
                    + servicoRecursosHumanos.calcularDependentes(f)
                    + servicoRecursosHumanos.calcularAdicionalNoturno(f)
                    + servicoRecursosHumanos.calcularComissao(f)) -
                    (servicoRecursosHumanos.calcularINSS(f)
                    + servicoRecursosHumanos.calcularValeTransporte(f)))
                    + " - Empresa: "
                    + f.getEmpresa()
                    + " - Departamento: "
                    + f.getDepartamento());
            }
        }
}
