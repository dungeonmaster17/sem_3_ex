package app;

import entidades.Empresa;
import entidades.Funcionario;
import entidades.enums.Departamento;
import entidades.servicos.ServicoDeTaxas;

import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("EMISSOR DE HOLERITE:");
        try {
            System.out.print("Empresa: ");
            String emp = String.valueOf(sc.nextLine().split(" "));

            Empresa empresa = new Empresa(emp, new ServicoDeTaxas());

            System.out.print("N° de Funcionarios: ");
            int N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                System.out.print("Nome Func.: ");
                String nome = sc.next();

                System.out.print("Salario: ");
                double salario = sc.nextDouble();

                System.out.print("N° Dependentes: ");
                int numDepen = sc.nextInt();

                System.out.print("Vale Transp. (s/n): ");
                char valeTransp = sc.next().toUpperCase().charAt(0);

                System.out.print("Ad. Noturno (s/n): ");
                char adNoturno = sc.next().toUpperCase().charAt(0);

                System.out.print("Departamento (VENDAS/NENHUM): ");
                String dept = sc.next();

                if (Departamento.valueOf(dept) == Departamento.VENDAS) {
                    System.out.print("Total de vendas: ");
                    double totalVendas = sc.nextDouble();
                    empresa.addFuncionario(new Funcionario(nome, Departamento.valueOf(dept), salario, numDepen, valeTransp,
                            adNoturno, totalVendas));
                }
                if (Departamento.valueOf(dept) == Departamento.NENHUM) {
                    empresa.addFuncionario(new Funcionario(nome, Departamento.valueOf(dept), salario, numDepen,
                            valeTransp, adNoturno));
                }
            }



            empresa.emitirHolerite();

        } catch (InputMismatchException e) {
            System.out.println("Error <Formatação Invalida!>");
        } finally{
            sc.close();
        }
    }
}
