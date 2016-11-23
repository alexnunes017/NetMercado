package br.com.nunes.mercado.domain.enums;


public enum Sexo {

	MASCULINO("Masculino"), FEMININO("Feminino");

	private String label;

	Sexo(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
