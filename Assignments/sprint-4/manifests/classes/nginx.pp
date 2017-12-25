class nginx {
  package { 'nginx':
    ensure => installed,
    require => Exec['apt_update'],
  }	

  service { 'nginx':
    enable => true,
    ensure => running,
    require => Package['nginx'],
  }
}
