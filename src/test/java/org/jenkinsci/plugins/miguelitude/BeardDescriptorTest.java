package org.jenkinsci.plugins.miguelitude;

import static org.mockito.Mockito.mock;
import hudson.model.AbstractProject;
import junit.framework.TestCase;

public class BeardDescriptorTest extends TestCase {

	private BeardDescriptor descriptor;

	@Override
	public void setUp() {
		descriptor = new BeardDescriptor();
	}

	public void testGetDisplayName() {
		assertEquals("Activation de la Miguel atitude", descriptor.getDisplayName());
	}

	public void testIsApplicableGivesTrue() {
		assertTrue(descriptor.isApplicable(mock(AbstractProject.class).getClass()));
	}
}
