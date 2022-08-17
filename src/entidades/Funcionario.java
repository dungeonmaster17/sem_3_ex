package entidades;

import entidades.enums.Departamento;

public class Funcionario {
    private String nome;
    private Departamento departamento;
    private Double salario;
    private Integer dependentes;
    private char valeTransporte;
    private char adicionalNoturno;
    private Double totalVendas;
    private Empresa empresa;
    public Funcionario(){}
    public Funcionario(String nome, Departamento departamento, Double salario, Integer dependentes, char valeTransporte, char adicionalNoturno) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dependentes = dependentes;
        this.valeTransporte = valeTransporte;
        this.adicionalNoturno = adicionalNoturno;
    }
    public Funcionario(String nome, Departamento departamento, Double salario, Integer dependentes, char valeTransporte, char adicionalNoturno, Double totalVendas) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dependentes = dependentes;
        this.valeTransporte = valeTransporte;
        this.adicionalNoturno = adicionalNoturno;
        this.totalVendas = totalVendas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Integer getDependentes() {
        return dependentes;
    }
    public void setDependentes(Integer dependentes) {
        this.dependentes = dependentes;
    }
    public char getValeTransporte() {
        return valeTransporte;
    }
    public void setValeTransporte(char valeTransporte) {
        this.valeTransporte = valeTransporte;
    }
    public char getAdicionalNoturno() {
        return adicionalNoturno;
    }
    public void setAdicionalNoturno(char adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public Double getTotalVendas() {
        return totalVendas;
    }
    public void setTotalVendas(Double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
