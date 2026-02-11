package S14_FileHandling.CheckOS;

class CheckOSMain{
    public static void main(String[] args){
        String OS = System.getProperty("os.name").toLowerCase();
        System.out.println("Operating system: "+OS);

        String p1 = System.getProperty("os.arch");
        System.out.println("OS architecture: "+p1);
        String p2 = System.getProperty("java.vm.version");
        System.out.println("Java VM version: "+p2);
        String p3 = System.getProperty("java.version");
        System.out.println("Java version: "+p3);
        String p4 = System.getProperty("user.dir");
        System.out.println("User directory: "+p4);
        String p5 = System.getProperty("java.vendor.url");
        System.out.println("Java vendor's url: "+p5);
        System.out.println("*******************************************");

        if(OS.contains("win")){
            System.out.println("Windows System");
        }
        else if(OS.contains("mac")){
            System.out.println("Apple System");
        }
        else if(OS.contains("nux") || OS.contains("nix") || OS.contains("aix")){
            System.out.println("Linux System");
        }
        else{
            System.out.println("Unknown OS");
        }
    }
}