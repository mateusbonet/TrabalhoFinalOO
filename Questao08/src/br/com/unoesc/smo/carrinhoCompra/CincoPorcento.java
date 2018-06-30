package br.com.unoesc.smo.carrinhoCompra;

public class CincoPorcento implements RegraDesconto{

	@Override
	public Double calcularDesconto(Produto produto) {
		Double desconto = produto.getValorUnitario() * 0.05;
		return produto.getValorUnitario()  - desconto;
	}

}
