package org.maharnur.prathamesh.S40L02_PaginationAnd_Sorting_WrapUp.util;

import java.io.File;

public class AppUtils {
    public static String get_upload_path(String fileName){
        return new File("src\\main\\resources\\static\\uploads").getAbsolutePath()
        + "\\" + fileName;
    }
}
