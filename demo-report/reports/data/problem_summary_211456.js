MIGRATION_ISSUES_DETAILS[211456] = [
{description: "<p>After migration, some of the JMX beans provided by the previous server may not be present anymore. Ensure that the <code>javax.management.ObjectName<\/code> does not need to change for JBoss.<\/p>", ruleID: "environment-dependent-calls-04000", issueName: "Reference to javax.management.ObjectName",
problemSummaryID: "211456", files: [
{l:"<a class='' href='AnvilWebStartupListener_java.html'>com.acme.anvil.listener.AnvilWebStartupListener<\/a>", oc:"1"},
{l:"<a class='' href='AnvilWebLifecycleListener_java.html'>com.acme.anvil.listener.AnvilWebLifecycleListener<\/a>", oc:"2"},
], resourceLinks: [
]},
];