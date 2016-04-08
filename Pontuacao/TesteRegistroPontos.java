import static org.junit.Assert.*;

import org.junit.Test;

public class TesteRegistroPontos {

	@Test
	public void PontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		
		assertEquals (u.pontos, 5);
	}
	
	@Test
	public void PontosCriarTopicoVIP() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		
		assertEquals (u.pontos, 25);
	}

}
