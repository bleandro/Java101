package br.unesp.JDBC.Controller;

import br.unesp.JDBC.DAO.IUniversityRepository;
import br.unesp.JDBC.DAO.UniversityRepository;
import br.unesp.JDBC.beans.University;

import java.util.List;

/**
 * Created by Bruno on 14/06/2016.
 */
public class UniversityController {
    public void insertUniversity(String name, String adress, String city, String initials, String RA141152869){
        IUniversityRepository iUniversityRepository = new UniversityRepository();

        University university = new University();
        university.setName(name);
        university.setAdress(adress);
        university.setCity(city);
        university.setInitials(initials);
        university.setRA141152869(RA141152869);

        iUniversityRepository.insertUniversity(university);
    }

    public void updateUniversity(int id, String name, String adress, String city, String initials, String RA141152869){
        IUniversityRepository iUniversityRepository = new UniversityRepository();

        University university = new University();
        university.setId(id);
        university.setName(name);
        university.setAdress(adress);
        university.setCity(city);
        university.setInitials(initials);
        university.setRA141152869(RA141152869);

        iUniversityRepository.updateUniversity(university);
    }
    public void deleteUniversity(int id){
        IUniversityRepository iUniversityRepository = new UniversityRepository();

        University university = new University();
        university.setId(id);

        iUniversityRepository.deleteUniversity(university);
    }

    public List<University> selectUniversity(University university) {
        throw new UnsupportedOperationException("Not supported yet!");
    }
}
