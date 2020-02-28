package com.bridgelabz.Repository;

import org.json.simple.JSONObject;

public interface CliniqueRepositoryint {
	public void writeToJson(JSONObject j,String path);
	public JSONObject readFromjson(String path);
	

}
