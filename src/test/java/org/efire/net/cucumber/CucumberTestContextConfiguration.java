package org.efire.net.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.efire.net.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
