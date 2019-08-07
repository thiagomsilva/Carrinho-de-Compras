package br.com.improving.carrinho;

import java.math.BigDecimal;

/**
 * Classe que representa um item no carrinho de compras.
 */
public class Item {

	private Produto produto;
	private BigDecimal valorUnitario;
	private int quantidade;
	private BigDecimal valor;

	/**
	 * Construtor da classe Item.
	 * 
	 * @param produto
	 * @param valorUnitario
	 * @param quantidade
	 */
	public Item(Produto produto, BigDecimal valorUnitario, int quantidade) {

		this.produto = produto;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;

	}

	/**
	 * Retorna o produto.
	 *
	 * @return Produto
	 */
	public Produto getProduto() {
		return produto;

	}

	/**
	 * Retorna o valor unitário do item.
	 *
	 * @return BigDecimal
	 */
	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	/**
	 * Retorna a quantidade dos item.
	 *
	 * @return int
	 */
	public int getQuantidade() {
		return quantidade;
	}

	/**
	 * Retorna o valor total do item.
	 *
	 * @return BigDecimal
	 */
	public BigDecimal getValorTotal() {
		return valorUnitario.multiply(new BigDecimal(quantidade));

	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Item: produto -> " + produto + ", valorUnitario -> " + valorUnitario + ", valor -> " + valor
				+ ", quantidade -> " + quantidade + "";
	}
}
