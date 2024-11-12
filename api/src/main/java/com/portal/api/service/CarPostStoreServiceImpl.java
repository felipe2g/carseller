package com.portal.api.service;

import com.portal.api.client.CarPostStoreClient;
import com.portal.api.dto.CarPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService {

    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @Override
    public List<CarPostDTO> getCarForSales() {
        return carPostStoreClient.CarForSaleClient();
    }

    @Override
    public void changeCarForSale(CarPostDTO carPostDTO, String userId) {
        carPostStoreClient.changeCarForSaleClient(carPostDTO, userId);
    }

    @Override
    public void removeCarForSale(String id) {
        carPostStoreClient.deleteCarForSaleClient(id);
    }
}
