---
    interpolate: true
---

/*
 * Set up namespace and static vars
 */

var app = window.app = {};
/* 
 Website Cache
 */
app.cache = {};

/*
 JS templates
 */
app.templates = {};
app.templates.buzzTemplate = '#{partial "buzz_template.html.slim"}';


/* 
 DCP setup
 */

app.dcp = {};
app.dcp.url = {};
app.dcp.url.search = '#{site.dcp_base_protocol_relative_url}v1/rest/search';
app.dcp.error_message = "<div class='dcp-error-message'>It appears we're unable to access this data right now. Look at <a href='http://twitter.com/jbossorg' target=_blank>@jbossorg</a> to see if there is scheduled maintenance, or try again shortly.</div>";



