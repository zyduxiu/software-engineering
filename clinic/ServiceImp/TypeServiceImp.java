package com.clinicappoint.clinic.ServiceImp;

import com.clinicappoint.clinic.Entity.types;
import com.clinicappoint.clinic.Repository.TypesRepository;
import com.clinicappoint.clinic.Service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceImp implements TypeService {
    @Autowired
    TypesRepository typesRepository;

    public void postType(String code,String typename,
                         int timecost,int cost,int commission){
        types type=new types();
        if(typesRepository.findTypesByTypename(typename)!=null){
            type=typesRepository.findTypesByTypename(typename);
        }
        else{
            type.setTypename(typename);
        }
        type.setCode(code);
        type.setTimecost(timecost);
        type.setCommission(commission);
        type.setCost(cost);
        typesRepository.save(type);
        return;
    }

    public void delType(int id){
        types type=typesRepository.findById(id).get();
        typesRepository.delete(type);
    }
}
