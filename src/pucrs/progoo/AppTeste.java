package pucrs.progoo;

import java.util.ArrayList;

public class AppTeste {

	public static void main(String[] args) {
		
		CadastroProdutos cadProd = new CadastroProdutos();

		cadProd.inserir(21, "Lápis 1HB", 1.50);
		cadProd.inserir(22, "Caneta vermelha", 3);
		cadProd.inserir(23, "Recarga Caneta Pilot", 10);

		cadProd.inserir(new Produto(24, "Borracha", 2));

		cadProd.inserir( new ProdutoEE(25, "Picotador papel", 90, 180));
		cadProd.inserir( new ProdutoEE(26, "Apontador eletrico", 11, 60));


		Venda venda1 = new Venda();
		Produto prod = cadProd.pesquisar(22);

		if (prod != null) venda1.inserir(3, prod);

		prod = cadProd.pesquisar(21);
		if (prod != null) venda1.inserir(prod);

		prod = cadProd.pesquisar(26);
		if (prod != null) venda1.inserir(prod);

		prod = cadProd.pesquisar(25);
		if (prod != null) venda1.inserir(prod);

		//System.out.println("Total da venda1: "+venda1.valorTotal());

		System.out.println(venda1.toString());


	}

}
