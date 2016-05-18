MIGRATION_ISSUES_DETAILS[208896] = [
{description: "<p>This method lookups an object using a JNDI String. During the migration process, some entity JNDI bindings may change. Ensure that the JNDI Name does not need to change for JBoss<\/p><p><em>For Example:<\/em><\/p>\n<pre><code class=\"java\">(ConnectionFactory)initialContext.lookup(&quot;weblogic.jms.ConnectionFactory&quot;);\n<\/code><\/pre><p><em>should become:<\/em><\/p>\n<pre><code class=\"java\">(ConnectionFactory)initialContext.lookup(&quot;/ConnectionFactory&quot;);\n<\/code><\/pre>", ruleID: "environment-dependent-calls-02000", issueName: "Call of JNDI lookup",
problemSummaryID: "208896", files: [
{l:"<a class='' href='AnvilWebServlet_java.html'>com.acme.anvil.AnvilWebServlet<\/a>", oc:"1"},
{l:"<a class='' href='AnvilWebStartupListener_java.html'>com.acme.anvil.listener.AnvilWebStartupListener<\/a>", oc:"1"},
{l:"<a class='' href='LogEventPublisher_java.html'>com.acme.anvil.service.jms.LogEventPublisher<\/a>", oc:"2"},
{l:"<a class='' href='AnvilWebLifecycleListener_java.html'>com.acme.anvil.listener.AnvilWebLifecycleListener<\/a>", oc:"1"},
], resourceLinks: [
{h:"https://docs.jboss.org/author/display/AS71/JNDI+Reference", t:"JBoss JNDI Reference"},
]},
];