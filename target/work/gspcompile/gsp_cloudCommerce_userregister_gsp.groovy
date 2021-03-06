import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cloudCommerce_userregister_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/register.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1, maximum-scale=1")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(3)
invokeTag('resource','g',13,['dir':("css"),'file':("style.css")],-1)
printHtmlPart(4)
invokeTag('resource','g',17,['dir':("css"),'file':("megamenu.css")],-1)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',23,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',33,['controller':("user"),'action':("register")],2)
printHtmlPart(8)
invokeTag('img','g',43,['dir':("images"),'file':("logo.jpg"),'width':("250px")],-1)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('textField','g',70,['type':("text"),'name':("username"),'class':("inputbox"),'size':("18"),'width':("15px"),'autocomplete':("off")],-1)
printHtmlPart(11)
invokeTag('passwordField','g',74,['name':("password"),'class':("inputbox"),'size':("18"),'autocomplete':("off")],-1)
printHtmlPart(12)
invokeTag('passwordField','g',78,['name':("confirm"),'class':("inputbox"),'size':("18"),'autocomplete':("off")],-1)
printHtmlPart(13)
invokeTag('textField','g',82,['type':("email"),'name':("email"),'class':("inputbox"),'size':("18"),'autocomplete':("off")],-1)
printHtmlPart(14)
invokeTag('submitButton','g',86,['value':("Sign Up Now!"),'name':("submitButton")],-1)
printHtmlPart(15)
})
invokeTag('form','g',89,['url':([controller:'user',action:'newUser'])],2)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',114,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1398320098905L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
