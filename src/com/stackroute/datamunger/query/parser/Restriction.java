package com.stackroute.datamunger.query.parser;

/*
 * This class is used for storing name of field, condition and value for 
 * each conditions
 * generate getter and setter for this class,
 * Also override toString method
 * */

public class Restriction {
     private String nameOfField;
     private String valueOfCondition;
     private String condition;
	// Write logic for constructor
	public Restriction(String name, String value, String condition) {
         this.nameOfField = name;
         this.valueOfCondition = value;
         this.condition = condition;
	}
	public String getNameOfField() {
		return nameOfField;
	}
	public void setNameOfField(String nameOfField) {
		this.nameOfField = nameOfField;
	}
	public String getValueOfCondition() {
		return valueOfCondition;
	}
	public void setValueOfCondition(String valueOfCondition) {
		this.valueOfCondition = valueOfCondition;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	@Override
	public String toString() {
		return this.nameOfField + " " + this.valueOfCondition + " "
				+ this.condition;
	}
	
	

}