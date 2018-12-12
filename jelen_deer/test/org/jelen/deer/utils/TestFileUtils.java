package org.jelen.deer.utils;



public class TestFileUtils {

	public static void main(String[] args)  {
		String testFilePath= "D:\\name.txt";
		/*testGetFirtLine(testFilePath);
		testGetLines(testFilePath);
		testAppendLine(testFilePath);*/
		//testReplaceLine(testFilePath);
		testlifo();
		testfifo();
	}
	/*
	public static void testGetLines(String filePath) {
		
	}
	
	public static void testGetFirtLine(String filePath) throws IOException {
		String test=FileUtils.getFirstLine(filePath);
		System.out.println(test);
		test=FileUtils.getFirstLine(filePath);
		System.out.println(test);
		test=FileUtils.getFirstLine(filePath);
		System.out.println(test);
		test=FileUtils.getFirstLine(filePath);
		System.out.println(test);
	}
	public static void testAppendLine(String filePath) throws IOException {
		FileUtils.appendLine(filePath, "cira");
		System.out.println(FileUtils.getLastLine(filePath));
	}*/
	/*public static void testReplaceLine(String filePath) throws IOException {
		FileUtils.replaceLine(filePath,"fiki", "miki");
	}*/
	public static void testlifo()  {
		LIFOqueue<String> test=new LIFOqueue<String>();
		test.push("miki");
		test.push("fiki");
		test.push("zoki");
		System.out.println(test.pull());
		System.out.println(test.pull());
		System.out.println(test.pull());
	}
	public static void testfifo()  {
		FIFOqueue<String> test=new FIFOqueue<String>();
		test.push("miki");
		test.push("fiki");
		test.push("zoki");
		System.out.println(test.pull());
		System.out.println(test.pull());
		System.out.println(test.pull());
	}
	
}
