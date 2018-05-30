package pl.mrmario.tutorials.spring.owczarek.cz19;

import org.springframework.beans.factory.InitializingBean;

public class SomeBean implements InitializingBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inicjalizacja");
		
	}
	
}
