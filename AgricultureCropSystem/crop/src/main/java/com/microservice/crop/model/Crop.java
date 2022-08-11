package com.microservice.crop.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="cropsbook")
public class Crop {
@Id
	String Cropid;
    String Cropname;
    String Cropno;
	public String getCropid() {
		return Cropid;
	}
	public void setCropid(String cropid) {
		Cropid = cropid;
	}
	public String getCropname() {
		return Cropname;
	}
	public void setCropname(String cropname) {
		Cropname = cropname;
	}
	public String getCropno() {
		return Cropno;
	}
	public void setCropno(String cropno) {
		Cropno = cropno;
	}
	@Override
	public String toString() {
		return "Crop [Cropid=" + Cropid + ", Cropname=" + Cropname + ", Cropno=" + Cropno + "]";
	}
}