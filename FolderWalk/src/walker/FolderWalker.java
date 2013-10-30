package walker;
import java.io.File;
	 
public class FolderWalker
{
	 
	 public static void main(String[] args) 
	{
	 
	  // Directory path here
	  String path = "C:/Users/Diogo/Downloads/temp"; 
	 
	  String files;
	  File folder = new File(path);
	  File[] listOfFiles = folder.listFiles(); 
	 
//	  for (int i = 0; i < listOfFiles.length; i++)
	  for(File file : listOfFiles)
	  {
	 
	   if (file.isFile()) 
	   {
	   files = file.getName();
	       if (files.endsWith(".txt") || files.endsWith(".TXT"))
	       {
	          System.out.println(files);
	        }
	     }
	  }
	}
}	
