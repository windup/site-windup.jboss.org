MIGRATION_ISSUES_DETAILS[182016] = [
{description: "<p>The WebLogic <code>NonCatalogLogger<\/code> is not supported on JBoss EAP, and should be migrated to a supported logging framework, such as the JDK Logger or JBoss Logging:<\/p>\n<pre><code class=\"java\">import java.util.logging.Logger;\nLogger LOG = Logger.getLogger(&quot;MyLogger&quot;);\n<\/code><\/pre>", ruleID: "weblogic-11000", issueName: "WebLogic Logger Usage",
problemSummaryID: "182016", files: [
{l:"<a class='' href='LoginFilter_java.html'>com.acme.anvil.LoginFilter<\/a>", oc:"3"},
{l:"<a class='' href='AuthenticateFilter_java.html'>com.acme.anvil.AuthenticateFilter<\/a>", oc:"5"},
{l:"<a class='' href='ProductCatalogBean_java.html'>com.acme.anvil.service.ProductCatalogBean<\/a>", oc:"5"},
{l:"<a class='' href='AnvilWebStartupListener_java.html'>com.acme.anvil.listener.AnvilWebStartupListener<\/a>", oc:"6"},
], resourceLinks: [
{h:"https://docs.oracle.com/javase/7/docs/technotes/guides/logging/overview.html", t:"JDK Logging Documentation"},
{h:"http://www.jboss.org/quickstarts/eap/logging/", t:"JBoss Logging Quickstart"},
]},
];