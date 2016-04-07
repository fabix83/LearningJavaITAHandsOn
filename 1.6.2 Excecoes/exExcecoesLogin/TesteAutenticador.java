package exExcecoesLogin;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("felix", "123456");
		assertEquals ("felix", u.getLogin());
	}
	
	@Test(expected = LoginException.class)
	public void loginFalho() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("felix", "12345");
	}
	
	@Test
	public void informacaoDoErro(){
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("felix", "12345");
			fail();
		} catch (LoginException e) {
			assertEquals ("felix", e.getLogin());
		}
	}

}
