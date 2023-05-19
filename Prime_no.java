import java.util.Scanner;
public class Prime_no {
    public static void main(String[] args){ 
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter a number to check prime:");
        int n=sc1.nextInt();
        int c=2;
        while(c<=n*n){
            if(n%c==0){
                System.out.println("entered no is not prime"); 
                break;  
            }
            else if(n%c==1){
                c++;
            }
            else{
            System.out.println("entered no is  prime");  
            break;
            }
        }
        //System.out.println("entered no is:"+n);
        sc1.close();
    }
}
