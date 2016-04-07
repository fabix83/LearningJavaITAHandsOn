package exExcecoes;

public class Principal {

	public static void main(String[] args) {
		a(100);
		System.out.println("terminando a execucao main ");
	}

	public static void a(int i) {
		System.out.println("executando a() com " + i);
		try {
			b(100);
			
		} catch (Exception e) {
			System.out.println("tratando a excecao: " + e.getMessage());
			//e.printStackTrace();
		}
		System.out.println("terminando a execucao de a() " + i);
	}
	
	public static void b (int i) throws Exception {
		System.out.println("executando b() com " + i);
		
		//gera a excecao e o stacktrace (caminho da excecao)
		throw new Exception("mensagem de erro");
		//b(100); nunca sera alcancado
	}
}
