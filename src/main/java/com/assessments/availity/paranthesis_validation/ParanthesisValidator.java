package com.assessments.availity.paranthesis_validation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParanthesisValidator {

	private static final Logger log = LoggerFactory.getLogger(ParanthesisValidator.class);

	private ParanthesisValidator() {}

	public static boolean validate(File file) throws FileNotFoundException {
		Stack<String> stack = new Stack<>();
		Scanner sc = new Scanner(file);

		try {
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				log.debug(line);

				for (int i = 0; i < line.length(); i++) {
					if (line.charAt(i) == '(') {
						stack.push("0"); // anything can be stored in the stack
					} else if (line.charAt(i) == ')') {
						stack.pop();
					}
				}
			}
		} catch (EmptyStackException e) {
			log.info("Too many closing paranthesis!");
			return false;
		} finally {
			sc.close();
		}

		return stack.empty();
	}

}
