package S8_Arrays_Java.CallByReference;

class CallByReferenceMain{
    public static void main(String args[]){
        String[] names = {"Prathamesh", "Pratik", "Mayur", "David", "Vinayak"};
        System.out.println("Main method: "+names[1]);
        CallByReferenceMain main = new CallByReferenceMain();
        main.DisplayNames(names);
        System.out.println("Main method: "+names[1]);
    }

    public void DisplayNames(String[] names){
        System.out.println("Display method: "+names[1]);
        names[1] = "Aditya";
        System.out.println("Display method: "+names[1]);
    }
}