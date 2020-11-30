package PSP1;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @autor Sergio Santos da Silva
 */
public class MaquinaCafeTest {
    
    private MaquinaCafe A, B, C, D; 

    @Before
    public void test() {
        ArrayList<Integer> aux0 = new ArrayList(Arrays.asList(10,20,30));
        ArrayList<Integer> aux1 = new ArrayList(Arrays.asList(10,30,20));
        ArrayList<Integer> aux2 = new ArrayList(Arrays.asList(30,10,20));
        ArrayList<Integer> aux3 = new ArrayList(Arrays.asList(80,50,10,5,15));
        
        A = new MaquinaCafe(aux0);
        B = new MaquinaCafe(aux1);
        C = new MaquinaCafe(aux2);
        D = new MaquinaCafe(aux3);
    }

    @Test
    public void testGetMelhorTempo() {
        assertEquals(80,A.GetMelhorTempo());
        assertEquals(60,B.GetMelhorTempo());
        assertEquals(100,C.GetMelhorTempo());
        assertEquals(290,D.GetMelhorTempo());
    }

    @Test
    public void testGetMelhoresAndares() {
        assertEquals("2 3",A.GetMelhoresAndares());
        assertEquals("2",B.GetMelhoresAndares());
        assertEquals("1 2",C.GetMelhoresAndares());
        assertEquals("1 2",D.GetMelhoresAndares());
    }
    
}
