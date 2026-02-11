package S7_Core_concepts.Packages;
import S7_Core_concepts.Packages.org.prathamesh.education.Home.Home;
public class PackageMain {
    public static void main(String args[]){
        Home home = new Home();
        home.display_education();
        System.out.println("\n");
        S7_Core_concepts.Packages.org.prathamesh.LanguagesLearned.Home home2
                = new S7_Core_concepts.Packages.org.prathamesh.LanguagesLearned.Home();
        home2.display();
    }
}
