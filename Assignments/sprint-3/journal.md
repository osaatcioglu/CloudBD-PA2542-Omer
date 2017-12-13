# Journal

As a first step, I tried the given Vagrantfile and observed the installation steps in the guest OS. After that, I had moved the instructions into a Puppet format.

I saw that Puppet is more flexible about running any giving command and it also provides a method to check and control before going to the next step. Definitely, Puppet is better for the cloud instance management. 

The following screenshot shows the output from the Puppet actions. Note that, the versions of node and npm are displayed at the end of the instructions to install. 

![Puppet output in console](https://i.imgur.com/eYKI8oG.png)

Puppet is a powerful tool that helps to install, run and check the applications in the virtual machine. Before learning Puppet, I had to do all the installations manually. Or even I used Vagrant shell script to install, I would need to check if everything is running as expected by myself. 

*Note:* I committed first the given Vagrantfile and then I changed the instructions to Puppet in the following commit. Please check the repo history for the details.