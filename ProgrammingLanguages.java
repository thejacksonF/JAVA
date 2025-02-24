
//ARRAYLIST DE LOS LENGUAJES

import java.util.ArrayList;

class ProgrammingLanguages {
    public void ShowProgrammingLenguages() {
        ArrayList <String> arrayList = new ArrayList<>();

        String [] languages= {
            "Python","Java (Actualmente)","C++","C#","C"
        };

        for (String language: languages) {
            arrayList.add(language);
        }

        String language = arrayList.remove(4);

        System.out.println("lenguajes de programacion: "+ arrayList);
        System.out.println("Lenguaje eliminado: "+ language);

    }
}



