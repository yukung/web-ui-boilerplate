yieldUnescaped '<!DOCTYPE html>'
html {
  head {
    title "Site boilerplate $title"
    link href: '/assets/application.css', rel: 'stylesheet'
  }
  body {
    h1 'Boilerplate'
    p "This is a ${$a(href: 'https://www.google.co.jp/', 'Google')}."
    ul {
      3.times { i ->
        li "hoge$i"
      }
    }
    yieldUnescaped "<script src='/assets/application.js' type='text/javascript'></script>"
  }
}
