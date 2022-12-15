import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {
    @Test
    void fiftynineshouldreturnf(){
        var cal = new Grader();
        assertEquals('F',cal.determinelettergrade(59));
    }
    @Test
    void sixtynineshouldreturnD(){
        var cal = new Grader();
        assertEquals('D',cal.determinelettergrade(69));
    }
    @Test
    void seventynineshouldreturnC(){
        var cal = new Grader();
        assertEquals('C',cal.determinelettergrade(79));
    }
    @Test
    void eightynineshouldreturnB(){
        var cal = new Grader();
        assertEquals('B',cal.determinelettergrade(89));
    }
    @Test
    void ninetynineshouldreturna(){
        var cal = new Grader();
        assertEquals('A',cal.determinelettergrade(99));
    }
    @Test
    void eightyshouldreturnb(){
        var cal = new Grader();
        assertEquals('B',cal.determinelettergrade(80));
    }
    @Test
    void negative1shouldreturnIllegalargumentexepction(){
        var cal = new Grader();
        assertThrows(IllegalArgumentException.class,
                () ->{
            cal.determinelettergrade(-1);
        });

    }
}