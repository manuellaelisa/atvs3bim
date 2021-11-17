package javateste;

import java.io.*;
import java.util.Arrays;

public class Programa1 {
	
	public static void main(String args[]) throws IOException {
        FileInputStream stream = new FileInputStream("./teste1.txt");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String l = br.readLine();
        
        String [] input = new String[3];
        int x = -1;        
        while(l != null) {
        	x = x + 1;
            input[x] = l;
            l = br.readLine();
        }
        String[] TamanhoSeparado = input[2].split(" ");

        int m = 0;
        int resultado = 0;
        for(int j=0; j < TamanhoSeparado.length; j++) {
        	m += Integer.parseInt(TamanhoSeparado[j]); 
        }
        m = m / Integer.parseInt(input[0]);
        
        while(m > 0) {
        	for(int j=0; j < TamanhoSeparado.length; j++) {
            	r += Integer.parseInt(TamanhoSeparado[j]) / m;
        	}
        	if(r == Integer.parseInt(input[0])) {
        		System.out.println(m);
        		break;
        	}
        	else {
        		m = m - 1;
        		r = 0;
        	}
        }
    }
}