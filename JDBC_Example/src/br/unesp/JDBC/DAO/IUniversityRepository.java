package br.unesp.JDBC.DAO;

import java.util.List;
import br.unesp.JDBC.beans.University;

/**
 * Created by Bruno on 14/06/2016.
 */
public interface IUniversityRepository {
    public void insertUniversity(University university);
    public void updateUniversity(University university);
    public void deleteUniversity(University university);
    public List<University> selectUniversity(University university);
}
