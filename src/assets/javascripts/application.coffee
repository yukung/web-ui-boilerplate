#= require webjars/jquery/2.1.4/jquery
#= require webjars/lodash/3.10.1/lodash
#= require webjars/bootstrap-sass/3.3.1/javascripts/bootstrap
#= require_self
#= require_tree .

console.log "Loading Custom Javascript..."

timer = () ->
    snippet = "Timer Triggered"
    console.log snippet
    arr = [5, 10, 15]
    _.each arr,(element, index, arr) ->
      console.log element + ' : ' + index

setInterval timer, 1000