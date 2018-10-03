import java.util.Scanner;

public class PTB2 {
    public static void main(String[] args) {
        double a,b,c,delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao gia tri a");
        a = sc.nextDouble();
        System.out.println("Nhap vao gia tri b");
        b = sc.nextDouble();
        System.out.println("Nhap vao gia tri c");
        c = sc.nextDouble();
        System.out.println("Phuong trinh: " + a + "x^2+" + b+"x+"+c+"=0" );
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("Phuong trinh co vo so nghiem");
                }
                else{
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
            else{
                if(c==0){
                    System.out.println("Phuong trinh co nghiem x = 0");
                }
                else{
                    System.out.println("Phuong trinh co nghiem x = " + -c/b );
                }
            }

        }else {
            delta = Math.pow(b,2) - 4*a*c;
            if(delta>0){
                System.out.println("Phuong trinh co 2 nghiem x1 = " + (-b+Math.sqrt(delta))/2*a );
                System.out.print(", x2 = " + (-b-Math.sqrt(delta))/2*a );
            }else if(delta==0){
                System.out.println("Phuong trinh co 1 nghiem x = " + (-b/2*a) );
            }else {
                System.out.println("Phuong trinh khong co nghiem thuc ");
            }
        }

    }
}
