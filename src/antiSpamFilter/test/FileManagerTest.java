package antiSpamFilter.test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Arrays;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import org.junit.Test;

import antiSpamFilter.FileManager;

public class FileManagerTest {
	
	FileManager fm = new FileManager();

	@Test
	public void testFileManager() {
	}

	@Test
	public void testBaseDirectoryPrompt() {
		assertNotNull("should not be null", fm.BaseDirectoryPrompt(new JFrame()));
		assertEquals(fm.getChooser().showOpenDialog(new JFrame()), JFileChooser.APPROVE_OPTION);
	}

	@Test
	public void testFileFolderPrompt() {
		assertNotNull("should not be null", fm.FileFolderPrompt(new JFrame()));
		assertEquals(fm.getChooser().showOpenDialog(new JFrame()), JFileChooser.APPROVE_OPTION);
	}

	@Test
	public void testFolderParser() {
//		fm.BaseDirectoryPrompt(new JFrame());
		fm.folderParser("experimentBaseDirectory");
		assertNotNull(fm.getHam());
		assertNotNull(fm.getSpam());
		assertNotNull(fm.getRules());		
	}

	@Test
	public void testRead() {
		
		fm.Read(new File(""));
		assertNotNull("should not be null", fm.getLines());
	}
	
	
}