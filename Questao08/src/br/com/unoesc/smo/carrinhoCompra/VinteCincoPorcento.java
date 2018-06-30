package br.com.unoesc.smo.carrinhoCompra;

public class VinteCincoPorcento implements RegraDesconto {

	@Override
	public Double calcularDesconto(Produto produto) {
		Double desconto = produto.getValorUnitario() * 0.25;
		return produto.getValorUnitario()  - desconto;
	}

}
