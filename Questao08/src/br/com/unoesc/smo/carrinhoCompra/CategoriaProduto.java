package br.com.unoesc.smo.carrinhoCompra;

public enum CategoriaProduto {
	BEBIDAS(new CincoPorcento()), VESTUARIO(new VinteCincoPorcento());

	private CategoriaProduto(RegraDesconto regraDesconto) {
		this.regraDesconto = regraDesconto;
	}

	private RegraDesconto regraDesconto;

	public Double calcular(Produto produto) {
		return regraDesconto.calcularDesconto(produto);
	}
}
