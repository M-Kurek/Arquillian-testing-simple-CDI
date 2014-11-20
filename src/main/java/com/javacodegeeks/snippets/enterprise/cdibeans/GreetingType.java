package com.javacodegeeks.snippets.enterprise.cdibeans;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.javacodegeeks.snippets.enterprise.cdibeans.impl.AnotherGreetingCardImpl;
import com.javacodegeeks.snippets.enterprise.cdibeans.impl.GreetingCardImpl;

@Retention(RUNTIME)
@Target({ FIELD, TYPE, METHOD })
public @interface GreetingType {
	
	Greetings value();

	public enum Greetings {

		HELLO(GreetingCardImpl.class), HI(AnotherGreetingCardImpl.class);

		Class<? extends GreetingCard> clazz;

		private Greetings(Class<? extends GreetingCard> clazz){
			this.clazz = clazz;
		}

		public Class<? extends GreetingCard> getClazz() {
			return clazz;
		}
	}

}
