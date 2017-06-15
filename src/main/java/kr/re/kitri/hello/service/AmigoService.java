package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.AmigoDao;
import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmigoService {

    @Autowired
    private AmigoDao dao;

    public void registAmigo(Amigo amigo) {

        dao.insertAmigo(amigo);

    }
}
