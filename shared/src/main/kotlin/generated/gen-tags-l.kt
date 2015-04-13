package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class LABEL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("label", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade, PhrasingContent {
    var form : String
        get()  = attributeString_38b4cae2.get(this, "form")
        set(newValue) {attributeString_38b4cae2.set(this, "form", newValue)}

    var for_ : String
        get()  = attributeString_38b4cae2.get(this, "for")
        set(newValue) {attributeString_38b4cae2.set(this, "for", newValue)}


}

public class LEGEND(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("legend", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade, FlowContent, PhrasingContent {

}

public class LI(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("li", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade, FlowContent {
    var value : String
        get()  = attributeString_38b4cae2.get(this, "value")
        set(newValue) {attributeString_38b4cae2.set(this, "value", newValue)}


}

public class LINK(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("link", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var href : String
        get()  = attributeString_38b4cae2.get(this, "href")
        set(newValue) {attributeString_38b4cae2.set(this, "href", newValue)}

    var rel : String
        get()  = attributeString_83bc20a3.get(this, "rel")
        set(newValue) {attributeString_83bc20a3.set(this, "rel", newValue)}

    var media : String
        get()  = attributeString_d6b36c38.get(this, "media")
        set(newValue) {attributeString_d6b36c38.set(this, "media", newValue)}

    var type : String
        get()  = attributeString_4ebd8eee.get(this, "type")
        set(newValue) {attributeString_4ebd8eee.set(this, "type", newValue)}

    var sizes : String
        get()  = attributeString_38b4cae2.get(this, "sizes")
        set(newValue) {attributeString_38b4cae2.set(this, "sizes", newValue)}


}

