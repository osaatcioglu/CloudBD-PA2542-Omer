import 'classes/*.pp'

node 'appserver' {
  include apt_update
  include nodejs
}

node 'dbserver' {
  include apt_update
  include mysql_server
}

node 'web' {
  include apt_update
  include nginx
}

node /^tst\d+/ {
  include apt_update
}

node 'default' {
}
