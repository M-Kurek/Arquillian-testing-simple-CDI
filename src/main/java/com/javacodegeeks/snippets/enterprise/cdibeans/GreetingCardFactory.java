package com.javacodegeeks.snippets.enterprise.cdibeans;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.InjectionPoint;

public class GreetingCardFactory {

	@Produces
	@GreetingsProducer
	public GreetingCard getGreetingCard(@Any Instance<GreetingCard> instance, InjectionPoint ip){
		
		Annotated gtAnnotated = ip.getAnnotated();
		GreetingType gtAnnotation = gtAnnotated.getAnnotation(GreetingType.class);
		Class<? extends GreetingCard> greetingCard = gtAnnotation.value().getClazz();
		return instance.select(greetingCard).get();
	}
}
