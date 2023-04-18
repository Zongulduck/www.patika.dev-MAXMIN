import java.util.Scanner;
public class MAXMİN {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int num,val,max=0,min=0,i=1;
        System.out.println("Kaç Sayı gireceksiniz: ?");
        num = inp.nextInt();
        while(i<=num){
            System.out.println(i+". sayıyı girin");
            val= inp.nextInt();
            if (i == 1) {
                max=val;
                min=val;
            }
            if(val>max){
                max=val;
            }
            else if(val<min){
                min=val;
            }
            i++;
        }
        System.out.println("En düşük sayı: "+min);
        System.out.println("En yüksek sayı: "+max);
    }
}
