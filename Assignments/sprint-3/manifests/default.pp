class nodejs {
 
	exec { 'apt-update':
		command => '/usr/bin/apt-get update'
	}

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
include nodejs