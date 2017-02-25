package br.com.fiap.config;

import java.io.IOException;
import java.util.Properties;

public class PropertySingleton {

	private static Properties prop;
	
	private PropertySingleton(){}
	
	public static Properties getInstance(){
		if (prop == null){
			prop = new Properties();
			//Carregar o arquivo de configuração
			try {
				prop.load(PropertySingleton.
						class.getResourceAsStream("/loja.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return prop;
	}
	
}
