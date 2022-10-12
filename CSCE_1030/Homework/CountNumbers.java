public class CountNumbers {
    public static void main(String[] args){

        int num = 1;

        while(num <= 5){
            System.out.println(num);
            num++;
        }
        do{
            System.out.println(num);
            num++;
        }while (num <= 10);

        for(; num <= 15; num++)
            System.out.println(num);
    }
}
