
import kotlinx.browser.document
import kotlinx.html.Entities
import kotlinx.html.a
import kotlinx.html.classes
import kotlinx.html.consumers.trace
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.dom.create
import kotlinx.html.dom.prepend
import kotlinx.html.id
import kotlinx.html.js.col
import kotlinx.html.js.colGroup
import kotlinx.html.js.div
import kotlinx.html.js.form
import kotlinx.html.js.h1
import kotlinx.html.js.onClickFunction
import kotlinx.html.js.onSubmitFunction
import kotlinx.html.js.p
import kotlinx.html.js.span
import kotlinx.html.js.svg
import kotlinx.html.js.td
import kotlinx.html.js.th
import kotlinx.html.li
import kotlinx.html.p
import kotlinx.html.span
import kotlinx.html.ul
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLFormElement
import org.w3c.dom.asList
import org.w3c.dom.get
import org.w3c.dom.svg.SVGElement
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.fail
import kotlin.test.Test as test

class DomTreeImplTest {
    @test fun simpleTree() {
        val node = document.body!!.append.div {
            p {
                +"test"
            }
        }

        assertEquals("DIV", node.tagName)
        assertEquals(1, node.childNodes.length)
        assertEquals("P", node.children[0]?.tagName)

        assertTrue(document.body!!.children.length > 0)
        assertEquals(node, document.body!!.children.asList().last())
    }

    @test fun appendSingleNode() {
        val myDiv: HTMLDivElement = document.body!!.append.div {
            p {
                +"test"
            }
        }

        assertEquals("DIV", myDiv.tagName)
        assertEquals(document.body, myDiv.parentNode)
        assertEquals("<div><p>test</p></div>", myDiv.outerHTML.replace("\\s+".toRegex(), ""))
    }

    @test fun appendNodeWithEventHandler() {
    	var clicked = false
    	
        document.body!!.append.div {
            id = "clickable"
            onClickFunction = {
				clicked = true
            }
        }
        document.create.div("a b c ") {
            a("http://kotlinlang.org") { +"official Kotlin site" }
        }
        document.getElementsByTagName("div").asList().forEach {
        	if (it is HTMLElement) {
                it.click()
        	}
        }
        
        assertTrue(clicked)
    }

    @test fun testAtMainPage() {
        document.body!!.append.div {
            id = "container"
        }

        val myDiv = document.create.div("panel") {
            p {
                +"Here is "
                a("http://kotlinlang.org") { +"official Kotlin site" }
            }
        }

        val container = document.getElementById("container")
        if (container == null) {
            fail("container not found")
        }

        container.appendChild(myDiv)

        assertEquals("<div class=\"panel\"><p>Here is <a href=\"http://kotlinlang.org\">official Kotlin site</a></p></div>", container.innerHTML)
    }

    @test fun appendMultipleNodes() {
        val wrapper = wrapper()

        val nodes = wrapper.append {
            div {
                +"div1"
            }
            div {
                +"div2"
            }
        }

        assertEquals(2, nodes.size)
        nodes.forEach {
            assertTrue(it in wrapper.children.asList())
        }

        assertEquals("<div>div1</div><div>div2</div>", wrapper.innerHTML)
    }

    @test fun appendEntity() {
        val wrapper = wrapper()
        wrapper.append.span {
            +Entities.nbsp
        }

        assertEquals("<span>&nbsp;</span>", wrapper.innerHTML)
    }

    @test fun pastTagAttributeChangedShouldBeProhibited() {
        try {
            document.body!!.append.trace().div {
                p {
                    span {
                        this@div.id = "d1"
                    }
                }
            }

            fail("We shouldn't be able to modify attribute for outer tag")
        } catch (expected: Throwable) {
            assertTrue(true)
        }
    }

    @test fun buildBiggerPage() {
        val wrapper = wrapper()

        wrapper.append {
            h1 {
                +"kotlin"
            }
            p {
                +"Here we are"
            }
            div {
                classes = setOf("root")

                div {
                    classes = setOf("menu")

                    ul {
                        li { +"item1" }
                        li { +"item2" }
                        li { +"item3" }
                    }
                }
                div {
                    classes = setOf("content")
                }
            }
        }

        assertEquals("""
                <h1>kotlin</h1>
                <p>Here we are</p>
                <div class="root">
                <div class="menu">
                <ul>
                <li>item1</li>
                <li>item2</li>
                <li>item3</li>
                </ul>
                </div>
                <div class="content"></div>
                </div>""".trimLines(), wrapper.innerHTML)
    }

    @test fun testAppendAndRemoveClass() {
        val wrapper = wrapper()

        wrapper.append {
            span("class1") {
                classes += "class2"
                classes -= "class1"
            }
        }

        assertEquals("<span class=\"class2\"></span>", wrapper.innerHTML)
    }

    @test fun testSvg() {
        val wrapper = wrapper()

        wrapper.append.svg {
        }

        val nodes = wrapper.childNodes.asList()

        val svg = nodes.map { it as SVGElement }.first()

        assertEquals("http://www.w3.org/2000/svg", svg.namespaceURI)
    }

    @test fun assignEvent() {
        val wrapper = wrapper()
        var invoked = false

        wrapper.append {
            form {
                id = "my-form"
                onSubmitFunction = { _ ->
                    invoked = true
                }
            }
        }

        val event = document.createEvent("Event")
        event.initEvent("submit", true, true)

        println("Got event $event")

        (wrapper.getElementsByTagName("form").asList().first { it.id == "my-form" } as HTMLFormElement).dispatchEvent(event)

        assertTrue { invoked }
    }

    @test fun testTdThColColGroupCreation() {
        val td = document.create.td()
        val th = document.create.th()
        val col = document.create.col()
        val colGroup = document.create.colGroup()

        assertEquals("TH", th.tagName.uppercase())
        assertEquals("TD", td.tagName.uppercase())
        assertEquals("COL", col.tagName.uppercase())
        assertEquals("COLGROUP", colGroup.tagName.uppercase())
    }

    @test fun testPrepend() {
        val wrapper = wrapper()
        wrapper.appendChild(document.createElement("A").apply { textContent = "aaa" })

        wrapper.prepend {
            p {
                text("OK")
            }
        }

        assertEquals("<p>OK</p><a>aaa</a>", wrapper.innerHTML)
    }

    @test fun testComment() {
        val wrapper = wrapper()
        wrapper.append.div {
            comment("commented")
        }

        assertEquals("<div><!--commented--></div>", wrapper.innerHTML)
    }

    private fun wrapper() = document.body!!.append.div {}
    @Suppress("UNCHECKED_CAST")
    private fun <T> uninitialized(): T = null as T
    private fun String.trimLines() = trimIndent().lines().filter { it.isNotBlank() }.joinToString("")
}
