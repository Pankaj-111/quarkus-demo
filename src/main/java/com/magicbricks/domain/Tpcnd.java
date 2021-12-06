package com.magicbricks.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "TPCND", schema = "PROPERTY")
public class Tpcnd extends PanacheEntityBase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cndrfnum;

	private Long cndcndrfnum;

	private String cndcode;

	private String cnddesc;

	private String cndfieldtype;

	private String cndgroup;

	private Double cndseqnum;

	private Date createdate;

	private Long createdby;

	private String deleted;

	private Long exfield1;

	private String exfield2;

	private String isactive;

	private Date modidate;
}