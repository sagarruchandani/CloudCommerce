import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cloudCommerceindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
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
})
invokeTag('captureHead','sitemesh',28,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
if(true && (session?.user)) {
printHtmlPart(5)
expressionOut.print(session?.user.username)
printHtmlPart(6)
createClosureForHtmlPart(7, 3)
invokeTag('link','g',43,['controller':("user"),'action':("logout")],3)
printHtmlPart(8)
}
else {
printHtmlPart(9)
createClosureForHtmlPart(10, 3)
invokeTag('link','g',46,['controller':("user"),'action':("login")],3)
printHtmlPart(9)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',47,['controller':("user"),'action':("register")],3)
printHtmlPart(12)
}
printHtmlPart(13)
createTagBody(2, {->
invokeTag('img','g',58,['dir':("images"),'file':("logo.jpg"),'width':("250px")],-1)
})
invokeTag('link','g',58,['controller':("user"),'action':("index")],2)
printHtmlPart(14)
createClosureForHtmlPart(15, 2)
invokeTag('link','g',62,['controller':("user"),'action':("index")],2)
printHtmlPart(16)
createClosureForHtmlPart(17, 2)
invokeTag('link','g',67,['controller':("Shoes"),'action':("showAllShoes")],2)
printHtmlPart(18)
createClosureForHtmlPart(19, 2)
invokeTag('link','g',68,['controller':("Laptop"),'action':("showAll")],2)
printHtmlPart(20)
if(true && (session?.user)) {
printHtmlPart(21)
createTagBody(3, {->
printHtmlPart(22)
expressionOut.print(session?.user.counter)
printHtmlPart(23)
})
invokeTag('link','g',88,['controller':("user"),'action':("MyCart")],3)
printHtmlPart(21)
}
else {
printHtmlPart(24)
}
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',179,[:],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1398447080520L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
