package org.qlm.service01.service;

import org.qlm.service01.entity.Incident;

import java.util.List;

public interface InclidentService {

    Integer addIncs(String userId, String typeId, String duId,String media,
                    String location , String remark, String memo);


    List<Incident> findIncident(Integer state);
}
