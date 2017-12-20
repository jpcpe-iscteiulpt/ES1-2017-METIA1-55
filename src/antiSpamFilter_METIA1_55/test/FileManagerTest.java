package antiSpamFilter_METIA1_55.test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import org.junit.Test;

import antiSpamFilter_METIA1_55.FileManager;

public class FileManagerTest {
	
	private FileManager fm = FileManager.getInstance();

	@Test
	public void testFileManager() {
	}

	@Test
	public void testFileFolderPrompt() {
		assertNotNull("should not be null", fm.FileFolderPrompt(new JFrame()));
		assertEquals(fm.getChooser().showOpenDialog(new JFrame()), JFileChooser.APPROVE_OPTION);
	}

	@Test
	public void testFolderParser() {
//		fm.BaseDirectoryPrompt(new JFrame());
		fm.folderParser(fm.getExecutionPath());
		assertNotNull(fm.getHam());
		assertNotNull(fm.getSpam());
		assertNotNull(fm.getRules());		
	}

	@Test
	public void testRead() {
		fm.Read(new File(""));
		assertNotNull("should not be null", fm.getLines());
	}
	
	@Test
	public void testGetExecutionPath(){
		assertNotNull("should not be null", fm.getExecutionPath());	
	}
	@Test
	public void testGetFiles(){
		assertNotNull("should not be null", fm.getFiles());	
	}
	@Test
	public void testGetWeights(){
		fm.generateRandomWeights();
		assertNotNull("should not be null", fm.getWeights());	
	}
	@Test
	public void testGetSolutions(){
		fm.folderParser("experimentBaseDirectory/referenceFronts");
		assertNotNull("should not be null", fm.getSolutions());	
	}
	
	@Test
	public void testGenerateRandomWeights() {
		ArrayList<String> testRandomWeightArray = fm.generateRandomWeights();
		
		assertNotNull("should not be null", testRandomWeightArray);
		
		for(int i = 0; i < testRandomWeightArray.size(); i++) {
			assertFalse(Double.parseDouble(testRandomWeightArray.get(i)) < -5.00000);
			assertFalse(Double.parseDouble(testRandomWeightArray.get(i)) > 5.00000);
		}
	}
}