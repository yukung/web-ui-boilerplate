yieldUnescaped '<!DOCTYPE html>'
html lang: 'ja', {
  head {
    title "$title"
    link href: '/assets/application.css', rel: 'stylesheet'
  }
  body {
    bodyContents()
    yieldUnescaped "<script src='/assets/application.js' type='text/javascript'></script>"
    // don't need browser extension
    yieldUnescaped "<script src='http://127.0.0.1:35729/livereload.js?snipver=1'></script>"
  }
}
