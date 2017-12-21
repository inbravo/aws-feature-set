# Amazon Web Service feature set

![](https://github.com/inbravo/aws-feature-set/blob/master/mind-maps/aws-all-services/aws-all-services.jpg)

# Storage and Content Delivery

## [S3](https://aws.amazon.com/s3) [Documentation](https://aws.amazon.com/documentation/s3)
-  Properties
	-  [Bucket is uniquely identified by ARN (example: arn:aws:s3:::10-dec)](http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
	-  [Versioning enables you to keep multiple versions of object in bucket](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/enable-versioning.html)
	-  [Server Access Logging to track requests for access to your bucket](https://docs.aws.amazon.com/AmazonS3/latest/dev/ServerLogs.html)
	-  [Hosting a Static Website on S3](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html)
	-  [Object level logging](https://docs.aws.amazon.com/awscloudtrail/latest/userguide/logging-management-and-data-events-with-cloudtrail.html?#logging-data-events)
	-  [Amazon S3 Default Encryption for S3 Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html)
-  Permissions	
   -  [Access control list enable you to manage access to buckets and objects](http://docs.aws.amazon.com/AmazonS3/latest/dev/acl-overview.html)
   -  [Object Lifecycle Management using Bucket Policies (IAM)](https://docs.aws.amazon.com/AmazonS3/latest/dev/using-iam-policies.html)
   -  [AWS Policy Generator](https://awspolicygen.s3.amazonaws.com/policygen.html)
   -  [Cross-Origin Resource Sharing (CORS)](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html)
-  Management	
   -  [Manage an object's lifecycle by using a lifecycle rule](https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html)
   -  [Automatic transition objects to the Standard-IA and/or to the Glacier](https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html)
   -  [Automatically expire objects or clean up incomplete multipart uploads](https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-expire-general-considerations.html)
   -  [Cross-region Replication enables automatic and asynchronous copying of objects in different AWS regions](https://docs.aws.amazon.com/AmazonS3/latest/dev/crr.html)
   -  [Amazon S3 analyzes your access patterns and suggests a lifecycle rule](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/configure-analytics-storage-class.html)
   -  [Metrics is to add filters (prefix or tags) to get more granular data about usage](https://docs.aws.amazon.com/AmazonS3/latest/user-guide/configure-metrics-filter.html)
   -  [Inventory provides reports on a daily or weekly basis for the entire bucket](http://docs.aws.amazon.com/AmazonS3/latest/dev/storage-inventory.html)

## [Glacier](https://aws.amazon.com/glacier) [Documentation](https://aws.amazon.com/documentation/glacier)
-  [Glacier Data Retrieval Policy](http://docs.aws.amazon.com/amazonglacier/latest/dev/data-retrieval-policy.html)

## [EBS](https://aws.amazon.com/ebs) Documentation](https://aws.amazon.com/documentation/ebs)
-  [Amazon EBS Volume Types](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html)
-  [Amazon EBS Snapshots](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSSnapshots.html)

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