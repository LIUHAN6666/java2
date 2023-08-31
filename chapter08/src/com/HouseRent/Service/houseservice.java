package com.HouseRent.Service;

import com.HouseRent.Domain.House;

public class houseservice {
    private House[] house;

    public houseservice(int size) {
        house = new House[size];
        house[0] = new House(1, "jack", "223",
                "海淀区", 2000, "未出租");
    }
    public House[] list(){
        return house;
    }
}
