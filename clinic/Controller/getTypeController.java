package com.clinicappoint.clinic.Controller;

import com.clinicappoint.clinic.Entity.types;
import com.clinicappoint.clinic.Repository.TypesRepository;
import com.clinicappoint.clinic.Service.TypeService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.List;

@RestController
@CrossOrigin
public class getTypeController {
    @Autowired
    TypesRepository typesRepository;
    @Autowired
    TypeService typeService;

    @CrossOrigin
    @GetMapping("/getType")
    public List<types> getTypes(){
        return typesRepository.findAll();
    }

    @CrossOrigin
    @PostMapping("/postType")
    public ResponseEntity<String> postType(@RequestBody type pd){
        typeService.postType(pd.getCode(),pd.getTypename(),pd.getTimecost(),
                pd.getCost(),pd.getCommission());
        return ResponseEntity.ok("yes");
    }

    @CrossOrigin
    @PostMapping("/deleteproject")
    public ResponseEntity<String> deleteType(@RequestBody deltype pd){
        typeService.delType(pd.getId());
        return ResponseEntity.ok("yes");
    }


    @Data
    static class deltype{
        public int id;
    }
    @Data
    static class type{
        public String code;
        public String typename;
        public int timecost;
        public int cost;
        public int commission;
    }
}
