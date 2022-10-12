public class Loops {
    public static void main (String[] args){
        int i = 0;
        do{
            System.out.println("inside do while");
            i++;
        } while (i<5);

        while (i < 10){
            System.out.println("inside while");
            i++;
        }  
        
        for (;i < 15; i++){
            System.out.println("inside for");
        }
    }   
}
