package com.assignmentnine;

import com.assignmentnine.json.hi.test.TestHandler;
import com.assignmentnine.json.hi.test.TestRequest;

import org.bitbucket.bradleysmithllc.etlunit.feature.FeatureModule;
import org.bitbucket.bradleysmithllc.etlunit.feature.AbstractFeature;
import org.bitbucket.bradleysmithllc.etlunit.NullClassListener;
import org.bitbucket.bradleysmithllc.etlunit.TestAssertionFailure;
import org.bitbucket.bradleysmithllc.etlunit.TestExecutionError;
import org.bitbucket.bradleysmithllc.etlunit.TestWarning;
import org.bitbucket.bradleysmithllc.etlunit.parser.ETLTestOperation;
import org.bitbucket.bradleysmithllc.etlunit.parser.ETLTestValueObject;
import org.bitbucket.bradleysmithllc.etlunit.context.VariableContext;
import org.bitbucket.bradleysmithllc.etlunit.ExecutionContext;
import org.bitbucket.bradleysmithllc.etlunit.ClassListener;

import java.util.Arrays;
import java.util.List;

@FeatureModule
public class hiya extends AbstractFeature {
	private static final List<String> prerequisites = Arrays.asList("logging");

	@Override
	public List<String> getPrerequisites() {
		return prerequisites;
	}

	@Override
	public ClassListener getListener() {
		return new Listener();
	}
}

class Listener extends NullClassListener implements TestHandler  {
	public action_code test(TestRequest operation, ETLTestOperation op, ETLTestValueObject obj, VariableContext context, ExecutionContext econtext) throws TestAssertionFailure, TestExecutionError, TestWarning
	{
		String name = op.getOperationName();
		if (name.equals("test"))
		{
			return action_code.handled;
		}

		return action_code.defer;
	}
}
