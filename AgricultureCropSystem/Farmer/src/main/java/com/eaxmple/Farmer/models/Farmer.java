package com.eaxmple.Farmer.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="farmer")
public class Farmer {
@Id
	String Farmid;
    String FarmName;
    String Farmno;
	public String getFarmid() {
		return Farmid;
	}
	public void setFarmid(String farmid) {
		Farmid = farmid;
	}
	public String getFarmName() {
		return FarmName;
	}
	public void setFarmName(String farmName) {
		FarmName = farmName;
	}
	public String getFarmno() {
		return Farmno;
	}
	public void setFarmno(String farmno) {
		Farmno = farmno;
	}
	@Override
	public String toString() {
		return "Farmer [Farmid=" + Farmid + ", FarmName=" + FarmName + ", Farmno=" + Farmno + "]";
	}

	
}
