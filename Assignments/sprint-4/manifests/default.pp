class apt-update {
  exec { 'apt-update':
    command => '/usr/bin/apt-get update'
  }
}

class mysql-server {
  package { 'mysql-server':
    ensure => installed,
    require => Exec['apt-update'],
  }	

  service { 'mysql':
    enable => true,
    ensure => running,
    require => Package['mysql-server'],
  }

  exec { 'mysqladmin':
    command => '/usr/bin/mysqladmin -u root password CloudDB',
    require => Package['mysql-server'],
  }
}

class nginx {
  package { 'nginx':
    ensure => installed,
    require => Exec['apt-update'],
  }	

  service { 'nginx':
    enable => true,
    ensure => running,
    require => Package['nginx'],
  }
}

class nodejs {
  package { 'curl':
    ensure => installed,
    require => Exec['apt-update'],
  }	

  package { 'git':
    ensure => installed,
    require => Exec['apt-update'],
  }	

  exec { 'update-node-resource':
    command => '/usr/bin/curl -sL https://deb.nodesource.com/setup_4.x | /usr/bin/sudo -E bash -',
    path => '/vagrant/',
    require => [ Package['curl'], Package['git'] ],
  }

  package { "build-essential":
    ensure => installed,
    require => Exec['apt-update'],
  }
 
  package { "nodejs":
    ensure => installed,
    require => Exec['update-node-resource'],
  }
 
  exec { "checkversion" :
    command => "/usr/bin/node --version && /usr/bin/npm --version",
    require => Package['nodejs'],
    logoutput => true,
  }
}

node 'appserver' {
  include apt-update
  include nodejs
}

node 'dbserver' {
  include apt-update
  include mysql-server
}

node 'web' {
  include apt-update
  include nginx
}

node /^tst\d+/ {
  include apt-update
}

node 'default' {
}
