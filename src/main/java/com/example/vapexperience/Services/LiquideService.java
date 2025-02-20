package com.example.vapexperience.Services;

import com.example.vapexperience.Models.Liquide;
import com.example.vapexperience.Repositories.LiquideRepository;
import com.example.vapexperience.Services.Implementation.LiquideServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LiquideService  implements LiquideServiceInt {
    @Autowired
    LiquideRepository liquideRepository;

    @Override
    public boolean addLiquide(Liquide liquide) {
        try{
            liquideRepository.save(liquide);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Liquide> getLiquideByName(String liquideName) {
        ArrayList<Liquide> liquideList = new ArrayList<>();
        try{


            return liquideList ;
        }catch(Exception e){
            return null;
        }
    }
}
