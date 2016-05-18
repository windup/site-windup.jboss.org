MIGRATION_ISSUES_DETAILS[204288] = [
{description: "<p>NonCatalogLogger is a logger for logging messages to the WebLogic log. This should be replaced with SLF4J, Log4J, or Java Logging.<\/p>", ruleID: "weblogic-services-03000", issueName: "Use of WebLogic specific logging classes",
problemSummaryID: "204288", files: [
{l:"<a class='' href='LoginFilter_java.html'>com.acme.anvil.LoginFilter<\/a>", oc:"2"},
{l:"<a class='' href='AuthenticateFilter_java.html'>com.acme.anvil.AuthenticateFilter<\/a>", oc:"2"},
{l:"<a class='' href='ProductCatalogBean_java.html'>com.acme.anvil.service.ProductCatalogBean<\/a>", oc:"2"},
{l:"<a class='' href='AnvilWebStartupListener_java.html'>com.acme.anvil.listener.AnvilWebStartupListener<\/a>", oc:"2"},
], resourceLinks: [
{h:"https://access.redhat.com/documentation/en-US/JBoss_Enterprise_Application_Platform/6.4/html/Migration_Guide/chap-Migrate_Your_Application.html#sect-Logging_Changes", t:"JBoss Logging Migration Information"},
]},
];