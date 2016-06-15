package br.unesp.JDBC;

import br.unesp.JDBC.Controller.UniversityController;

/**
 * Created by Bruno on 14/06/2016.
 */
public class Main {
    public static void main(String args[]){
        UniversityController universityController = new UniversityController();

        universityController.insertUniversity("Universidade Estadual Paulista Julio de Mesquita Filho",
                                              "Rua 24 A - Bela Vista",
                                              "Rio Claro",
                                              "UNESP",
                                              "141152869"
                                             );

        universityController.updateUniversity(4,
                                              "Universidade Estadual Paulista Julio de Mesquita Filho",
                                              "Rua 24 A - Bela Vista",
                                              "Cidade Rio Claro",
                                              "UNESP",
                                              "141152869"
                                              );

        universityController.deleteUniversity(4);
    }
}
