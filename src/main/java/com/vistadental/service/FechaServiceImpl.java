package com.vistadental.service;

import com.vistadental.dao.FechaDao;
import com.vistadental.domain.Fecha;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FechaServiceImpl implements FechaService {

    @Autowired
    private FechaDao fechaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Fecha> getFechas() {
        return (List<Fecha>) fechaDao.findAll();
    }
    
    
    
    
}
