package com.example.process;

import com.example.repository.UserEntity;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProcessService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<UserEntity> readData() {
        ArrayList<UserEntity> arrayList = new ArrayList<>();
        for (int i = 0; i < 3; i ++) {
           /* MyTopic myTopic = myTopicRepository.findById(i);
            if (myTopic != null) {
                arrayList.add(myTopic);
            }*/
        }
        return arrayList;
    }
}
