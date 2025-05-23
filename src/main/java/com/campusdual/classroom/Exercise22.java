package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {

        ArrayList<String> arreglo = new ArrayList<>();
        arreglo.add("GKFFD");
        arreglo.add("TNANA");
        arreglo.add("MPMSL");
        arreglo.add("PSWME");
        arreglo.add("LZMLF");
        arreglo.add("JYEBV");
        arreglo.add("YELNT");
        arreglo.add("JSNKR");
        arreglo.add("JFESF");
        arreglo.add("TMJLL");
        return arreglo;

    }

    public static void printElementsAndIndex(List<String> customList) {

        for (String element : customList){
            System.out.println("El elemento " + element + " se encuentra en la posicion: " + customList.indexOf(element));
        }

    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void main(String[] args) {

        List<String> arrayList = createArrayList();
        arrayList.add("AAAAA");
        printElementsAndIndex(arrayList);

    }


}
