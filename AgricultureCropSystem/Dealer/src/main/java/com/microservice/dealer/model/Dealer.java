package com.microservice.dealer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="dealer")
public class Dealer {
@Id
	String Dealid;
    String DealName;
    String Dealno;

public String getDealid() {
	return Dealid;
}

public void setDealid(String dealid) {
	Dealid = dealid;
}



public String getDealName() {
	return DealName;
}

public void setDealName(String dealName) {
	DealName = dealName;
}


public String getDealno() {
	return Dealno;
}

public void setDealno(String dealno) {
	Dealno = dealno;
}

@Override
public String toString() {
	return "Dealer [Dealid=" + Dealid + ", DealName=" + DealName + ", Dealno=" + Dealno + "]";
}


}



	

