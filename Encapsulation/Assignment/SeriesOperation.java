package com.xowkz.oops.Encapsulation.Assignment;

public class SeriesOperation {
	
	Series details[]=new Series[5];
	
	void add(int index,Series detail) {
		System.out.println("Add Details");
		if(index<=details.length) {
			details[index]=detail;
			System.out.println(details[index].name+""+details[index].type+""+details[index].ottPlatform+""+details[index].hero);
		}else {
			System.out.println("index is invalid");
		}
	}
		void printAll() {
			for(int index=0;index<details.length;index++) {
				if(details[index]!=null) {
			System.out.println(details[index].name+""+details[index].type+""+details[index].ottPlatform+""+details[index].hero);
				}
			}
			
		}
		void upadateNameByHero(String heros,String names) {
			for (int index=0;index<details.length;index++) {
				if(details[index]!=null) {
				if(names.equals(details[index].name)) {
					details[index].hero=heros;
					
					}
			}
			
		}
	
		}
			 
	}

