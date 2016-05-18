MIGRATION_ISSUES_DETAILS[209920] = [
{description: "<p>In JBoss EAP, the InitialContext should be instantiated with no arguments. Once an instance is constructed, look up the service using portable JNDI lookup syntax. Ensure also that in case system properties for InitialContext are provided, they do not need to be changed for the JBoss.<\/p>\n<pre><code class=\"java\">InitialContext context = new InitialContext();\nService service = (Service) context.lookup( &quot;java:app/service/&quot; + ServiceImpl.class.getSimpleName() );\n<\/code><\/pre>", ruleID: "environment-dependent-calls-03000", issueName: "Proprietary InitialContext initialization",
problemSummaryID: "209920", files: [
{l:"<a class='' href='LogEventPublisher_java.html'>com.acme.anvil.service.jms.LogEventPublisher<\/a>", oc:"1"},
{l:"<a class='' href='AnvilWebLifecycleListener_java.html'>com.acme.anvil.listener.AnvilWebLifecycleListener<\/a>", oc:"1"},
], resourceLinks: [
{h:"https://access.redhat.com/articles/1496973", t:"Migrate Applications From Other Platforms to Use Portable JNDI Syntax in Red Hat JBoss Enterprise Application Platform"},
]},
];