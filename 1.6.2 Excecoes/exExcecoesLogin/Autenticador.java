package exExcecoesLogin;

public class Autenticador {
	
	public Usuario logar (String login, String senha) throws LoginException {
		if (login.equals("felix") && senha.equals("123456")) {
			return new Usuario(login);
		}
		throw new LoginException("o usuario e a senha nao batem", login);
	}
}
