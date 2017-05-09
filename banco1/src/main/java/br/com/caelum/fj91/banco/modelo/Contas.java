package br.com.caelum.fj91.banco.modelo;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

/**
 * Organiza as contas do banco por semestre de abertura
 */
public class Contas {
	
	private HashSet<Conta> contas = new HashSet<Conta>();

	private int totalContasPrimeiroSemestre = 0;
	private int totalContasSegundoSemestre = 0;
	
	public boolean add(Conta conta) {
		int mes = conta.getDataAbertura().get(Calendar.MONTH);
		if (mes < 6) {
			totalContasPrimeiroSemestre++;
		} else {
			totalContasSegundoSemestre++;
		}
		
		return contas.add(conta);
	}

	public boolean addAll(Collection<? extends Conta> c) {
		for (Conta conta : c) {
			int mes = conta.getDataAbertura().get(Calendar.MONTH);
			if (mes < 6) {
				totalContasPrimeiroSemestre++;
			} else {
				totalContasSegundoSemestre++;
			}
		}
		
		return contas.addAll(c);
	}
	
	public int size() {
		return contas.size();
	}
	
	public int getTotalContasPrimeiroSemestre() {
		return totalContasPrimeiroSemestre;
	}
	
	public int getTotalContasSegundoSemestre() {
		return totalContasSegundoSemestre;
	}
	
}
