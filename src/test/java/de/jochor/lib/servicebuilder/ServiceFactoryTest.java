package de.jochor.lib.servicebuilder;

import java.io.File;
import java.net.URL;
import java.util.LinkedHashSet;

import org.junit.Assert;
import org.junit.Test;

import de.jochor.test.TestService;

public class ServiceFactoryTest {

	private static final String BINDER_NAME = "de/jochor/test/TestServiceBinder.class";

	private static final File BINDER_FILE = new File("target/classes", BINDER_NAME);

	@Test
	public void testFindPossibleBinders() throws Throwable {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

		LinkedHashSet<URL> possibleBinders = ServiceFactory.findPossibleBinders(BINDER_NAME, classLoader);
		Assert.assertNotNull(possibleBinders);
		Assert.assertEquals(1, possibleBinders.size());

		URL url = possibleBinders.iterator().next();
		Assert.assertNotNull(url);
		Assert.assertEquals(BINDER_FILE.toURI().toURL(), url);
	}

	@Test
	public void testCreate() throws Throwable {
		Object service = ServiceFactory.create(BINDER_NAME);
		Assert.assertNotNull(service);
		Assert.assertTrue(service instanceof TestService);
	}

}