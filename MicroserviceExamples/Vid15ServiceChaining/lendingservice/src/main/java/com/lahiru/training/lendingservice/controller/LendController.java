package com.lahiru.training.lendingservice.controller;

import com.lahiru.training.lendingservice.model.Response;
import com.lahiru.training.lendingservice.model.SimpleResponse;
import com.lahiru.training.lendingservice.service.LendService;
import com.lahiru.training.librarycloud.commons.model.lend.Lend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/services")
public class LendController {

    @Autowired
    LendService lendService;

    @RequestMapping(value = "/lends", method = RequestMethod.POST)
    public Lend save(@RequestBody Lend lend){
        return lendService.save(lend);
    }

    @RequestMapping(value = "/lends/{id}", method = RequestMethod.GET)
    public Response findLend(@PathVariable(value = "id") int lendId, @RequestParam(required = false) String type){

        if (type == null){
            return new SimpleResponse(lendService.findLendById(lendId));
        } else {
            return lendService.findDetailResponse(lendId);
        }
    }

    @RequestMapping(value = "/lends", method = RequestMethod.GET)
    public List<Lend> getAllLends(){
        return lendService.getAllLends();
    }

}
