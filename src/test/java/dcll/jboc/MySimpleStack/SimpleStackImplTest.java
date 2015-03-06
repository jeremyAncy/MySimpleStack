package dcll.jboc.MySimpleStack;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

public class SimpleStackImplTest extends TestCase {

    SimpleStack simpleStack;

    public void setUp() throws Exception {
        simpleStack = new SimpleStackImpl();
        System.out.println("Je suis exécuté avant chaque test");

    }

    @Test
    public void testIsEmpty() throws Exception {
        assertEquals(true, simpleStack.isEmpty());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        assertEquals(0, simpleStack.getSize());
        String element1 = "toto";
        simpleStack.push(new Item(new String(element1)));
        simpleStack.push(new Item(new String(element1+"2")));
    }

    public void testPush() throws Exception {
        Item ita = new Item(new Integer(8));
        assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        // la pile doit etre augmentée d'un item
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        // on doit retrouver l'objet initial
        assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(ita.getValue(), integer);
    }

    public void testPeek() throws Exception {
        Item ita = new Item(new Integer(8));
        assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.peek();
        // ne doit pas retirer l'objet de la pile
        assertEquals(1, simpleStack.getSize());
        // on doit retrouver l'objet initial
        assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(ita.getValue(), integer);
    }

    public void testPop() throws Exception {
        Item ita = new Item(new Integer(8));
        assertEquals(0, simpleStack.getSize());
        simpleStack.push(ita);
        assertEquals(1, simpleStack.getSize());
        Item o = simpleStack.pop();
        // ne doit pas retirer l'objet de la pile
        assertEquals(0, simpleStack.getSize());
        // on doit retrouver l'objet initial
        assertTrue(o.getValue() instanceof Integer);
        Integer integer = (Integer) o.getValue();
        assertEquals(8, integer.intValue());
        assertEquals(ita.getValue(), integer);
    }
}