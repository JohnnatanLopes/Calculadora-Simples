package application;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

import Operacao.enums.operaçao;

public class Program {
	
	static Stack<Integer> stack = new Stack<>();
	static operaçao sinal;
	static int a;
	static int b;
	static int c;

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       
       //soma
       //menos
       //divisao
       //divisao
       
       try {
       for(int i = 0;i < 10;i++) {
       if(i < 1) {
           a = sc.nextInt();
        }
       b = sc.nextInt();
       stack.push(b);
       sinal = operaçao.valueOf(sc.next());
      
       testeOperaçao(); 
     
       stack.pop();
       stack.pop();
       stack.push(c);
       System.out.println(stack);
       
       a = c;
       stack.pop();
       }
       
       }catch(IllegalArgumentException e) {
    	   System.out.println("Entrada Invalida");
       }catch (InputMismatchException e) {
    	   System.out.println("Entrada Invalida");
	   }
       
      sc.close();

	}
	
	public static void testeOperaçao() {
		if(sinal.equals(operaçao.soma)) {
            c = a + b;
            stack.push(c);
         }  
         
         if(sinal.equals(operaçao.menos)) {
             c = a - b;
             stack.push(c);
          } 
         
         if(sinal.equals(operaçao.vezes)) {
             c = a * b;
             stack.push(c);
         } 
         
         if(sinal.equals(operaçao.divisao)) {
             c = a / b;
             stack.push(c);
         }
	}

}
