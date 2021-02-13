package com.lahiru.training.librarylendingtask.service;

import org.springframework.stereotype.Service;

@Service
public class LibraryLendingServiceImpl implements LibraryLendingService {

    @Override
    public boolean validName(String name){
        return name.length() > 3;
    }

}
