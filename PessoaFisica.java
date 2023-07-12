package fixacaoheranca;

public class PessoaFisica extends Pessoa {

	private Double gastosComSaude;

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;

	}

	@Override
	public double calculoImposto() {
		double valorFinal = getRendaAnual();
		if (getRendaAnual() < 20000) {
			if (this.gastosComSaude > 0) {
				return valorFinal = valorFinal * 15 / 100 - (this.gastosComSaude * 50 / 100);
			} else {
				return valorFinal = valorFinal * 15 / 100;
			}
		} else if (getRendaAnual() > 20000) {
			if (this.gastosComSaude > 0) {
				return valorFinal = valorFinal * 25 / 100 - (this.gastosComSaude * 50 / 100);
			} else {
				return valorFinal = valorFinal * 25 / 100;
			}

		}
		return valorFinal;

	}

}
