package com.jwebmp.plugins.leaflet;

import org.junit.jupiter.api.Test;

/**
 * @author Marc Magon
 */
public class LeafletOptionsTest
{

	public LeafletOptionsTest()
	{
	}

	@Test
	public void testSomeMethod()
	{
		LeafletOptions bso = new LeafletOptions();
		bso.setDragging(true);
		System.out.println(bso);
	}

}