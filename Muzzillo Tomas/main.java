import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner entrada = new Scanner(System.in);
	    
        int led = 0;
        String valor;
        int valores = entrada.nextInt();
        for(int i=0; i<valores ;i++){
            valor = entrada.next();
           for(int c=0;c<valor.length();c++){
            if(valor.charAt(c) == '1')
                led +=2;
            if(valor.charAt(c) == '2' || valor.charAt(c) == '3' || valor.charAt(c) == '5')
                led +=5;
            if(valor.charAt(c) == '4')
                led +=4;
            if(valor.charAt(c) == '6' || valor.charAt(c) == '9' || valor.charAt(c) == '0')
                led +=6;
            if(valor.charAt(c) == '7')
                led +=3;
            if(valor.charAt(c) == '8')
                led +=7;
           }
           System.out.println(led +" leds");
           led =0;
       }
			 
	}
		
}
	

	

