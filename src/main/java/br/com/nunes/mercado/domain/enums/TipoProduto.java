package br.com.nunes.mercado.domain.enums;

public enum TipoProduto {
	ORIGINAL("Original"), SIMILAR("Similar");

	private String label;

	TipoProduto(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
