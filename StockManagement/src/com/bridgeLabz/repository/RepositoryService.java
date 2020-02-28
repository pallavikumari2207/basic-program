package com.bridgeLabz.repository;

import org.json.simple.JSONObject;

public interface RepositoryService {
	public void writeToJson(JSONObject j);
	public JSONObject readFromjson();

}
