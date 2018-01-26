package module3;

import java.util.List;
import java.util.Map;

import processing.core.PApplet;

import java.util.*;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.GeoJSONReader;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;

public class LifeExpectancy extends PApplet{

	Map<String, Float>lifeExp;
	UnfoldingMap map;
	List<Feature> countries;
	List<Marker> countryMarkers;
	public void setup() {
		
		size(800, 600, OPENGL);
		map = new UnfoldingMap(this, 50, 50, 700, 500, new Google.GoogleMapProvider());
		MapUtils.createDefaultEventDispatcher(this, map);
		
		String CSV_FILE_NAME = "/home/kunal/COURSERA_DATA_STRUCTURES/UCSDUnfoldingMaps/src/module3/LifeExpectancyWorldBankModule3.csv";
		lifeExp = loadLifeExpectancyFromCSV(CSV_FILE_NAME);
		String JSON_FILE_NAME = "/home/kunal/COURSERA_DATA_STRUCTURES/UCSDUnfoldingMaps/src/module3/countries.geo.json";
		countries = GeoJSONReader.loadData(this, JSON_FILE_NAME);
		countryMarkers = MapUtils.createSimpleMarkers(countries);
		map.addMarkers(countryMarkers);
		shadeCountries();
		
	}

	private Map<String, Float> loadLifeExpectancyFromCSV(
			String filename) {
		Map<String, Float> countryMap = new HashMap<String, Float>();
		String rows[] = loadStrings(filename);
		for (String row : rows) {
			String[] columns = row.split(",");
			if  (columns.length >5 && !columns[5].contains("..") && columns[2].contains("0")){
				Float value = Float.parseFloat(columns[5]);
				countryMap.put(columns[4], value);
			}
		}
		return countryMap;
	}

	private void shadeCountries() {
		
		for (Marker marker : countryMarkers) {
			String countryId = marker.getId();
			if (lifeExp.containsKey(countryId)) {
				float lifeExpValue = lifeExp.get(countryId);
//				map is a special method which gives you a value between (10, 255) depending on the value
//				of lifeExpValue which would be in between 40, 90
//				for extreme case 40, value 10 will be returned
//				and for extreme case 90, value 255 will be returned
//				for in between cases, value returned will be in between 10, 255
				int colorLevel = (int) map(lifeExpValue, 40, 90, 10, 255);
				marker.setColor(color(255-colorLevel, 100, colorLevel));
			}
			else {
				marker.setColor(color(150));
			}
		}
		
	}
	
	public void draw() {
		map.draw();
	}
	
}
