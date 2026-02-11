package S7_Core_concepts.Local_InnerClass;

import S7_Core_concepts.Local_InnerClass.Door.Door;

class Local_InnerClass_Main{
    public static void main(String args[]){
        Door door = new Door();
        if(door.isLocked(args[1])){
            System.out.println("Door is Locked");
        }
        else{
            System.out.println("Door is Unlocked");
        }
    }
}