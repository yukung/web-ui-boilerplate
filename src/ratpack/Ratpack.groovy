import asset.pipeline.ratpack.AssetPipelineModule
import ratpack.groovy.template.MarkupTemplateModule

import static ratpack.groovy.Groovy.groovyMarkupTemplate
import static ratpack.groovy.Groovy.ratpack

ratpack {
    bindings {
        module MarkupTemplateModule
        module AssetPipelineModule
    }

    handlers {
        get {
            render groovyMarkupTemplate("index.gtpl", title: "My Boilerplate")
        }

        files { dir "public" }
    }
}
