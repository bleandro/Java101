package br.unesp.JDBC.DAO;

import br.unesp.JDBC.beans.University;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Bruno on 14/06/2016.
 */
public class UniversityRepository implements IUniversityRepository{
    @Override
    public void insertUniversity(University university) {
        //Create query for insert
        String query = "INSERT INTO University(name, adress, city, initials, RA141152869)" +
                       "VALUES(?, ?, ?, ?, ?)";

        try {
            //Fill parameters with the "University" fields
            PreparedStatement stmt = MySQLConnection.getConnection().prepareStatement(query);
            stmt.setString(1, university.getName());
            stmt.setString(2, university.getAdress());
            stmt.setString(3, university.getCity());
            stmt.setString(4, university.getInitials());
            stmt.setString(5, university.getRA141152869());

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            //Any SQL problem
            e.printStackTrace();
        }
    }

    @Override
    public void updateUniversity(University university) {
        //Create query for update
        String query = "UPDATE University SET name = ?, " +
                       "                      adress = ?," +
                       "                      city = ?, " +
                       "                      RA141152869 = ?" +
                       "WHERE initials = ?";

        try {
            //Fill parameters with the "University" fields
            //I'm considering "Initials" as my primary key
            PreparedStatement stmt = MySQLConnection.getConnection().prepareStatement(query);
            stmt.setString(1, university.getName());
            stmt.setString(2, university.getAdress());
            stmt.setString(3, university.getCity());
            stmt.setString(4, university.getInitials());
            stmt.setString(5, university.getRA141152869());

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            //Any SQL problem
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUniversity(University university) {
        //Create query for update
        String query = "DELETE FROM University WHERE initials = ?";

        try {
            //Fill parameters with the "University" initials
            //I'm considering "Initials" as my primary key
            PreparedStatement stmt = MySQLConnection.getConnection().prepareStatement(query);
            stmt.setString(1, university.getInitials());

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            //Any SQL problem
            e.printStackTrace();
        }
    }

    @Override
    public void selectUniversity(University university) {
        throw new UnsupportedOperationException("Not supported yet!");
    }
}
