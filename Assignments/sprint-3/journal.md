# Journal

As a first step, I tried the given Vagrantfile and observed the installation steps in the guest OS. After that, I had moved the instructions into a Puppet format.

I saw that Puppet is more flexible about running any giving command and it also provides a method to check and control before going to the next step. Definitely, Puppet is better for the cloud instance management. 

The following screenshot shows the output from the Puppet actions. Note that, the versions of node and npm are displayed at the end of the instructions to install. 

![Puppet output in console](https://i.imgur.com/eYKI8oG.png)

I learned how to use Puppet in an efficient way which gave me insights on how to manage multiple instances automatically.

*Note:* I committed first the given Vagrantfile and then I changed the instructions to Puppet in the following commit. Please check the repo history for the details.