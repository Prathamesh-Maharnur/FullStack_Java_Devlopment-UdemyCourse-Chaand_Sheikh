package org.maharnur.prathamesh.S43L02_SpringBoot4_Section_WrapUp.util;

import java.io.File;

public class AppUtils {
    public static String get_upload_path(String fileName){
        return new File("src\\main\\resources\\static\\uploads").getAbsolutePath()
        + "\\" + fileName;
    }
}
