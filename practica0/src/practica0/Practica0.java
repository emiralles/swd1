/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica0;

import java.io.File;
import java.io.IOException;


/**
 *
 * @author emiralya8.alumnes
 */
public class Practica0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("test");
          try {
              file.createNewFile();
              ComUtils cmUtils = new ComUtils(file);
              cmUtils.writeTest();
              System.out.println(cmUtils.readTest());
            }
            catch(IOException e)
            {
                System.out.println("Error Found during Operation:" + e.getMessage());
                e.printStackTrace();
            }
    }
    
}
