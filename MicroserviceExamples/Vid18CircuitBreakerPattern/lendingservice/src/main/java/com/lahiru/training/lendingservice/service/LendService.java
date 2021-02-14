package com.lahiru.training.lendingservice.service;

import com.lahiru.training.lendingservice.model.DetailResponse;
import com.lahiru.training.librarycloud.commons.model.lend.Lend;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface LendService {

    Lend save(Lend lend);

    Lend findLendById(int id);

    List<Lend> getAllLends();

    DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException;


}
