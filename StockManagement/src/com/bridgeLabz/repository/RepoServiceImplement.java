package com.bridgeLabz.repository;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class RepoServiceImplement implements RepositoryService {

	@Override
	public void writeToJson(JSONObject j) {
		try {
			FileWriter file = new FileWriter("stock.json");
			file.write(j.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// RepositoryService ref=new RepoServiceImplement();

	@Override
	public JSONObject readFromjson() {
		JSONObject obj = null;
		try {
			FileReader file = new FileReader("stock.json");
			JSONParser parser = new JSONParser();
			JSONObject json = (JSONObject) parser.parse(file);
			obj = json;
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return obj;
	}

}
