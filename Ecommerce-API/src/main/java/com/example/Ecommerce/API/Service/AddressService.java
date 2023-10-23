package com.example.Ecommerce.API.Service;

import com.example.Ecommerce.API.Model.Address;
import com.example.Ecommerce.API.Repository.IAddress;
import com.example.Ecommerce.API.Repository.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddress address;

    @Autowired
    IUser iUser;

    public String saveAddress(Address newAddress) {

        address.save(newAddress);
        return "Address Added";
    }
}
