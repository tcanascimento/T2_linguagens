package org.xtext.example.mydsl1.tests;

import com.google.inject.Injector;

import org.eclipse.xtext.junit4.internal.InjectorProviders;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.eclipse.xtext.testing.IRegistryConfigurator;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParameters;
import org.junit.runners.parameterized.TestWithParameters;

/**
 * {@link} https://stackoverflow.com/questions/42420267/xtext-parameterized-xtext-runner
 */
public class XtextRunnerWithParameters extends BlockJUnit4ClassRunnerWithParameters {

	public XtextRunnerWithParameters(TestWithParameters test) throws InitializationError {
		super(test);
	}
	
	@Override
    public Object createTest() throws Exception {
        Object object = super.createTest();
        IInjectorProvider injectorProvider = getOrCreateInjectorProvider();
        if (injectorProvider != null) {
            Injector injector = injectorProvider.getInjector();
            if (injector != null)
                injector.injectMembers(object);
        }
        return object;
    }

    @Override
    protected Statement methodBlock(FrameworkMethod method) {
        IInjectorProvider injectorProvider = getOrCreateInjectorProvider();
        if (injectorProvider instanceof IRegistryConfigurator) {
            final IRegistryConfigurator registryConfigurator = (IRegistryConfigurator) injectorProvider;
            registryConfigurator.setupRegistry();
            final Statement methodBlock = superMethodBlock(method);
            return new Statement() {
                @Override
                public void evaluate() throws Throwable {
                    try {
                        methodBlock.evaluate();
                    } finally {
                        registryConfigurator.restoreRegistry();
                    }
                }
            };
        }else{
            return superMethodBlock(method);
        }
    }

    protected Statement superMethodBlock(FrameworkMethod method) {
        return super.methodBlock(method);
    }

    protected IInjectorProvider getOrCreateInjectorProvider() {
        return InjectorProviders.getOrCreateInjectorProvider(getTestClass());
    }

    protected IInjectorProvider getInjectorProvider() {
        return InjectorProviders.getInjectorProvider(getTestClass());
    }

    protected IInjectorProvider createInjectorProvider() {
        return InjectorProviders.createInjectorProvider(getTestClass());
    }

	@Override
	public Description getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run(RunNotifier notifier) {
		// TODO Auto-generated method stub

	}

}
