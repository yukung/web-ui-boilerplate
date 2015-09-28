import asset.pipeline.ratpack.AssetPipelineModule

import static ratpack.groovy.Groovy.ratpack

ratpack {
    bindings {
        module AssetPipelineModule
    }

    handlers {
    }
}
