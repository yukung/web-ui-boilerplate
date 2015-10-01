layout 'layout.gtpl',
  title: "$title",
  bodyContents: contents {
    h1 'Boilerplate'
    p "This is a ${$a(href: 'https://www.google.co.jp/', 'Google')}."
    ul {
      3.times { i ->
        li "hoge$i"
      }
    }
  }