package com.bridgelabz.Repository;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CliniqueRepositoryImpl implements CliniqueRepositoryint{

	@Override
	public void writeToJson(JSONObject j, String path) {
		try {
			FileWriter file=new FileWriter(path);
			file.write(j.toJSONString());
			file.flush();
			file.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public JSONObject readFromjson(String path) {
	JSONObject obj=null;
	try {
		FileReader file=new FileReader(path);
		JSONParser parser=new JSONParser();
		obj=(JSONObject) parser.parse(file);
	}
	catch(IOException | ParseException e) {
		e.printStackTrace();
	}
	return obj;		
	}
}
