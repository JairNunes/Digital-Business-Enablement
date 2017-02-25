package br.com.fiap.config;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertySingleton {

	private static Logger log = 
			LoggerFactory.getLogger(PropertySingleton.class);
	
	private static Properties prop;
	
	//Construtor privado, ninguem instancia!
	private PropertySingleton(){}
	
	public static Properties getInstance(){
		log.trace("Recuperando as propriedades do sistema");
		if (prop == null){
			log.debug("Instanciando o objeto de propriedades");
			prop = new Properties();
			try {
				log.debug("Carregando as propriedades");
				//Carregar as propriedades no prop
				prop.load(PropertySingleton
					.class.getResourceAsStream("/config.properties"));
			} catch (IOException e) {
				e.printStackTrace();
				log.error("Erro ao carregar as propriedades");
			}
		}
		return prop;
	}
	
}
