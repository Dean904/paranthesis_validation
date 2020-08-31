package com.assessments.availity.paranthesis_validation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

import org.junit.Test;

public class ParanthesisValidatorTest {

	@Test
	public void arraysExtraClosing() throws FileNotFoundException, URISyntaxException {
		URL res = getClass().getClassLoader().getResource("rsc/arrays_extra_closing_paranthesis.lsp");
		File file = Paths.get(res.toURI()).toFile();

		assertFalse(ParanthesisValidator.validate(file));
	}

	@Test
	public void arraysExtraOpening() throws FileNotFoundException, URISyntaxException {
		URL res = getClass().getClassLoader().getResource("rsc/arrays_extra_opening_paranthesis.lsp");
		File file = Paths.get(res.toURI()).toFile();

		assertFalse(ParanthesisValidator.validate(file));
	}

	@Test
	public void arraysValidSyntax() throws FileNotFoundException, URISyntaxException {
		URL res = getClass().getClassLoader().getResource("rsc/arrays_proper_syntax.lsp");
		File file = Paths.get(res.toURI()).toFile();

		assertTrue(ParanthesisValidator.validate(file));
	}
	
	@Test
	public void averagesExtraClosing() throws FileNotFoundException, URISyntaxException {
		URL res = getClass().getClassLoader().getResource("rsc/average_extra_closing_paranthesis.lsp");
		File file = Paths.get(res.toURI()).toFile();

		assertFalse(ParanthesisValidator.validate(file));
	}

	@Test
	public void averageExtraOpening() throws FileNotFoundException, URISyntaxException {
		URL res = getClass().getClassLoader().getResource("rsc/average_extra_opening_paranthesis.lsp");
		File file = Paths.get(res.toURI()).toFile();

		assertFalse(ParanthesisValidator.validate(file));
	}

	@Test
	public void averagesValidSyntax() throws FileNotFoundException, URISyntaxException {
		URL res = getClass().getClassLoader().getResource("rsc/average_proper_syntax.lsp");
		File file = Paths.get(res.toURI()).toFile();

		assertTrue(ParanthesisValidator.validate(file));
	}
	

}
