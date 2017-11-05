Business Case of Cloud Services
===============================

Ömer Saatcioglu
[osaatcioglu@gmail.com](mailto:osaatcioglu@gmail.com)

076 7781155

<!-- TOC -->

- [Introduction](#introduction)
- [What is Cloud Computing](#what-is-cloud-computing)
	- [Elasticity](#elasticity)
	- [Metered Billing](#metered-billing)
	- [Different cloud offerings](#different-cloud-offerings)
- [Reasons for "Going to the Cloud"](#reasons-for-going-to-the-cloud)
- [Scalable Software Architectures](#scalable-software-architectures)
- [Filesystems](#filesystems)
- [Databases](#databases)
- [Security in the Cloud](#security-in-the-cloud)
- [Conclusion](#conclusion)

<!-- /TOC -->

# Introduction

Cloud services are fairly new services but the underlying technology were present for a long time before Amazon picked it up as a business. In this article, we will try to find out what are the things that the cloud services are trying to solve in the business and financial perspective. We will also talk briefly about certain attributes of the cloud solutions. 

# What is Cloud Computing

A service using cloud means that the service is located somewhere on Internet where it is by theory accessible by anyone. Of course, the service itself can have security measures to limit the access. But it is totally different than a traditional IT infrastructure that does not provide public access to any internal service unless it is needed and the public access is generally provided to the load balancers and not to the actual servers.

For a cloud infrastructure, all of the followings are necessary as they are reducing the cost and it is also lowering the barrier for the customer to enroll to the program.

**Pooled Computing Resources:** The computer resources are acquired resources that are kept in the pool to be used by a client. Clients request the resource from the pool when needed and they return it back when they finish with the resource. This is beneficial for the performance when the resource is expensive to acquire. 

**Virtualized Computing Resources:** The hardware should be virtualized using hypervisor technology to increase the utilization of the hardware. 

**Elastic Scaling up or down:** Elastic means that the scaling process does not increase CAPEX, meaning it does not require to add a new hardware to the IT infrastructure 

**Automatic creation and deletion of new VM’s:** Typical manual intervention as it is in the traditional IT infrastructure is not required to add/modify/delete a server or a component. 

**Resource usage billed only as used:** The CAPEX is close to zero in the cloud environment as all servers are charged based on metered billing concept. So, the expense is registered to OPEX that is the most preferable way by most of the IT company types.

Besides these advancements in the IT infrastructure, I believe that the biggest achievement of the cloud technology is abstraction of the hardware components that puts them under the control of the software stack. Starting from the cloud technologies, a database server, an application server or even a load balancer are just a component that can be launched and loaded using the API commands provided. And the cloud provider is handling all the tedious work automatically.

Not all of these advancements are based on technology. Even though, pooled resources, virtualization and automation are technological advancements that enabled the cloud tech, the metered billing is the business consequence and elasticity is a direct consequence of the technology that benefits the end user.

## Elasticity

Let's take Elasticity as an example. Peak times are always nightmares for the teams managing a traditional IT infrastructure. Since, economically, it is not feasible and sometimes not even possible to plan a hardware setup that is suitable for the peak times, it is accepted that the peak times will push the limits of the servers and causing decrease on the performance. However; In the cloud setup, since it is cheaper cost-wise and time-wise to launch several new instances in minutes, it is faster to ramp up during peak times and then down grade when it is not needed anymore. Because of that, the performance does not get a hit due to financial reason and moreover, the IT department does not need to put an overhead for the future peak hours. So, it is both financially and technically a better solution compared to the traditional IT systems.

When it comes to scaling, there are mainly two different scaling scenarios: Quick scaling and slow scaling.

Oprah Effect is a good example for a quick scaling needs. Since, the IT requires major scaling in a very short time, Elastic Scaling becomes a life saver. To put it into a perspective, when North Korea tested the Hydrogen bomb and it was announced via South Korean news website, it created a major attention from all over the world that a national news company in a Far East Asia wouldn’t be able to prepare if it wouldn’t have an Elastic Scaling in place.

On the other hand, slow scaling example can be any service (including SaaS) that has user acquisition as a business model. We can name a few without mentioning the obvious ones: Dropbox, Slack and Github. In this type of scaling scenario, unless the company already has a traditional IT infrastructure and they don’t see any need for scaling or upgrading in the foreseeable future, it would still be financially good option to switch to a cloud service.

Because, the biggest advantages to the business side by switching to the cloud are converting CAPEX to OPEX and Elastic scaling. So, one of these advantages if not both should be required by the organization to make the move the cloud financially feasible option.

Above all, the architecture of the service should be created in a way to support scaling. For example, if the app servers are designed to lock the database even for reading operation, adding more app servers will not speed up the service.

## Metered Billing

An important business feature is metered billing. Let's take the system in Figure 1 as an example.

![Figure 1: A Simple Example App](https://mickesv.github.io/cloudbd/BusinessCase/images/FSimpleApp.png)

*Figure 1: A Simple Example App*

If we run the estimate cost for this system in a traditional IT concept. We will need the following components with the given price.

<table>
  <tr>
    <td>Component</td>
    <td>Quantity</td>
    <td>Selected Hardware</td>
    <td>Cost</td>
    <td>Total Cost</td>
  </tr>
  <tr>
    <td>Load Balancer</td>
    <td>1</td>
    <td>Citrix VPX-10</td>
    <td>$11,520</td>
    <td>$11,520</td>
  </tr>
  <tr>
    <td>App Server</td>
    <td>2</td>
    <td>HPE ProLiant DL380 Gen9 E5-2690v3 2.6GHz 12-core 2P 32GB P440ar 8SFF 2x10Gb 2x800W High Perf Server</td>
    <td>$8,200</td>
    <td>$16,400</td>
  </tr>
  <tr>
    <td>Storage</td>
    <td>1</td>
    <td>MSA 1040 10Gb iSCSI w/12 900GB SAS 10K SFF (2.5in) Hard Drive Bundle/S-Buy</td>
    <td>$17,000</td>
    <td>$17,000</td>
  </tr>
  <tr>
    <td>Switches</td>
    <td>2</td>
    <td>D-Link DGS-3000-10TC</td>
    <td>$250</td>
    <td>$500</td>
  </tr>
  <tr>
    <td>Total</td>
    <td></td>
    <td></td>
    <td></td>
    <td>$45,420</td>
  </tr>
</table>


The usual lifecycle of a traditional IT component is between two to three years. Let's take 3 years for this example. So, the monthly expense will be $1,262. We should also consider monthly expenses such as network ($500) and power and cooling ($400). So, the total monthly cost adds up to **$2,162**.

On the other hand, if we take Amazon Cloud as the cloud example by looking at two major offering from Amazon. [^1]

<table>
  <tr>
    <td>Instance Type</td>
    <td>Hourly Rate (Reserved)</td>
    <td>Hours per month</td>
    <td>Number of Servers</td>
    <td>Total Cost</td>
  </tr>
  <tr>
    <td>T2.Large</td>
    <td>$0.067</td>
    <td>720</td>
    <td>4</td>
    <td>$192.96</td>
  </tr>
  <tr>
    <td>M3.large</td>
    <td>$0.095</td>
    <td>720</td>
    <td>4</td>
    <td>$273,6</td>
  </tr>
</table>


So, in comparison, the price difference between the expensive from the cloud service and the traditional IT infrastructure is 1/8th which is by far very low.

Since the reserved rates are given as an example, it deserves an explanation. Reserved Instances require to do yearly contracts with Amazon rather pay as you go without any commitment model. This is why; It provides major discount compared to the on-demand option. The discount can go up to 75% percent if you pay the complete service fee upfront. And, this model makes more sense when comparing with the traditional IT costs.

When talking about Amazon instances, we need to discuss a major point that is normally not a concern for the traditional IT. The CPU Utilization is defined as a policy by Amazon to outline the difference between a baseline CPU usage and at maximum CPU usage (bursting).

Amazon provides an initial credit with the accepted baseline CPU usage per instance based on the instance type. If the instance stays under the baseline, Amazon adds the difference to the CPU credit. If the instance requires more CPU than the baseline, then it starts to use the CPU credit to go beyond its baseline CPU until it runs out of the credit. When it runs out of the credit, the instance is forced to operate in the baseline CPU limit. The credit earned is hold for 24 hours only.

To be able to comply to this policy, the service should be able to distribute the CPU power evenly and stay away from designs that might burst the CPU usage for a long time. Several methods can be used to mitigate this problem.

* Cache CPU critical calculations that can be used later since storage (especially transient one) is cheaper than the CPU time.

* Queue and delay operations that can be done later when the instance is idle. For example, processing the image that the user uploaded, etc.

* Choose a functional programming language like Erlang that lets you do the operations multithreaded so it doesn’t require to complete all tasks at once to response back. 

None of these methods are silver bullet. But, they can help to minimize the deviations in the CPU

## Different cloud offerings

In terms of business perspective, we need to also talk about different type of cloud offerings like the following:

**Software As A Service:** They are "package programs" in the cloud. It can be almost anything that is oriented for an end user. Some examples: webIDE, newspaper, Facebook, Github, Dropbox 

**Platform As A Service:** It is a service that is abstracting away all hardware related tasks and scaling. So that, the tech companies can concentrate only on the development of their service/application. Since it is heavily abstracted by a certain company, the app development requires custom APIs, language and methods. So, a main disadvantage for this one compared to the IaaS is that the big risk being locked-in due to technological restrictions. Google App Engine and Heroku are good examples. 

**Framework As A Service:** It is a service that is between SaaS and PaaS. The abstractions are more specific toward a language and Middleware (Framework) and the customizations are quite limited. But, the development is faster in this service compared to the PaaS. The line between PaaS and FaaS is pretty thin. So, it can be hard to distinguish such Services. As a rule of thumb, the FaaS should look like an unfinished SaaS that requires some small touches and rebranding. 

**Infrastructure As A Service:** It is basically what most of the people calls cloud. It is the service that enables a general-purpose computing and/or storage to be used for any application. Vendor lock in is pretty small but the prices of these services are higher compared to a PaaS. Typical examples are AWS, Google Cloud Platform and Microsoft Azure which they provide all components needed by a modern IT infrastructure. There are also more recent companies like Digital Ocean and Wasabi[^2] that are cheaper but they provide specific service. For example, Wasabi only provides a storage par to AWS S3.

# Reasons for "Going to the Cloud"

The followings are the top five reasons for a company to move to a cloud solution.

1. **Reliability:** Fault Tolerance and Recoverability are the two import factors that a Cloud solution is superior compared to the traditional IT Infrastructure. A server can be created within minutes to recover a disaster for example. However; Due to nature of the operation, there is always a chance that one of the instances to go down. So, the architecture of the service built for the cloud should be tolerant to these kind of faults. But, as said earlier, launching a new instance that is a snapshot of the failed instance takes minutes.

2. **Security:** Security is surprisingly major advantage in the Cloud Service. Because of a big scale operation, the vendor can be more cautious and proactive against security breaches.

3. **Portability:** Installability and Replaceability are enhanced features in the cloud service.

4. **Performance Efficiency:** Definitely, Performance efficiency is a winner in the cloud service.

5. **Usability:** The usability of the service also easier compared to the traditional IT Infrastructure. Since the operations are well documented and streamlined, the operations are easier to learn and operate. Also, it gives user error protection by making API calls focus on one function at a time.

# Scalable Software Architectures

Scaling is an issue in a traditional IT Infrastructure as the provided service starts to grow or see a spike in the usage. Once the scaling is done, down scaling also becomes expensive decision in terms of materials and man power. On the other hand, cloud services provide elastic scaling that it can be scaled up and scaled down based on the demand without having expensive operations and purchases.

Scaling relies on the virtualization of the computer resources. Virtualization is done with the hypervisor technology. In a summary, hypervisor is the platform that enables to run multiple guest OSes in the host OS. Hypervisor technology can abstract hardware resources and create a virtualized hardware specifically for the guest OS. The abstraction can be done in software level, firmware level and hardware level. 

The most efficient way is to abstract it in the hardware level, which is also called bare-metal hypervisor. This type of hardware is designed to run guest OS by default. So, it is highly optimized for this purpose. Cloud services are taking advantage of this technology to create virtual instances of the requested OS. Thus, scaling up and down in a cloud infrastructure is a matter of calling a process in the host OS of given hardware.

On the other hand, the software level hypervisor is widely used by the developers to replicate the same environment as the target OS in the cloud. 

Let's take the following system types one by one.

1. **Computing Jobs:** 

This solution requires intensive computing power when the data is present but the data may not be present all the time. So, using Elastic Scaling is crucial for this system. Two components are quite important. The Registering and Queueing Component is required and Amazon provides a service called Amazon Simple Queue Service. There is also a new offering in Amazon that lets the user lease per second rather than per hour[^3]. Moreover; since the availability is dependent on the amount of data to be processed, App Server Manager is needed to orchestrate the instances. Several instances can be created and later destroyed based on the work load. Lastly, this system requires a reliable storage for the processed data and this can be provided by the cloud services.

This system could have a system design like the following by leveraging the cloud solutions. As one can see that the solution requires to have several components:

- __Load Balancer:__ Essential to balance the requests among servers.
- __Registering and Queueing Server:__ This is the component that saves the incoming data to the relevant database table and put the job in the queue which is also a dedicated table.
- __AS Manager:__ App Server Manager is the one responsible to create and/or destroy App Server instances based on the current load in the queue
- __App Server:__ This is the server that is actually doing the actual processing work
- __Database:__ The noSQL database that is storing the data

![System Type  Computing Jobs](http://www.plantuml.com/plantuml/png/RLDDZzem4BtxLupsN0vmv50jBAhK1Ig5L5mM3XCy0M-3dVg3LRJQ_zwnyx6aRKxspFDxRvwTH-VH-d2jX5U-8iWRv-aAFvkQvl1ahdNmIf_XsHHEY5DbWeJlsfFLvE5TV8YNZK49IwnGdyWU0Hriba8RIV2mexDYDXi9K4l80WMAcvpiZQnxYEYCQO2_brsMCpNROIAO7lzJd1t51tJSYxeUqIpodcSnecbxqtzR8x8SjgZnJBRZsWg97Wjqt5nrgrPdjUnrrjHCzbW5ubgIMU_R1aF-Cj3httTcRMV66OeXqOaqRthoDKQuMGwx3EQm8waidJnu0_v2W3TK5HPyOowb8B81pYfpoF562HW7IUdRxZPIzTKKe7HQ_ewt8dZcCS6EkE4yOCAMrbn7w37uczBANNhcBmSTQjPj3V2yFhXaeVTpVpuAp-67yQfi680-eLGNqq6NYPhQmnxThsuOb0sKnh8_JMzWD4E1jss3GofOYlrRq_3PThnG9pr-runYTmpl8F3vd0wwrtOGhrqozn1PnO-TkQOmiUfyyObkolPN7StOkYfZmNB9WJR9PnfW5BnOxuSi-9tSxsRYaRJaV_CF "System Type  Computing Jobs")

2. **Computing Stream:** 

This system is a bit different than the previous one as it is getting the data via stream. One can think that storing the data and then processing it is still a viable option. However; it might be inefficient if the stream takes long period and the processing may not even start before all data is stored. Instead, we can design the system like the following:

- __Load Balancer:__ Essential to balance the requests among servers.
- __AS Managing and Queueing Server:__ This is the component that manages the App Servers and also creating the pipeline rules for the App Server instances to follow during processing the data
- __App Server:__ This is the server that is actually doing the actual processing work. The processed data is either written to the database or streamed to another App Server based on the rules defined by the AS Managing and Queueing Server.
- __Database:__ The noSQL database that is storing the data

![System Type  Computing Stream](http://www.plantuml.com/plantuml/png/ZPF1Rk8m48RlVeeHTv3Wc4DLQ3cie9MoMRXK7ARn0DO6EsjFwAAgxzwn4wAKxc5pIUoP-VwPtyvzOFJSd2fGRBWYA2w1wGI_BZLbyE1ETSF67g1WJtXIggnSe-67PVAM6DxLXtfPEzImm0fjINu7662zKDPfWj6yW2UqU8W8j1hoXXfAFF9dyc4KitF1W3mly-8fBmGkFGaAfhj_RizswWEk_Bh-WXAzdZK4jR7fzr0BKnePNp48yR7xQdcFYojlHPVn5gk6P2_XLjis82atGbUTOMJMHcRY5vRiF8oMOiSca4ywourIlQbZxTxi-2wwk5xqgnmo-4dQU2ePs04V2V2Cfi9NERQGJ51vdov3olaTgVpzBIjM2uNCcH8bfBETm8EycC1qFGVvaee_3SK1p1uiaIOzKOA-giY86HJOWMhlf2oGXkWdl1sDQBPAySnRdLJkpU78SQWCdXsR_KMIoGww0R8wG8XZ8gTzAJC1vFubliWF-rXkikwAfjoziLZTjjDvLbQ6BCTvV9nDRhiMqXJ6JPric_utoT9VJctjuz9Jx0zxnvHQRVl-v4eCLpDrB_F9N_S9 "System Type  Computing Stream")

3. **User Silos:** This is a typical system of the web app services. The scaling and downscaling can be an issue when there is a higher demand of the user and other times lower. So, a cloud solution is a perfect fit for these types of services. Yet, the scaling might not need to be dramatic in most of the time like in Computing Jobs system type. Also, the cloud service can provide a huge benefit for this type of systems in terms of Availability and Reliability.

- __Load Balancer:__ Essential to balance the requests among servers.
- __Cache Server:__ Cache server keeps the cache for the most frequent and non-changing request so that the App Server doesn't need to compute the same request over and over.
- __App Server:__ App Server is responding to the user's request and process the data before sending back to the Cache server to be cached and sent to the user.
- __Database:__ The noSQL or SQL database that is storing the data

![System Type  User Silos](http://www.plantuml.com/plantuml/png/PLAnRi8m4DtlAqxi6SY8gee4bWgcfcL132Q-jfQCdTeNMbJnxxt4IKHBfhFVlVVkdhECh0At9mjis19MbyXqmfTBGmjyZHImCjP7WDhwLkEJOmgE67_W2lkjLnfBPPMhAHnGHToMuBmcdArK_I5g5CuKugo3LfMGKBwzLFF3LEO7kEB0Afhc3wUOE58zEPbLd8ISiFazbCH0ArP75KLnFLH9RrsEUXkwP3jbMvAxNcwpIu2q_3CQVMwHF26vf01J9fdsNovxx4BObjD9LbpWCsaJg6PaZop1gBCoLXqbyDYl2zALjKrFNaW4JlTjWM9hkGS7jIAfSJ1qfg7dioLvD8tTrcZUq7d6kijVen8X-cx4MqCnMgogEujnhkxPZ7iV7g6xFTAjbYPh14Xg3-DGwn9WivjcbC1kJpainKn-iLy0 "System Type  User Silos")

4. **User Silos with Post-Processing:** Scheduling tasks for post processing is crucial attribute of this system and most of the time the post processing might be preferred to be done at the time that the system is idle. The best case is to do in the "night time" and the recipient receives the output in the next day. This can be beneficial in the cloud solution as the CPU utilization is evenly distributed. Moreover; Availability and Reliability are major advantage when moving to the cloud.

- __Load Balancer:__ Essential to balance the requests among servers.
- __Cache Server:__ Cache server keeps the cache for the most frequent and non-changing request so that the App Server doesn't need to compute the same request over and over.
- __App Server:__ App Server is responding to the user's request and process the data before sending back to the Cache server to be cached and sent to the user.
- __Post Processor Server:__ This component is responsible to process the task assigned by the App Server and notify the user to retrieve the data at the end of the task.
- __Database:__ The noSQL or SQL database that is storing the data

![System Type  User Silos with Post-Processing](http://www.plantuml.com/plantuml/png/RLCzRzim4DtvAmxUDSHZK1InR0-1ZKAeQY-91reyDKHfKYLFJeqY_xr7YXBiEfge-tZltJloAP3qr9-C84q6eRu4mXFyk7Ju2Bk07cfjN81tJMzGkK15vLs38MZxKpJ6zGgUBQ6tIF1NV8YNhPCAIccaRT0VG0RObi8wXJ1RokQD6T2VqOTPJ2rhRWB-NlZqS9YEyuFuWDorwBgRdiNKmwTdo_gPYPk7tCDzQW1JakHH1WPSvTC0jof7k0rUYhqqFN8ieMtsGu9B_kCPQQupyo4pPnC6uT4jo6uvVpD3LOsaLNKpn2V1A5_8XXXYjhOgBIM1h7TYihvGxjqMNwFNstBwOoSVuJigxR4X80V4_ikpr4OUUTSXAH9SLVHTQkRo6faZrdaClQ6KpN2B0OwynZFccjyzyeLH4ErzjRe5wmYQk6W5af7mJyViIYn6acLznp4gY_U3hrLswjLo-8ZNO0gDvWp3iO6ZgbMPL2KX885a-0MjTwS4oL7UP-pjXaM0fhlcMkPnSaqUvxfklUEwRuvqUqcLVNmPBQya_hJQwX0rHkuuwPVFuTE5wARdCqZDiuSuP6-6C2z7RFOJET-swx-vU6B_-Cd-0m00 "System Type  User Silos with Post-Processing")


5. **Networks of Users:** There are several methods to achieve fast interactivity and not to overload the servers. One example is webRTC. In this method, the server is the connector between clients and once the connection is established, all the communication goes directly from client to client without requiring the server. This is beneficial if the service is chat application and the data is transient. However; If the service is Facebook like service, then the server needs to get the data and save it also to be reachable later and it may even be reachable to other clients within user permissions. Cloud Services can have a great benefit here in terms of scalability and data storage. And Availability and Reliability are major advantage as in the fourth example.

I will take the Facebook like services as an example. A typical system design could be like the following. It looks, initially, very similar to the User Silos system. However; Since there is an ongoing interaction in the User's device, the design requires the client app to be interactive, ie. request data from the server through API frequently.

- __Load Balancer:__ Essential to balance the requests among servers.
- __Cache Server:__ Cache server keeps the cache for the most frequent and non-changing request so that the App Server doesn't need to compute the same request over and over. Typical examples are the HTML views/pages to be loaded before the app/browser can start to compute to process the data.
- __App Server:__ App Server is responding to the user's request and process the data before sending back to the Cache server to be cached and sent to the user.
- __Database:__ The noSQL or SQL database that is storing the data
- __End User's Client:__ End User's client can be a native app or a browser that has the capability to retrieve data from async requests through APIs and it can process the data to show to the user.

![System Type  User Networks of Users](http://www.plantuml.com/plantuml/png/RLF1Ri8m3BtdAopk7E28feaME23GXCRWWZY4na2qa7H92a8J_pudQQkohIV7VdxFprR7pdFhgujYNdg5iBuxZnVuk9SuWer32s_eRyP-EZ37c72C5zvOwCsqY8aUS0Up3Tij3HUGSyLrWNOViikSQICGUXDUd8aSxPK8OiDa3TyCwDjHDDYtuN3F7b1tPMNvr9ErFHJDDOrEIjISQeE_fKGckES7xeXmMaU9RfetT0kyzxTSLKYvoBROfW91VkaqCjtAC5M6xC5c6-WBSzFzrs1-cRSliZQ2TnJIOk716_2q47xbKl43xTr5cunG_QeaEF6CoBiMKfyYj0WR572LU7CWZp5dyQj2vq4wKBJx1Xem4AbgxInf9_2HRXTGOIl_474DsMfESagnh9bciax3r61NgTP2k6mGJdSAsKCxBASEWKfI0KNNsxErE4bD5qGgrnALrXJe774TxWcBLrbWNBELfxElwLO9rp6cE_0uY3kR6yXsxY0I3BuqIvhcRB5jLqPdxhw6R4oJqM_o0m00 "System Type  User Networks of Users")

# Filesystems

When it comes to the filesystems that are storing data that are not suitable for the databases. The followings are in the consideration.

1. Self-administered network file system in the cloud can be highly fault intolerant. Because, once the instance used as a file storage has shut down for some reason, all data stored in the instance is gone. Of course, there can be a backup mechanism but this might also add unnecessary overhead to the system. Therefore, this kind of file system can be used for transient data that it is not needed to be backup frequently.

2. A cloud based networked file system is a good option for the persistent storage. However; the I/O takes longer time compared to the self-administered file system. Therefore; This system can be used for the persistent storage of the files after they processed. There are several options for this like Amazon or S3 or Wasabi which is a new company provides a much lower price compared to Amazon S3.

3. Self-administered distributed file system in the cloud is a good option increase the fault tolerance. However; the duplication may increase the storage needs and the I/O might take longer time. This solution might be useful for data needs to be distributed geographically like CDN.

Also, it is important to check different type of storage solutions in terms of their benefits and liabilities.

<table>
  <tr>
    <td>Storage Solution</td>
    <td>Description</td>
    <td>Benefits</td>
    <td>Liabilities</td>
  </tr>
  <tr>
    <td>Hadoop HDFS</td>
    <td>Hadoop breaks the data to small blocks and it distributes them through clusters</td>
    <td>It is good for processing large dataset in the distributed instances</td>
    <td>It takes longer time for linear search in the data</td>
  </tr>
  <tr>
    <td>GlusterFS</td>
    <td>Scalable network storage solution that can attach several storages and make them act as a single storage component</td>
    <td>Storing very large data like academic research data</td>
    <td>I/O might suffer due to connected devices</td>
  </tr>
  <tr>
    <td>Amazon S3</td>
    <td>Simple storage service that stores data as an object</td>
    <td>Limitless file size, native format and fast I/O</td>
    <td>The cost for the storage and transaction might add up in a highly operational solution</td>
  </tr>
  <tr>
    <td>Amazon Glacier</td>
    <td>The same features as in S3 but with much lower cost</td>
    <td>The cost is extremely lower</td>
    <td>I/O speed is slower compared to any other options</td>
  </tr>
  <tr>
    <td>Google Cloud Storage</td>
    <td>Similar to S3 and Glacier, it provides limitless object storage</td>
    <td>It provides a unified interface for both cold and live storage</td>
    <td>It is a bit more expensive compared to S3</td>
  </tr>
</table>


When it comes to the security implications to the storage systems, we can take Amazon S3 as an example. Amazon S3 lets any client to reach data with the Access Key ID and Secret Access Key. So, it requires to store this sensitive information in a secured manner. Other than that, the bucket is private by default unless it is changed to be public.

# Databases

NoSQL databases are key-value type of database. Which means that the database doesn't provide relations between tables and so no need for joins to structure a query. It is beneficial to have such a structure if you are dealing with a massive data. In a big data world, the data can be stored in different machines since the tables are not needed to interact to each other. So, in NoSQL databases, a simple hash map load balancer will take care of the sharding as all related information is always stored in the requested table. In contrast to the traditional relational database, sharding strategies become a big problem in scaling the system. On the other hand; the disadvantage is NoSQL database can have a lot of duplicate data. So, the benefit of this type of database is only visible when the scaling is a major issue.

# Security in the Cloud

Security is a big concern in a post-NSA technology world. Cloud Services provide anonymity by design and this is a big benefit for the security. Moreover; the cloud service providers are taking the security more seriously as it might hurt their business such as: 

1. Provide higher security measures in the physical presence of the servers

2. Provide client-server encryption by default as the customer will not share its data in the plain format.

Yet, liabilities of the cloud services still exist. The RSA keys can be hacked and the cloud storage service can give access to unintended data due to bugs in their solutions. However; this kind of security breaches might be fixed much faster compared to a traditional IT infrastructure.

# Conclusion

Cloud services have become a strong alternative to the traditional IT infrastructure. Cloud services are more complex because of the variety of new paradigms and methods that are introduced to improve the efficiency and comply to the new type of the business model. However; it is still compelling technologically since it is abstracting the hardware and put it under the control of the software. And, more importantly, it provides a much cheaper and better financial model (OPEX in comparison to CAPEX) to an increasing demand on the IT infrastructures. 

[^1]: http://www.ec2instances.info/

[^2]: https://wasabi.com/pricing

[^3]: https://aws.amazon.com/blogs/aws/new-per-second-billing-for-ec2-instances-and-ebs-volumes/
