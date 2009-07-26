/*
 * Copyright 2009 Murat Knecht
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 *  
 *     http://www.apache.org/licenses/LICENSE-2.0
 *      
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 */
package net.sf.profiler4j.console.util.export;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.apache.commons.lang.Validate;

public class ImageFileWriter {
    
    public void writeFile(JPanel panel, ToImageConverter creator, File exportFile) throws IOException{
        Validate.notNull(panel);
        Validate.notNull(creator);
        Validate.notNull(exportFile);
        
        byte[] imageBytes = creator.export(panel);
                FileOutputStream fos = new FileOutputStream(exportFile);
                fos.write(imageBytes);
                fos.close();
    }
    
}