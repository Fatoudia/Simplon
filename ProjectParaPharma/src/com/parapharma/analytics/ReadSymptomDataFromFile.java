package com.parapharma.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	private Map<String, Integer> map = new HashMap<String, Integer>();

	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		int i = 0;
		if (filepath != null) {
			try 
			{
				BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
				String line = reader.readLine();
				
				while (line != null) 
				{
					i++;
					result.add(line);
					
					//System.out.println(line + ":"  + i);		        
			 for (String temp : result) 
			 {      Integer count = map.get(temp);
			    if(temp == line)
			    {
			    	 map.put(temp, (count == null) ? 1 : count + 1);	
			    	
			    }
             
			    
     
			}
				line = reader.readLine();
			BufferedWriter fichTxt = new BufferedWriter(new FileWriter(new File("/home/fatou/eclipse-workspace/ProjectParaPharma/src/result.out")));	

			for(Map.Entry str : map.entrySet())
			{
				fichTxt.write("clé: "+ str.getKey() 
                + " | valeur: " + str.getValue());
				fichTxt.newLine();
			}
			    fichTxt.close();
			}
				System.out.println(map);
			
				reader.close();

			}

			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
