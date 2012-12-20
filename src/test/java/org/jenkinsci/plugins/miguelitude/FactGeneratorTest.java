package org.jenkinsci.plugins.miguelitude;

import org.jenkinsci.plugins.miguelitude.FactGenerator;

import junit.framework.TestCase;

public class FactGeneratorTest extends TestCase {

	private FactGenerator generator;

	public void setUp() {
		generator = new FactGenerator();
	}

	public void testRandomGivesAtLeast2Facts() {
		String lastFact = null;
		for (int i = 0; i < 1000000; i++) {
			String currFact = generator.random();
			if (lastFact != null && !lastFact.equals(currFact)) {
				return;
			}
			lastFact = currFact;
		}
		fail("Random should give at least 2 different facts in 1000000 tries.");
	}
}
