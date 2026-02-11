package S7_Core_concepts.NonStatic_InnerClass;
import S7_Core_concepts.NonStatic_InnerClass.Shop.Shop;
class Main{
    /*
        setLock() --> to assign another/new obj to current lock obj
        getLock() --> to access the Shop class created lock object states
        isLocking --> to access the state of locking
        setLocking --> to change the state of locking
    */
    public static void main(String[] args) {
        Shop shop1 = new Shop();
        shop1.ShopStatus();
        Shop shop2  = new Shop(false);
        shop2.ShopStatus();


        // in case Lock class is public getLock(), isLocking() & setLocking() will work
//        shop1.getLock().setLocking(true);
//        shop1.ShopStatus();
    }
}