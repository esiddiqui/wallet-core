package com.es.wallet.core.walletcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableJpaRepositories
//@EnableEurekaClient
public class WalletCoreApplication {

	@Autowired
	private EntryService service;

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(WalletCoreApplication.class);
		app.run();
	}

	@PostConstruct
	 void test() {
		this.service.findAll().stream().forEach(System.out::println);
	}
}
