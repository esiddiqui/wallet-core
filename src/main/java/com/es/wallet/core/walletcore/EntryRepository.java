package com.es.wallet.core.walletcore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.repository.CrudRepository;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "entry", path = "entry")
public interface EntryRepository extends JpaRepository<Entry, Long> {
     List<Entry> findAll();
}
