package com.hanselnpetal;

import org.junit.runner.RunWith;

import com.hanselnpetal.controller.ContactsManagementControllerIntegrationTest;
import com.hanselnpetal.data.repos.CustomerContactRepositoryIntegrationTest;
import com.hanselnpetal.service.ContactsManagementServiceIntegrationTest;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ContactsManagementServiceIntegrationTest.class,
        ContactsManagementControllerIntegrationTest.class,
        CustomerContactRepositoryIntegrationTest.class})
public class AddContactFeatureTestSuite {
 //Settings > Build,Execution,Deployment > Build Tools > Gradle > "Run tests using: IntelliJ Idea
    // intentionally empty - Test Suite Setup (annotations) is sufficient
}
