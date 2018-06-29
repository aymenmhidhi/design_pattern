package com.design.entity;

import com.design.service.Factory;
import com.design.service.FactoryI;

public class ClassB {

	FactoryI factory;
	ClassAI a;

	public ClassB(ClassAI a, FactoryI factoryI) {
		this.factory = factoryI;
		this.a = (ClassAI) factoryI.createInstance(a);

	}
public static void main (String[]args) {}
ClassA ab = new ClassA();
Factory Factoryb = new Factory();
ClassB b = new ClassB(ab, Factoryb);

}
