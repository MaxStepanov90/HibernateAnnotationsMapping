package dao;

import entity.Project;

import java.sql.SQLException;
import java.util.List;

public interface ProjectDao {

    void add (Project project)throws SQLException;
    List<Project> getAll() throws SQLException;
    Project getById (Long id)throws SQLException;
    void update(Project project) throws SQLException;
    void remove (Project project) throws SQLException;
}
