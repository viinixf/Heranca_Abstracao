package fixacaoheranca;

public class PessoaJuridica extends Pessoa {

	private Integer numeroDeFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double calculoImposto() {
		Double aux = getRendaAnual();
		if (this.numeroDeFuncionarios > 10) {
			return aux * 14 / 100;
		} else {
			return aux * 16 / 100;
		}
	}

}
