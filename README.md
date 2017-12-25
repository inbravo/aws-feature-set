![](https://github.com/inbravo/aws-feature-set/blob/master/mind-maps/aws-all-services/aws-all-services.jpg)

# Storage and Content Delivery

## [S3](https://aws.amazon.com/s3) [Documentation](https://aws.amazon.com/documentation/s3)
-  Properties
	-  [Bucket is uniquely identified by ARN (example: arn:aws:s3:::10-dec)](http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
		-	Amazon Resource Names (ARNs) uniquely identify AWS resources
	-  [Versioning enables you to keep multiple versions of object in bucket](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/enable-versioning.html)
	-  [Server Access Logging to track requests for access to your bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerLogs.html)
		-	To track requests for access to your bucket, you can enable access logging
		-	Each access log record provides details such as the requester, bucket name, request time etc
	-  [Hosting a Static Website on S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html)
	-  [Object level logging](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html?#logging-data-events)
		-	Data events provide insight into the resource operations performed on or within a resource
	-  [Amazon S3 Default Encryption for S3 Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html)
-  Permissions	
   -  [Access control list enable you to manage access to buckets and objects](http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html)
		-	Amazon S3 access control lists (ACLs) enable you to manage access to buckets and objects
		-	Each bucket and object has an ACL attached to it as a subresource
   -  [Object Lifecycle Management using Bucket Policies (IAM)](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html)
		-	Bucket policy and user policy are two of the access policy options available for you to grant permission to your Amazon S3 resources
   -  [AWS Policy Generator](https://awspolicygen.s3.amazonaws.com/policygen.html)
		-	The AWS Policy Generator is a tool that enables you to create policies that control access to AWS resources
   -  [Cross-Origin Resource Sharing (CORS)](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html)
		-	CORS defines a way for client web applications that are loaded in one domain to interact with resources in a different domain
-  Management	
   -  [Manage an object's lifecycle by using a lifecycle rule](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)
		-	Transition actions – define when objects transition to another storage class
		-	Expiration actions – In which you specify when the objects expire
   -  [Automatic transition objects to the Standard-IA and/or to the Glacier](https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html)
		-	Transition objects to the STANDARD_IA storage class when objects are infrequently accessed
		-	Archive objects that don't need real-time access to the GLACIER storage class
   -  [Automatically expire objects or clean up incomplete multipart uploads](https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-expire-general-considerations.html)
		-	When an object reaches the end of its lifetime, S3 queues and removes it asynchronously
   -  [Cross-region Replication enables automatic and asynchronous copying of objects in different AWS regions](https://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html)
		-	The source and destination buckets must have versioning enabled
   -  [Amazon S3 analyzes your access patterns and suggests a lifecycle rule](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/configure-analytics-storage-class.html)
		-	Choose the name of the bucket for which you want to configure storage class analysis
   -  [Add metrics filters to get more granular usage data in CloudWatch Metrics](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/configure-metrics-filter.html)
		-	CloudWatch Storage metrics are reported once per day and are provided to all customers at no additional cost
		-	CloudWatch Request metrics are available at 1 minute intervals after some latency to process 
   -  [Inventory provides reports on a daily or weekly basis for the entire bucket](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)
		-	Use it to audit and report on the replication and encryption status of your objects for business, compliance, and regulatory needs

![](https://github.com/inbravo/aws-feature-set/blob/master/mind-maps/storage-and-content-delivery/s3.jpg)
   
## [Glacier](https://aws.amazon.com/glacier) [Documentation](https://aws.amazon.com/documentation/glacier)
-  Vaults
	-  [Creating a Vault in Amazon Glacier](https://docs.aws.amazon.com/amazonglacier/latest/dev/creating-vaults.html)
		-	Vault names must be unique within an account and the region in which the vault is being created
	-  [Creating Data Retrieval Policy](http://docs.aws.amazon.com/amazonglacier/latest/dev/data-retrieval-policy.html)
		-	Data Retrieval Policies
			-	Free Tier Only 
			-	Max Retrieval Rate
			-	No Retrieval Limit
		-	Retrieving an archive from a vault inventory, is a two-step process
			-	Initiate a retrieval job
			-	After the job completes, download the job output
	-  [Configuring Vault Notifications in Amazon Glacier](http://docs.aws.amazon.com/amazonglacier/latest/dev/data-retrieval-policy.html)
		-	Set a notification configuration on a vault so that when a job completes a message is sent to an Amazon SNS) topic 
	
![](https://github.com/inbravo/aws-feature-set/blob/master/mind-maps/storage-and-content-delivery/glacier.jpg)

## [EBS](https://aws.amazon.com/ebs) [Documentation](https://aws.amazon.com/documentation/ebs)
-  [EBS Volume Types](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
-  [EBS Snapshots](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html)

## [Storage Gateway](https://aws.amazon.com/storagegateway) [Documentation](https://aws.amazon.com/documentation/storagegateway)

## [Cloud Front](https://aws.amazon.com/cloudfront) [Documentation](https://aws.amazon.com/documentation/cloudfront)

# Compute and Networking Services

## [EC2](https://aws.amazon.com/ec2) [Documentation](https://aws.amazon.com/documentation/ec2)
-  [List of EC2 instances](https://ec2instances.info)
-  [Placement Groups](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html)
	-  [Cluster Placement Groups](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html#placement-groups-cluster)
	-  [Spread Placement Groups](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html#placement-groups-spread)
-  [Enhanced Networking](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/enhanced-networking.html)
-  [Amazon Paravirtual (PV) and Hardware Virtual Machine (HVM)](https://cloudacademy.com/blog/aws-ami-hvm-vs-pv-paravirtual-amazon)
-  [Add Instance Store Volumes to Your EC2 Instance ](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/add-instance-store-volumes.html)
-  [Elastic File System (EFS)](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonEFS.html)

## [Auto Scaling](https://aws.amazon.com/autoscaling) [Documentation](https://aws.amazon.com/documentation/autoscaling)
-  [Scaling Types](https://aws.amazon.com/autoscaling/#application)
-  [Fleet Management Made Easy with Auto Scaling](https://aws.amazon.com/blogs/compute/fleet-management-made-easy-with-auto-scaling)

## [ECS](https://aws.amazon.com/ecs) [Documentation](https://aws.amazon.com/documentation/ecs)
-  [ECS for Microservices](https://github.com/awslabs/ecs-refarch-cloudformation)

## [CodeDeploy](https://aws.amazon.com/codedeploy) [Documentation](https://aws.amazon.com/documentation/codedeploy)

## [Elastic Beanstalk](https://aws.amazon.com/elasticbeanstalk) [Documentation](https://aws.amazon.com/documentation/elasticbeanstalk)

## [VPC](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Introduction.html) [VPC NAT](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat.html)
-  [VPC Subnet](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html)
-  [VPC NAT Gateway](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/vpc-nat-gateway.html)
-  [Pricing](https://aws.amazon.com/vpc/pricing)

# Database Services

# Management Tools

## [CloudFormation](https://aws.amazon.com/cloudformation) [Documentation](https://aws.amazon.com/documentation/cloudformation)
-  [Designer](https://aws.amazon.com/cloudformation/details/#designer)
-  [Concepts](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-whatis-concepts.html)
-  [Template Anatomy](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/template-anatomy.html)
-  [Sample templates](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-sample-templates.html)
-  [User Guide](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/Welcome.html)
-  [Pricing](https://aws.amazon.com/cloudformation/pricing)

# Security and Identity

# Application Services

## Additionals

- [AWS new feature annoucements](https://aws.amazon.com/new/reinvent)
- [AWS cost calculator](https://calculator.s3.amazonaws.com/index.html)