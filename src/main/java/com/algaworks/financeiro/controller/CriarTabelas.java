package com.algaworks.financeiro.controller;

import javax.persistence.Persistence;
public class CriarTabelas {

	public static void main(String[] args) {

		Persistence.createEntityManagerFactory("FinanceiroPU");

	}

}
