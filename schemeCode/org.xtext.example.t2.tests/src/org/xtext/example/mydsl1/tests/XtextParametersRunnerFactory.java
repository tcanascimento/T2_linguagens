package org.xtext.example.mydsl1.tests;

import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.parameterized.ParametersRunnerFactory;
import org.junit.runners.parameterized.TestWithParameters;

/**
 * {@link} https://stackoverflow.com/questions/42420267/xtext-parameterized-xtext-runner
 */
public class XtextParametersRunnerFactory implements ParametersRunnerFactory {

	@Override
	public Runner createRunnerForTestWithParameters(TestWithParameters test) throws InitializationError {
		return new XtextRunnerWithParameters(test);
	}

}
