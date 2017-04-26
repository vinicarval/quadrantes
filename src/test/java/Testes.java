import org.junit.Test;
import static org.junit.Assert.*;

public class Testes {  
    public Testes() {
        
    } 
    
    @Test
    public void testeQ1(){
        assertEquals("Q1", new Quadrante().quadrantes(2.2, 2.1));
    }
    
    @Test
    public void testeOrigem(){
        assertEquals("Origem", new Quadrante().quadrantes(0, 0));
    }
    
    @Test
    public void testeQ4(){
        assertEquals("Q4", new Quadrante().quadrantes(2.2, -2.1));
    }
}
