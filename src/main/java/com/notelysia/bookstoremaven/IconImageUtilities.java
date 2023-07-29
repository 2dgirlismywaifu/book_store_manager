/*
 * Copyright By @2dgirlismywaifu (2023)
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.notelysia.bookstoremaven;

import java.awt.Window;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IconImageUtilities {
    
    //log4j
    private final static Logger logger = LogManager.getLogger(IconImageUtilities.class);
    
    public void setWindowImage(Window window)
    {
        try
        {
            InputStream imageInputStream = window.getClass().getResourceAsStream("/icons8-database-48.png");
            BufferedImage bufferedImage = ImageIO.read(imageInputStream);
            window.setIconImage(bufferedImage);
        } catch (IOException ex) {
            logger.error("Exceptions happen: " + ex, ex);
        }
    }
}
