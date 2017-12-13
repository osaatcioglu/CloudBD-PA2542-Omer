# Journal

To be able to have more advanced configuration in Vagrantfile, I needed to learn the basics of the Ruby language. It was quite easy to configure once I learned Ruby. I created a function to create the desired virtual machine and then I used it in all of my instance creation. 

I learned how to manage different installation instructions for different nodes by using the Puppets class definition. Moreover; I could reuse Puppet class as a base for another class. I also saw that I could, actually, inherit classes according to my research. But, I like to do it more like sequential so that it will be easier to follow the instructions. 

Without Vagrant and Puppet, I would do all the tedious work by hand in all virtual machines and then I would hope that I wouldn't need to set it up again. I would also take a copy of the disks in case I need to restart in a clean environment or share it to a newcomer to the project. However; now, I don't need to think about creating again or even documenting for the future use. Once, I have Vagrant and Puppet configuration files, my team mates or I can create the instances easily. Moreover; Any new configuration in our development environment can be updated using this setup by one of team member and all team members can update and recreate their development environment without a hassle. 
