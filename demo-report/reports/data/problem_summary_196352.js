MIGRATION_ISSUES_DETAILS[196352] = [
{description: "<p><code>WLInitialContextFactory<\/code> is an implementation of <code>InitialContextFactory<\/code> used to get object instances from JNDI. The equivalent functionality needs to be configured on JBoss EAP 6.<\/p><p><code>InitialContextFactory<\/code> is provided by EAP and you only need to instantiate <code>InitialContext ctx = new InitialContext();<\/code>.<\/p>", ruleID: "weblogic-016000", issueName: "WebLogic Initial Context Configuration",
problemSummaryID: "196352", files: [
{l:"<a class='' href='LogEventPublisher_java.html'>com.acme.anvil.service.jms.LogEventPublisher<\/a>", oc:"1"},
{l:"<a class='' href='AnvilWebLifecycleListener_java.html'>com.acme.anvil.listener.AnvilWebLifecycleListener<\/a>", oc:"1"},
], resourceLinks: [
]},
];