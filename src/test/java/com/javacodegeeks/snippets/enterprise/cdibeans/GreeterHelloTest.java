package com.javacodegeeks.snippets.enterprise.cdibeans;


import static org.junit.Assert.*;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.javacodegeeks.snippets.enterprise.cdibeans.GreetingType.Greetings;
import com.javacodegeeks.snippets.enterprise.cdibeans.impl.GreetingCardImpl;

@RunWith(Arquillian.class)
public class GreeterHelloTest {

	@Inject
	@GreetingsProducer
	@GreetingType(Greetings.HELLO)
	private GreetingCard greetingCard;
	
    @Test
    public void shouldGreet() {
        assertEquals("Hello!!!", greetingCard.sayHello());
    }
	
    @Deployment
    public static JavaArchive createDeployment() {
        JavaArchive archive = ShrinkWrap.create(JavaArchive.class)
            .addPackage(GreetingCard.class.getPackage())
            .addPackage(GreetingCardImpl.class.getPackage())
            .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        return archive;
    }
	
}
