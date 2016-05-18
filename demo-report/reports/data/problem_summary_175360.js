MIGRATION_ISSUES_DETAILS[175360] = [
{description: "<p>WebLogic ApplicationLifecycleEvent must be replaced with standard Java EE ServletContextEvent. Otherwise, a custom solution using CDI\'s ApplicationScoped beans or EJB\'s @Startup beans is required in order to propagate a custom event object because ServletContextEvent types are not extendible in the standard Java EE programming model.<\/p><p>Use a <code>javax.servlet.ServletContextListener<\/code> with <code>@javax.annotation.servlet.WebListener<\/code>, or an EJB 3.1 <code>@javax.ejb.Startup<\/code> <code>@javax.ejb.Singleton<\/code> service bean.<\/p>", ruleID: "weblogic-webapp-05000", issueName: "WebLogic ApplicationLifecycleEvent",
problemSummaryID: "175360", files: [
{l:"<a class='' href='AnvilWebLifecycleListener_java.html'>com.acme.anvil.listener.AnvilWebLifecycleListener<\/a>", oc:"1"},
], resourceLinks: [
{h:"https://access.redhat.com/articles/1326703", t:"Migrate WebLogic ApplicationLifecycleEvent to standard EJB with JBoss EAP"},
{h:"http://docs.oracle.com/javaee/6/api/javax/servlet/ServletContextEvent.html", t:"Java EE ServletContextEvent JavaDoc"},
{h:"http://docs.oracle.com/cd/E13222_01/wls/docs90/programming/lifecycle.html", t:"WebLogic custom ApplicationLifecycleEvent Documentation"},
]},
];