package S7_Core_concepts.NonStatic_InnerClass.Shop;

public class Shop{

    public Shop(){

    }

    public Shop(boolean bool){
        lock.setLocking(bool);
    }

    Lock lock = new Lock();
    /*
        setLock() --> to assign another/new obj to current lock obj
        getLock() --> to access the Shop class created lock object states
        isLocking --> to access the state of locking
        setLocking --> to change the state of locking
    */
    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public void ShopStatus(){
        if(lock.isLocking()){
            System.out.println("Shop is closed");
        }
        else{
            System.out.println("Shop is open");
        }

    }

    private class Lock{
        public boolean locking = true;

        public boolean isLocking() {
            return locking;
        }

        public void setLocking(boolean locking) {
            this.locking = locking;
        }
    }

}