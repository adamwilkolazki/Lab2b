package pl.lublin.wsei.java.cwiczenia.test;

import pl.lublin.wsei.java.cwiczenia.GusInfoGraphicList;
import pl.lublin.wsei.java.cwiczenia.Infografika;

public class GusInfoGraphicListTest {
    public static void main(String[] args) {
        GusInfoGraphicList gusInfoGraphicList = new GusInfoGraphicList("gusInfoGraphic.xml");
        for (Infografika infograf: gusInfoGraphicList.infografiki) infograf.print();

            


    }
}
