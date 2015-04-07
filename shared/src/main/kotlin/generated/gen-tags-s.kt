package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class SAMP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("samp", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class SCRIPT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("script", consumer, initialAttributes), CoreAttributeGroupFacade {
    var charset : String
        get()  = attributeStringf30f39f0.get(this, "charset")
        set(newValue) {attributeStringf30f39f0.set(this, "charset", newValue)}

    var type : String
        get()  = attributeStringf30f39f0.get(this, "type")
        set(newValue) {attributeStringf30f39f0.set(this, "type", newValue)}

    var src : String
        get()  = attributeStringf30f39f0.get(this, "src")
        set(newValue) {attributeStringf30f39f0.set(this, "src", newValue)}

    var defer : Boolean
        get()  = attributeBooleanDeferEmpty2bd04b87.get(this, "defer")
        set(newValue) {attributeBooleanDeferEmpty2bd04b87.set(this, "defer", newValue)}

    var async : Boolean
        get()  = attributeBooleanAsyncEmpty277fcdbd.get(this, "async")
        set(newValue) {attributeBooleanAsyncEmpty277fcdbd.set(this, "async", newValue)}


}

public class SECTION(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("section", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class SELECT(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("select", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var autoFocus : Boolean
        get()  = attributeBooleanAutoFocusEmpty84bc6550.get(this, "autofocus")
        set(newValue) {attributeBooleanAutoFocusEmpty84bc6550.set(this, "autofocus", newValue)}

    var disabled : Boolean
        get()  = attributeBooleanDisabledEmpty700d95bd.get(this, "disabled")
        set(newValue) {attributeBooleanDisabledEmpty700d95bd.set(this, "disabled", newValue)}

    var size : String
        get()  = attributeStringf30f39f0.get(this, "size")
        set(newValue) {attributeStringf30f39f0.set(this, "size", newValue)}

    var multiple : Boolean
        get()  = attributeBooleanMultipleEmpty33889ca9.get(this, "multiple")
        set(newValue) {attributeBooleanMultipleEmpty33889ca9.set(this, "multiple", newValue)}

    var form : String
        get()  = attributeStringf30f39f0.get(this, "form")
        set(newValue) {attributeStringf30f39f0.set(this, "form", newValue)}

    var name : String
        get()  = attributeStringf30f39f0.get(this, "name")
        set(newValue) {attributeStringf30f39f0.set(this, "name", newValue)}


}

public class SMALL(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("small", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class SOURCE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("source", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var src : String
        get()  = attributeStringf30f39f0.get(this, "src")
        set(newValue) {attributeStringf30f39f0.set(this, "src", newValue)}

    var media : String
        get()  = attributeStringf30f39f0.get(this, "media")
        set(newValue) {attributeStringf30f39f0.set(this, "media", newValue)}

    var type : String
        get()  = attributeStringf30f39f0.get(this, "type")
        set(newValue) {attributeStringf30f39f0.set(this, "type", newValue)}


}

public class SPAN(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("span", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class STRONG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("strong", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class STYLE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("style", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var scoped : Boolean
        get()  = attributeBooleanScopedEmptyee198629.get(this, "scoped")
        set(newValue) {attributeBooleanScopedEmptyee198629.set(this, "scoped", newValue)}

    var media : String
        get()  = attributeStringf30f39f0.get(this, "media")
        set(newValue) {attributeStringf30f39f0.set(this, "media", newValue)}

    var type : String
        get()  = attributeStringf30f39f0.get(this, "type")
        set(newValue) {attributeStringf30f39f0.set(this, "type", newValue)}


}

public class SUB(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("sub", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class SUP(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("sup", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class SVG(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("svg", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}
