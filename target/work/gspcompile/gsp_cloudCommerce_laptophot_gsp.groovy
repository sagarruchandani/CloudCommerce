import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cloudCommerce_laptophot_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/laptop/hot.gsp" }
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
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
invokeTag('img','g',15,['dir':("images"),'file':("LaptopJunction.jpg")],-1)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',23,['controller':("user"),'action':("index")],2)
printHtmlPart(10)
if(true && (session?.user)) {
printHtmlPart(11)
createTagBody(3, {->
printHtmlPart(12)
expressionOut.print(session?.user.username)
})
invokeTag('link','g',30,['controller':("user"),'action':("index")],3)
printHtmlPart(13)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',31,['controller':("user"),'action':("logout")],3)
printHtmlPart(15)
}
else {
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',34,['controller':("user"),'action':("login")],3)
printHtmlPart(16)
createClosureForHtmlPart(18, 3)
invokeTag('link','g',35,['controller':("user"),'action':("register")],3)
printHtmlPart(19)
}
printHtmlPart(20)
if(true && (session?.user)) {
printHtmlPart(11)
createTagBody(3, {->
printHtmlPart(21)
expressionOut.print(session?.user.counter)
printHtmlPart(22)
})
invokeTag('link','g',54,['controller':("user"),'action':("MyCart")],3)
printHtmlPart(15)
}
else {
printHtmlPart(23)
}
printHtmlPart(24)
createClosureForHtmlPart(25, 2)
invokeTag('link','g',72,['controller':("laptop"),'action':("showAll")],2)
printHtmlPart(26)
createClosureForHtmlPart(27, 2)
invokeTag('link','g',74,['controller':("laptop"),'action':("trend")],2)
printHtmlPart(28)
for( item in (laptops) ) {
printHtmlPart(29)
createTagBody(3, {->
printHtmlPart(30)
createTagBody(4, {->
printHtmlPart(31)
invokeTag('img','g',87,['dir':("images/laptop"),'file':(item.Image),'width':("270"),'height':("200")],-1)
printHtmlPart(32)
expressionOut.print(item.prod_type)
printHtmlPart(33)
createTagBody(5, {->
expressionOut.print(item.Title)
})
invokeTag('link','g',92,['class':("title"),'controller':("laptop"),'action':("details"),'id':(item.id)],5)
printHtmlPart(34)
expressionOut.print(item.Price)
printHtmlPart(35)
createClosureForHtmlPart(36, 5)
invokeTag('link','g',97,['controller':("user"),'format':(item.Price),'action':("addToCart"),'id':(item.id)],5)
printHtmlPart(37)
})
invokeTag('link','g',102,['controller':("laptop"),'action':("details"),'id':(item.id)],4)
printHtmlPart(38)
})
invokeTag('form','g',103,['url':([controller:'user',action:'addToCart'])],3)
printHtmlPart(39)
}
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',107,[:],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1398753091329L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
