public class Questions {
    public static void main(String[] args){
        int x = 5;
        if(!(((x >1) & (x++ < 10))^((1==x)|| (10 > x ++))))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}
