package br.sp.pccarvalho.core;

public class Propriedades {
	
public static boolean FECHAR_BROWSER = false;//deixar false se colocar na suite de classes para fechar após execução
	
	public static Browsers browser = Browsers.CHROME;
	
	//public static String NOME_CONTA_ALTERADA = "Conta do Teste alterada " + System.nanoTime();
	
	public enum Browsers {
		CHROME,
		FIREFOX
	}

}
