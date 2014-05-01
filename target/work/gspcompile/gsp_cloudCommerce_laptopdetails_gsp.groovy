import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cloudCommerce_laptopdetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/laptop/details.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',3,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',3,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1, maximum-scale=1")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=utf-8")],-1)
printHtmlPart(3)
invokeTag('resource','g',6,['dir':("css"),'file':("laptopShowAll.css")],-1)
printHtmlPart(4)
invokeTag('resource','g',7,['dir':("css"),'file':("styleDelete.css")],-1)
printHtmlPart(5)
})
invokeTag('captureHead','sitemesh',19,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('img','g',24,['dir':("images"),'file':("LaptopJunction.jpg")],-1)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',32,['controller':("user"),'action':("index")],2)
printHtmlPart(9)
if(true && (session?.user)) {
printHtmlPart(10)
createTagBody(3, {->
printHtmlPart(11)
expressionOut.print(session?.user.username)
})
invokeTag('link','g',39,['controller':("user"),'action':("index")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',40,['controller':("user"),'action':("logout")],3)
printHtmlPart(14)
}
else {
printHtmlPart(15)
createClosureForHtmlPart(16, 3)
invokeTag('link','g',43,['controller':("user"),'action':("login")],3)
printHtmlPart(15)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',44,['controller':("user"),'action':("register")],3)
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (session?.user)) {
printHtmlPart(10)
createTagBody(3, {->
printHtmlPart(20)
expressionOut.print(session?.user.counter)
printHtmlPart(21)
})
invokeTag('link','g',63,['controller':("user"),'action':("MyCart")],3)
printHtmlPart(14)
}
else {
printHtmlPart(22)
}
printHtmlPart(23)
for( item in (shared) ) {
printHtmlPart(24)
invokeTag('img','g',80,['dir':("images/laptop"),'file':(item.Image),'width':("200"),'height':("200")],-1)
printHtmlPart(25)
expressionOut.print(item.Title)
printHtmlPart(26)
expressionOut.print(item.Price)
printHtmlPart(27)
expressionOut.print(item.Description)
printHtmlPart(28)
createClosureForHtmlPart(29, 3)
invokeTag('link','g',82,['id':(item.id),'controller':("user"),'action':("addToCart")],3)
printHtmlPart(30)
}
printHtmlPart(31)
for( item in (custom) ) {
printHtmlPart(32)
expressionOut.print(item.RAM)
printHtmlPart(33)
expressionOut.print(item.Processor)
printHtmlPart(34)
expressionOut.print(item.HDD)
printHtmlPart(35)
expressionOut.print(item.Screen_Size)
printHtmlPart(36)
expressionOut.print(item.Battery_life)
printHtmlPart(37)
expressionOut.print(item.OS)
printHtmlPart(38)
}
printHtmlPart(39)
})
invokeTag('captureBody','sitemesh',97,[:],1)
printHtmlPart(40)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1398448600642L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
