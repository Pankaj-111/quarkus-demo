package com.magicbricks.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.magicbricks.repository.TpcndRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class PhotoComponentServiceImpl implements PhotoComponentService {

	@Inject
	private TpcndRepo repo;

	@Override
	public String getPotoComponent() {
		log.info("10 th city  :{}", repo.getByGroup("City").get(10).getCnddesc());
		return "Photo Component";
	}

}
