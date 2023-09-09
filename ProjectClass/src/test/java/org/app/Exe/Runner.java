package org.app.Exe;

import org.app.BaseClass.BaseClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.sample.BobCat;

@RunWith(Suite.class)
@SuiteClasses({BobCat.class ,BaseClass.class})
public class Runner {
	
}
