import java.util.Scanner;
public class Calculadora 
{
    public static void main(String args[]) 
    {
        double varx, vary;//variaveis de calculos
        byte var2;//variavel de interacao primaria
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("choose a number of what you want to do \n1-Multiplicacao\n2-Divisao\n3-potencia\n");
        var2 = sc.nextByte();
        
        if(var2 == 1)
        {
           System.out.println("Digite 2 numeros");
           varx = sc.nextDouble();
           vary = sc.nextDouble();
           System.out.println(multiplicacao(varx,vary));
           
        }
        else if(var2 == 2)
        {
            System.out.println("Digite 2 numeros");
            varx = sc.nextDouble();
            vary = sc.nextDouble();
            System.out.println(divisao(varx,vary));
            /*if((varx%vary)!=0)
                System.out.println("resto = "+resto(varx,vary));
            */
        }
        else
        {
            System.out.println("Digite o numero e a potencia");
            varx = sc.nextDouble();
            vary = sc.nextDouble();
            System.out.println(potencia(varx,vary));
        }
        
        System.out.println("FIM");
    }
    
    public static double multiplicacao (double x, double y){
        return(x*y);}
    
    public static double divisao(double x, double y){
        return((x/y));} 
    
    public static double resto(double x, double y){
        return((x%y));}
    
    public static double potencia(double x, double y)
    {
        for(int i = 1;i<y;i++)
        {
            x = x*x;
        }
        return(x);
    }
}
