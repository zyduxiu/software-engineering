package com.clinicappoint.clinic.Service;

public interface TypeService {
    public void postType(String code,String typename,
                         int timecost,int cost,int commission);

    public void delType(int id);
}
