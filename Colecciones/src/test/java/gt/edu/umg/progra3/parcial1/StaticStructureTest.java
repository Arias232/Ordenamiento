package gt.edu.umg.progra3.parcial1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StaticStructureTest {

    @Test
    public void ordenarTest(){
        String[] values = new String[3];
        values[0] = "Carlos";
        values[1] = "Xavier";
        values[2] = "Andres";
        StaticStructureManager<String> ds = new StaticStructureManager<String>(values);
        String[]  result = ds.ordenar();
        String[]  expec = new String[3];
        expec[0] = ("Andres");
        expec[1] = ("Carlos");
        expec[2] = ("Xavier");
        Assert.assertEquals(result,expec);
    }

    @Test
    public void inversaTest(){
        String[] values = new String[3];
        values[0] = "Carlos";
        values[1] = "Xavier";
        values[2] = "Andres";
        StaticStructureManager<String> ds = new StaticStructureManager<String>(values);
        String[]  result = ds.ordenarInversa();
        String[]  expec = new String[3];
        expec[2] = ("Andres");
        expec[1] = ("Carlos");
        expec[0] = ("Xavier");


        Assert.assertEquals(result,expec);
    }

    @Test
    public void ordenarNumerosTest(){
        Integer[] values = new Integer[3];
        values[0]=(34);
        values[1]=(2);
        values[2]=(5);
        StaticStructureManager<Integer> ds = new StaticStructureManager<Integer>(values);
        Integer[] result = ds.ordenar();
        Integer[] expec = new Integer[3];
        expec[0]=(2);
        expec[1]=(5);
        expec[2]=(34);

        Assert.assertEquals(result,expec);
    }

    @Test
    public void inversaNumerosTest(){
        Integer[] values = new Integer[3];
        values[0]=(34);
        values[1]=(2);
        values[2]=(5);
        StaticStructureManager<Integer> ds = new StaticStructureManager<Integer>(values);
        Integer[] result = ds.ordenarInversa();
        Integer[] expec = new Integer[3];
        expec[2]=(2);
        expec[1]=(5);
        expec[0]=(34);


        Assert.assertEquals(result,expec);
    }
}
