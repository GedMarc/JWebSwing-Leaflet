package za.co.mmagon.jwebswing.plugins.leaflet.options;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import za.co.mmagon.jwebswing.generics.LatitudeLongitueArray;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marc Magon
 * @since 10 Jun 2017
 */
public class LatitudeLongitudeBounds extends JavaScriptPart
{
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * All Leaflet methods that accept LatLngBounds objects also accept them in a simple Array form (unless noted otherwise), so the bounds example above can be passed like this:
	 */
	@JsonIgnore
	private List<LatitudeLongitueArray> rectangleBounds;
	
	/*
	 * Constructs a new LatitudeLongitudeBounds
	 */
	public LatitudeLongitudeBounds()
	{
		//Nothing needed
	}
	
	/**
	 * Represents a rectangular geographical area on a map Max 2.
	 * <p>
	 * All Leaflet methods that accept LatLngBounds objects also accept them in a simple Array form (unless noted otherwise), so the bounds example above can be passed like this:
	 *
	 * @return
	 */
	@JsonValue
	public List<LatitudeLongitueArray> getRectangleBounds()
	{
		if (rectangleBounds == null)
		{
			rectangleBounds = new ArrayList<>();
		}
		return rectangleBounds;
	}
	
	/**
	 * Represents a rectangular geographical area on a ma Max 2. All Leaflet methods that accept LatLngBounds objects also accept them in a simple Array form (unless noted otherwise), so the bounds
	 * example above can be passed like this:
	 *
	 * @param rectangleBounds
	 *
	 * @return
	 */
	public LatitudeLongitudeBounds setRectangleBounds(List<LatitudeLongitueArray> rectangleBounds)
	{
		this.rectangleBounds = rectangleBounds;
		return this;
	}
	
}
