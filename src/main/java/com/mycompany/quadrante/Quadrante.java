import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Quadrante {

    public String quadrantes(double x, double y){
        if(x == 0 && y == 0){
            return("Origem");
        }
        else if(x==0 && y!=0){
            return("Eixo Y");
        }
        else if(x!=0 && y==0){
            return("Eixo X");
        }
        else if(x>0 && y>0){
            return("Q1");
        }
        else if(x<0 && y>0){
            return("Q2");
        }
        else if(x<0 && y<0){
            return("Q3");
        }
        else if(x>0 && y<0){
            return("Q4");
        }
        return "erro";
    } 
}

