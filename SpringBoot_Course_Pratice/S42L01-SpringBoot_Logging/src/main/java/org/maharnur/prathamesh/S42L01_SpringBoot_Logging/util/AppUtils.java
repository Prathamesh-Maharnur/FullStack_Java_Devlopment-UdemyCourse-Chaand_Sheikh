package org.maharnur.prathamesh.S42L01_SpringBoot_Logging.util;

import java.io.File;

public class AppUtils {
    public static String get_upload_path(String fileName){
        return new File("src\\main\\resources\\static\\uploads").getAbsolutePath()
        + "\\" + fileName;
    }
}
