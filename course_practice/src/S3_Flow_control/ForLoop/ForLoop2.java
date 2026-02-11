class ForLoop2{
    public static void main(String args[]){
        int i = 0;

        //With pre-increment operator
        for(i = 0;i < 10;++i)
        {
            System.out.println(i);
        }


        //With post-increment operator
        for(i = 0;i < 10;i++)
        {
            System.out.println(i);
        }

    }
}