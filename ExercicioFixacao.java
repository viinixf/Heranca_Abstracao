package fixacaoheranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioFixacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();

		System.out.println("Quantos funcionário serão cadastrados? ");
		int numeroFuncionariosCadastrados = sc.nextInt();
		for (int i = 1; i <= numeroFuncionariosCadastrados; i++) {
			System.out.println("Funcionários n° " + i);
			System.out.println("Pessoa física ou jurídica? (f/j)");
			char fisicaOuJuridica = sc.next().charAt(0);
			System.out.println("Digite o nome do funcionário: ");
			String nome = sc.next();
			System.out.println("Digite a renda anual do funcionário: ");
			Double rendaAnual = sc.nextDouble();
			if (fisicaOuJuridica == 'f') {
				System.out.println("Gastos com saúde: ");
				Double gastosComSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
			} else if (fisicaOuJuridica == 'j') {
				System.out.println("Digite o número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
			System.out.println();
		}

		for (Pessoa ps : list) {
			System.out.println(ps.getNome() + "R$: " + ps.calculoImposto());
		}

		Double soma = 0.0;
		for (Pessoa ps : list) {
			soma = soma + ps.calculoImposto();
		}
		System.out.println("Imposto total: " + soma);
	}

}
