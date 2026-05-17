package org.maharnur.prathamesh.S39L04_SendingEmail_For_PasswordReset.util;

import java.io.File;

public class AppUtils {
    public static String get_upload_path(String fileName){
        return new File("src\\main\\resources\\static\\uploads").getAbsolutePath()
        + "\\" + fileName;
    }
}
