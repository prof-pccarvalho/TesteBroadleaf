package br.sp.pccarvalho.pages;

import org.openqa.selenium.By;

import br.sp.pccarvalho.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaInserirConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}
	
	public void acessarTelaListarConta() {
		clicarLink("Contas");
		clicarLink("Listar");
	}
	
	public void acessarTelaInserirMovimentacao() {
		clicarLink("Criar Movimentação");
	}
	
	public void acessarTelaResumo() {
		clicarLink("Resumo Mensal");
	}
	
	public void acessarTelaLogin() {
		clicarBotao(By.xpath("//*[@id=\"sectionsNav\"]/div/div[1]/ul[2]/li[1]/a"));
	}
	
	public void PreencherTelaLogin() {
		trocarJanela("loginForm");
	}
	
	

}
