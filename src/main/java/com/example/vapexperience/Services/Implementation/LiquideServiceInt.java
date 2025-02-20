package com.example.vapexperience.Services.Implementation;

import com.example.vapexperience.Models.Liquide;

import java.util.List;

public interface LiquideServiceInt {

     boolean addLiquide(Liquide liquide);
     List<Liquide> getLiquideByName(String liquideName);

}
