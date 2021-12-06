package com.magicbricks.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.magicbricks.domain.Tpcnd;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class TpcndRepo implements PanacheRepositoryBase<Tpcnd, Long> {
	public Long findCount() {
        return count();
    }
	
	public List<Tpcnd> getByGroup(final String group){
		 return list("cndgroup = ?1 and deleted = 'N' and isactive='Y' order by cndseqnum", group);
	}
}
