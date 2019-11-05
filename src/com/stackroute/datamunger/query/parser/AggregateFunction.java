package com.stackroute.datamunger.query.parser;

/* This class is used for storing name of field, aggregate function for 
 * each aggregate function
 * generate getter and setter for this class,
 * Also override toString method
 * */

public class AggregateFunction {
     private String nameOfField;
     private String aggregateFunction;
     
	// Write logic for constructor
	public AggregateFunction(String field, String function) {
            this.nameOfField = field;
            this.aggregateFunction = function;
	}

	public String getNameOfField() {
		return nameOfField;
	}

	public void setNameOfField(String nameOfField) {
		this.nameOfField = nameOfField;
	}

	public String getAggregateFunction() {
		return aggregateFunction;
	}

	public void setAggregateFunction(String aggregateFunction) {
		this.aggregateFunction = aggregateFunction;
	}

	@Override
	public String toString() {
		return this.nameOfField +""+ this.aggregateFunction;
	}

	
	

}