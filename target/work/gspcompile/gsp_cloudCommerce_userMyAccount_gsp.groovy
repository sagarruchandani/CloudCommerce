import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cloudCommerce_userMyAccount_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/user/MyAccount.gsp" }
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
invokeTag('captureHead','sitemesh',32,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(6)
if(true && (session?.user)) {
printHtmlPart(7)
expressionOut.print(session?.user.username)
printHtmlPart(8)
createClosureForHtmlPart(9, 3)
invokeTag('link','g',42,['controller':("user"),'action':("logout")],3)
printHtmlPart(10)
}
else {
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',45,['controller':("user"),'action':("login")],3)
printHtmlPart(11)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',46,['controller':("user"),'action':("register")],3)
printHtmlPart(14)
}
printHtmlPart(15)
createTagBody(2, {->
invokeTag('img','g',58,['dir':("images"),'file':("logo.jpg"),'width':("250px")],-1)
})
invokeTag('link','g',58,['controller':("user"),'action':("index")],2)
printHtmlPart(16)
createClosureForHtmlPart(17, 2)
invokeTag('link','g',62,['controller':("user"),'action':("index")],2)
printHtmlPart(18)
createClosureForHtmlPart(19, 2)
invokeTag('link','g',68,['controller':("Laptop"),'action':("showAll")],2)
printHtmlPart(20)
expressionOut.print(session?.user.counter)
printHtmlPart(21)
expressionOut.print(address.name)
printHtmlPart(22)
expressionOut.print(address.street)
printHtmlPart(23)
expressionOut.print(address.city)
printHtmlPart(24)
expressionOut.print(address.state)
printHtmlPart(25)
for( item in (previouscart) ) {
printHtmlPart(26)
invokeTag('img','g',116,['dir':("images/laptop"),'file':(item.Image),'width':("270"),'height':("200")],-1)
printHtmlPart(27)
createTagBody(3, {->
expressionOut.print(item.Title)
})
invokeTag('link','g',118,['class':("title"),'controller':("laptop"),'action':("details"),'id':(item.id)],3)
printHtmlPart(28)
expressionOut.print(item.Price)
printHtmlPart(29)
}
printHtmlPart(30)
})
invokeTag('captureBody','sitemesh',144,[:],1)
printHtmlPart(31)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1398468976922L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
