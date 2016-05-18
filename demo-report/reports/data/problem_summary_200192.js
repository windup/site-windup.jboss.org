MIGRATION_ISSUES_DETAILS[200192] = [
{description: "<p>T3ServicesDef provides access to core services of the container, such as Timers and Logging facilities.<\/p><p>Replace the services provided by this with a Singleton EJB (using the @Singleton annotation) that provides access to the equivalent services from JBoss EAP.<\/p>", ruleID: "weblogic-services-02000", issueName: "Use of T3ServicesDef",
problemSummaryID: "200192", files: [
{l:"<a class='' href='AnvilWebStartupListener_java.html'>com.acme.anvil.listener.AnvilWebStartupListener<\/a>", oc:"3"},
], resourceLinks: [
{h:"http://docs.oracle.com/javaee/6/tutorial/doc/gipvi.html", t:"Java EE Tutorial - @Singleton Session Bean"},
]},
];