mockup-boilerplate-jvm
======================

This is the template which create a mock of the Web application only using JVM language tool chain. RubyGems and bundler, npm and Grunt/gulp, bower, etc... are not required.

It's using the technology stack below.

* [Groovy Markup Template](http://www.groovy-lang.org/templating.html) (Besides, it can also be used [handlebars](https://github.com/jknack/handlebars.java), [thymeleaf](http://www.thymeleaf.org/))
* [Sass](http://sass-lang.com/) (also you can use [Less](http://less-ja.studiomohawk.com/))
* [CoffeeScript](http://coffeescript.org/)
* [WebJars](http://www.webjars.org/) (you can add other assets/library you need also)
    * jQuery
    * lodash
    * Bootstrap Sass
* [Ratpack](http://ratpack.io/)
* [Gradle](https://gradle.org/) (by using the continuous build of Gradle v2.5 later, and the file changes watching.)
    * [Asset Pipeline Core](https://github.com/bertramdev/asset-pipeline-core/)
    * [Ratpack Asset Pipeline](https://github.com/bertramdev/ratpack-asset-pipeline)
* [livereload-jvm](https://github.com/davidB/livereload-jvm) (you can auto reload the browser)
    * [ Gradle LiveReload Plugin](https://github.com/aalmiray/livereload-gradle-plugin)
* [gaffer](https://github.com/jingweno/gaffer) ([Foreman](https://github.com/ddollar/foreman) on JVM, you can Procfile-based process management)

Requirement
-----------

* only Java8

Usage
-----

```shell-session
$ git clone https://github.com/yukung/mockup-boilerplate-jvm.git
$ cd mockup-boilerplate-jvm/lib/gaffer-0.0.1
$ bin/gaffer start -f ../../Procfile
```

![](https://gist.githubusercontent.com/yukung/c46fe24515fa5bc0e210/raw/d3f3b68d85de0f1f33e5b36c7396b3d78c6ebd7a/console.gif)

Demo
----

![](https://gist.githubusercontent.com/yukung/c46fe24515fa5bc0e210/raw/330c6b4d8743021a0f68710223b6e98064b63c62/livereload.gif)

When you want to use other JS libraries or assets?
-----------

Looking for you want to use library from [webjars](http://www.webjars.org/), please add to the dependency of build.gradle.

```gradle
dependencies {
    compile 'org.webjars.npm:angular:1.4.7'
}
```

And append the directive in order to build in the asset pipeline. File path describes the path that starts from `webjars/`.

### JavaScript

#### assets/javascripts/application.coffee

```coffeescript
#= require webjars/angular/1.4.7/angular
#= require_self
#= require_tree .
```

### CSS

#### assets/stylesheets/application.sass

Combine the file using the `@import` notation in the case of Sass.

```sass
@import "webjars/bootstrap-sass/3.3.1/stylesheets/bootstrap"
```

#### assets/stylesheets/application.css

In the case of naked CSS, it is as a normal asset pipeline may be describing the directive in the comments.

```css
/*
*= require "webjars/bootstrap/3.3.1/css/bootstrap"
*= require_self
*= require_tree .
*/
```
