package br.com.caelum.dslt;

import java.util.Calendar;

import static br.com.caelum.dslt.Dia.Mes.Fevereiro;

public class DiaTest {

	public static void main(String[] args) {
		final Calendar calendar = new Dia(11).de(Fevereiro).de(2012);

	}

}
