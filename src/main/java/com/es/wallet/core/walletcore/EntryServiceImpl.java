package com.es.wallet.core.walletcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EntryServiceImpl implements EntryService {


    private final EntryRepository repo;

    @Autowired
    public EntryServiceImpl(EntryRepository repo) {
        this.repo = repo;
    }


    @Override
    public List<Entry> findAll() {
        long count = this.repo.count();
        System.out.println("the total number of rows in entry table are: " + count);
         //this.repo.save(new Entry(5,"INFO","fatima","fatima's sample link","fem-d","fem.d.com","fem-d@gmail.com","femm&","samepwd","9008"));
         count = this.repo.count();
        System.out.println("the total number of rows in entry table are: " + count);
        //return new ArrayList<Entry>();

        return this.repo.findAll();
    }
}
