package ru.javabegin.training.springlibrary.dao.imlp;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import ru.javabegin.training.springlibrary.dao.interfaces.GenreDAO;
import ru.javabegin.training.springlibrary.entities.Genre;

import java.util.List;

public class GenreDAOImpl implements GenreDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Genre> getGenres() {
        return sessionFactory.getCurrentSession().createCriteria(Genre.class).list();
    }
}
