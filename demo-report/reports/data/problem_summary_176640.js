MIGRATION_ISSUES_DETAILS[176640] = [
{description: "<p>WebLogic ApplicationLifecycleListener must be replaced with standard Java EE ServletContextListener types. Otherwise, a solution using CDI\'s ApplicationScoped beans or EJB\'s @Startup beans is required.<\/p><p>Use a <code>javax.servlet.ServletContextListener<\/code> with <code>@javax.annotation.servlet.WebListener<\/code>, or an EJB 3.1 <code>@javax.ejb.Startup<\/code> <code>@javax.ejb.Singleton<\/code> service bean.<\/p>", ruleID: "weblogic-webapp-06000", issueName: "WebLogic ApplicationLifecycleListener",
problemSummaryID: "176640", files: [
{l:"<a class='' href='AnvilWebLifecycleListener_java.html'>com.acme.anvil.listener.AnvilWebLifecycleListener<\/a>", oc:"1"},
], resourceLinks: [
{h:"https://access.redhat.com/articles/1326703", t:"Migrate Oracle WebLogic Server ApplicationLifecycleListener Code to Red Hat JBoss EAP 6"},
{h:"http://docs.oracle.com/javaee/6/api/javax/servlet/ServletContextEvent.html", t:"Java EE ServletContextEvent JavaDoc"},
{h:"http://docs.oracle.com/cd/E13222_01/wls/docs90/programming/lifecycle.html", t:"WebLogic custom ApplicationLifecycleEvent Documentation"},
]},
];