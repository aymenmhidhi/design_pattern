package com.design.service;

public class Factory implements FactoryI  {

	public Object createInstance(Object object) {
		try {
			if (object != null)

				object = Object.class.newInstance();
			return object;
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			return object;
		}
	}
}
