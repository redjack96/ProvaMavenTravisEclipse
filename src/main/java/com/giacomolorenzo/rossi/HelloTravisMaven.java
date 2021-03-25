package com.giacomolorenzo.rossi;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloTravisMaven {

	public static void main(String[] args) {
		Logger.getGlobal().log(Level.INFO, System.getProperty("java.runtime.version"));
		Logger.getGlobal().log(Level.INFO, "Prova");
	}

}
