package br.com.caelum.ws;

import br.com.caelum.fj91.cliente.DicionarioService;

public class ConsumidorServico {

	public static void main(String[] args) {
		
		br.com.caelum.fj91.cliente.Dicionario dicionario = new DicionarioService().getDicionarioPort();
		String palavra = "bola";
		System.out.println("Traduzindo a palavra '" + palavra + "'");
		String traducao = dicionario.traduz(palavra);
		System.out.println("Traducao: " + traducao);
		
		System.out.println("######################");
		String novaPalavra = "ambiente";
		String novaTraducao = "environment";
		System.out.println("Adicionando nova traducao: " + novaPalavra + "/" + novaTraducao);
		dicionario.adicionaTraducao(novaPalavra, novaTraducao);
		
	}
	
}
