package com.xworkz.boot;

import com.xworkz.app.NationalZoo;
import com.xworkz.app.StateZoo;
import com.xworkz.app.Zoo;

public class ZooUtil {
	public void run(Zoo zoo) {
		Zoo zoo2 = new Zoo();
		zoo2.getName();

		if (zoo instanceof StateZoo) {
			Zoo zoo3 = new StateZoo();
			zoo3.getName();

			StateZoo stateZoo = (StateZoo) zoo3;
			stateZoo.getStateName();
		}

		if (zoo instanceof NationalZoo) {
			Zoo zoo4 = new NationalZoo();
			zoo4.getName();

			NationalZoo nationalZoo = new NationalZoo();
			nationalZoo.getNationalName();
		}

	}
}