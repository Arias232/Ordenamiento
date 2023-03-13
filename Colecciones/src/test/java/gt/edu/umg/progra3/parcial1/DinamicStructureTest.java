package gt.edu.umg.progra3.parcial1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DinamicStructureTest {

    @Test
    public void ordenarTest(){
        List values = new ArrayList();
        values.add("Carlos");
        values.add("Xavier");
        values.add("Andres");
        DinamicStructuresManager<String> ds = new DinamicStructuresManager<>(values);
        List result = ds.ordenar();
        List expec = new ArrayList();
        expec.add("Andres");
        expec.add("Carlos");
        expec.add("Xavier");

        Assert.assertEquals(result,expec);
    }

    @Test
    public void inversaTest(){
        List values = new ArrayList();
        values.add("Carlos");
        values.add("Xavier");
        values.add("Andres");
        DinamicStructuresManager<String> ds = new DinamicStructuresManager<>(values);
        List result = ds.ordenarInversa();

        List expec = new ArrayList();
        expec.add("Xavier");
        expec.add("Carlos");
        expec.add("Andres");


        Assert.assertEquals(result,expec);
    }

    @Test
    public void ordenarNumerosTest(){
        List<Integer> values = new ArrayList();
        values.add(34);
        values.add(2);
        values.add(5);
        DinamicStructuresManager<Integer> ds = new DinamicStructuresManager<Integer>(values);
        List result = ds.ordenar();
        List expec = new ArrayList();
        expec.add(2);
        expec.add(5);
        expec.add(34);

        Assert.assertEquals(result,expec);
    }

    @Test
    public void inversaNumerosTest(){
        List<Integer> values = new ArrayList();
        values.add(34);
        values.add(2);
        values.add(5);
        DinamicStructuresManager<Integer> ds = new DinamicStructuresManager<Integer>(values);
        List result = ds.ordenarInversa();

        List expec = new ArrayList();
        expec.add(34);
        expec.add(5);
        expec.add(2);


        Assert.assertEquals(result,expec);
    }
}
