package com.conauto.test;

public class FormulaImpl implements Formula {

	@Override
	public double calculate(int a) {
		return sqrt(a * 100);
	}

}
