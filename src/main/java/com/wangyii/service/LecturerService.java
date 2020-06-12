package com.wangyii.service;

import com.wangyii.entity.Lecturer;
import com.wangyii.entity.LecturerExample;
import com.wangyii.mapping.LecturerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerService {
    @Autowired
    LecturerExample lecturerExample;
    @Autowired
    LecturerMapper lecturerMapper;

    public int varifyLecturer(String lname,String lpwd){

        lecturerExample.createCriteria().andLecturepasswordEqualTo(lpwd).andLecturernameEqualTo(lname);
        List<Lecturer> list  =lecturerMapper.selectByExample(lecturerExample);
        return list.size();
    }
}
