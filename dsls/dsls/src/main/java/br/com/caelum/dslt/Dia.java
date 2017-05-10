package br.com.caelum.dslt;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Dia {
	
	private int dia;
	private Mes mes;
	private int ano;
	
	public Dia de(final Mes mes) {
		this.mes = mes;
		return this;
	}
	
	public Calendar de(final int ano) {
		final Calendar calendar = GregorianCalendar.getInstance();
		this.ano = ano;
		
		calendar.set(Calendar.DAY_OF_MONTH, dia);
		calendar.set(Calendar.MONTH, mes.ordinal());
		calendar.set(Calendar.YEAR, ano);
		
		return calendar;
	}
	
	public Dia (final int dia) {
		this.dia = dia;
	}
	
	public static enum Mes {
		Janeiro,
		Fevereiro,
		Marco,
		Abril,
		Maio,
		Junho,
		Julho,
		Agosto,
		Setembro,
		Outubro,
		Novembro,
		Dezembro
	}

}
