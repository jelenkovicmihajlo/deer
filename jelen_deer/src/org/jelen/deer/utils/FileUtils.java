package org.jelen.deer.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;



public class FileUtils {
	public static List<String> getLines(String file) throws IOException {
		FileReader fr = new FileReader(file);
	    BufferedReader reader = new BufferedReader(fr);
	    String         line = null;
	    List<String> lines = new ArrayList<>();

	    try {
	        while((line = reader.readLine()) != null) {
	        	lines.add(line);
	        }
	        return lines;
	    } finally {
	        reader.close();
	    }
	}
	public static String getFirstLine(String file) throws IOException {
		FileReader fr = new FileReader (file);
	    BufferedReader reader = new BufferedReader(fr);
	    String         line = null;
	    try {line = reader.readLine();
	        return line;
	    } finally {
	        reader.close();
	    }
	}
	public static String getLastLine(String file) throws IOException {
		FileReader fr = new FileReader(file);
	    BufferedReader reader = new BufferedReader(fr);
	    String         line = null;
	    String rez=null;
	    try {
	        while((line = reader.readLine()) != null) {
	        	rez=line;
	        }
	        return rez;
	    } finally {
	        reader.close();
	    }
	}
	public static void appendLines(String file,String word,int N) throws IOException {
		File fout = new File(file);
		FileOutputStream fos = new FileOutputStream(fout);
	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
	 
		for (int i = 0; i < N; i++) {
			bw.write(word);
			bw.newLine();
		}
	 
		bw.close();
	}
	public static void appendLine(String file,String word) throws IOException {
		Writer output;
		output = new BufferedWriter(new FileWriter(file, true));
		output.append(word+"\n");
		output.close();
	}

	public static void replaceLine(String file, String newline ,String oldline) throws IOException {
		Path path = Paths.get(file);
		Charset charset = StandardCharsets.UTF_8;

		String content = new String(Files.readAllBytes(path), charset);
		content = content.replaceAll(oldline, newline);
		Files.write(path, content.getBytes(charset));
	}

	/*public static void appendLine(String filePath,String word) throws IOException {
		File fout = new File(filePath);
		FileOutputStream fos = new FileOutputStream(fout);
		File temp = File.createTempFile("file", ".txt", file.getParentFile(filePath));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
			bw.write(word);
			bw.newLine();
	 
		bw.close();
	}*/
	/*public static void deleteLine(String file) throws IOException {
		File inputFile = new File("D:\\write.txt");
		File tempFile = new File("D:\\writetemp.txt");

		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

		String lineToRemove = "bbb";
		String currentLine;

		while((currentLine = reader.readLine()) != null) {
		    // trim newline when comparing with lineToRemove
		    String trimmedLine = currentLine.trim();
		    if(trimmedLine.equals(lineToRemove)) continue;
		    writer.write(currentLine + System.getProperty("line.separator"));
		}
		writer.close(); 
		reader.close(); 
		boolean successful = tempFile.renameTo(inputFile);
	}*/
	 /*public void removeLineFromFile(String file, String lineToRemove) {
		   try {
		     File inFile = new File(file);
		     if (!inFile.isFile()) {
		       System.out.println("Parameter is not an existing file");
		       return;
		     }
		     //Construct the new file that will later be renamed to the original filename.
		     File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
		     BufferedReader br = new BufferedReader(new FileReader(file));
		     PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
		     String line = null;
		     //Read from the original file and write to the new
		     //unless content matches data to be removed.
		     while ((line = br.readLine()) != null) {
		       if (!line.trim().equals(lineToRemove)) {
		         pw.println(line);
	          	 pw.flush();
		       }
		     }
		     pw.close();
		     br.close();
		     //Delete the original file
		     if (!inFile.delete()) {
		       System.out.println("Could not delete file");
		       return;
		     }
		     //Rename the new file to the filename the original file had.
		     if (!tempFile.renameTo(inFile))
		       System.out.println("Could not rename file");
		    }
		   catch (FileNotFoundException ex) {
		     ex.printStackTrace();
		   }
		   catch (IOException ex) {
		     ex.printStackTrace();
		   }
	 }*/
	/*public static void replaceLine(String file, String newline ,int lineNum) throws IOException {
	FileReader fr = new FileReader (file);
    BufferedReader reader = new BufferedReader(fr);
    String         line = null;
    String[] lines= new String[0];
    FileOutputStream fos = new FileOutputStream("D:\\testpersons.txt");
    lineNum=lineNum-1;
    int con=0;
    
    try {
        while((line = reader.readLine()) != null) {
        	lines[con]=line;
        	con++;
        	System.out.println(line);
        	if(lineNum==con) {
        		lines[con]=newline;
        	}
        	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        	int M=lines.length;
    		for (int i = 0; i < M; i++) {
    			if(i==lineNum) {
    				bw.write(newline);
    				bw.newLine();
    			}else {
    				bw.write(lines[i]);
    				bw.newLine();
    			}
    		}
        }
    } finally {
        reader.close();
    }
		
}*/
	/*public static void replaceLine(String file, String newline ,String oldline) throws IOException {
	File log= new File(file);
	String search = oldline;
	String replace = newline;

	try{
	    FileReader fr = new FileReader(log);
	    String s;
	    String totalStr = "";
	    try (BufferedReader br = new BufferedReader(fr)) {

	        while ((s = br.readLine()) != null) {
	            totalStr += s;
	        }
	        totalStr = totalStr.replaceAll(search, replace);
	        FileWriter fw = new FileWriter(log);
	    fw.write(totalStr);
	    fw.close();
	    }
	}catch(Exception e){
	    e.printStackTrace();
	}
}*/
}
