package RestOrdSystem.Administrator;


import java.io.File;
import javax.swing.filechooser.FileFilter;



/**
 *
 * @author shane
 */
public class ExampleFileFilter  extends  FileFilter {
    
    private   String   extension; 
    private   String   description="ONLY .jpg image";

    public   ExampleFileFilter(String   ext){
         extension   =   ext;
    }

   

    public   boolean   accept(File   file){

           if (file.isDirectory())
           {
              return true;
           }

        String fileName = file.getName();
        int index = fileName.lastIndexOf('.');

        if (index > 0 && index < fileName.length() - 1)
        {
            String extension = fileName.substring(index + 1).toLowerCase();
            if (extension.compareToIgnoreCase(extension)==0)
                return true;
        }

           return false;

    }


    public  String getDescription(){
          return description;
    }
 

}
