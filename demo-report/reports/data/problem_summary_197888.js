MIGRATION_ISSUES_DETAILS[197888] = [
{description: "<p><code>t3://<\/code> URLs are used to configure a JNDI InitialContext within WebLogic. The equivalent functionality needs to be configured on JBoss EAP 6.<\/p><p><code>InitialContextFactory<\/code> is provided by EAP and you only need to instantiate <code>InitialContext ctx = new InitialContext();<\/code>.<\/p>", ruleID: "weblogic-017000", issueName: "WebLogic Initial Context Configuration",
problemSummaryID: "197888", files: [
{l:"<a class='' href='AnvilWebStartupListener_java.html'>com.acme.anvil.listener.AnvilWebStartupListener<\/a>", oc:"1"},
{l:"<a class='' href='LogEventPublisher_java.html'>com.acme.anvil.service.jms.LogEventPublisher<\/a>", oc:"1"},
{l:"<a class='' href='AnvilWebLifecycleListener_java.html'>com.acme.anvil.listener.AnvilWebLifecycleListener<\/a>", oc:"1"},
], resourceLinks: [
]},
];