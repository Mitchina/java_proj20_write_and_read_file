package pkg1_write_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class writeAnagraficaFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int attributeSize = 3;
		String[] arr = new String[attributeSize];
		String registryFile = "registry.txt";
		
		System.out.print("Type your name: \n");
		arr[0] = sc.nextLine();		
		System.out.print("Type your surname: \n");
		arr[1] = sc.nextLine();		
		System.out.print("Type your age: \n");
		arr[2] = sc.nextLine();		
		
		try (BufferedWriter out = new BufferedWriter(new FileWriter(registryFile, true))) {
			int i=0;
			for(var str : arr) {
				out.write(str + ";");
				i++;
				// after 3 records, jump to the next line on the file
				if(i==attributeSize) {
					out.newLine();
					i=0;
				}			
			}
			//for(var str : arr)
				//out.write(str + ";");
			
		} catch (Exception e) {
		}
		
		sc.close();

	}

}
