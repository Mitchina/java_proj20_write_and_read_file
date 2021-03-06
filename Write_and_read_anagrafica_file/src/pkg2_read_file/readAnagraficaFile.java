package pkg2_read_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class readAnagraficaFile {

	public static void main(String[] args) {
		String registryFile = "registry.txt";
		int attributeSize = 3;
		List<String> records = new ArrayList<>();		
		
		try (BufferedReader in = new BufferedReader(new FileReader(registryFile))){	
			
			String line;			
			while((line = in.readLine()) != null) {
				records.add(line);
				line = in.readLine();
				records.add(line);				
			}
			
		} catch (Exception e) {
			
		}
		
		for(var record : records) {
			if(record != null) {
				System.out.println(record);
			
				StringTokenizer stk;
				String[] arr = new String[attributeSize];
				stk = new StringTokenizer(record);
				
				for(int i=0;i<arr.length;i++)
					arr[i] = stk.nextToken(";");
				
				new Registry(arr[0], arr[1], arr[2]);
			}			
		}
		
		for(var instance : Registry.getInstances()) {
			System.out.println(instance.toString());
		}

	}

}
