![](/mind-maps/aws-all-services/aws-core-dimensions.jpg)

# AWS Reference

- **Security & Identity**
	-	[**IAM**](https://github.com/inbravo/aws-feature-set#-iam--identity--access-management) : How you setup and assign users / groups etc
	- 	**Inspector** : Agent which inspects your VMs and does security reporting
	- 	**Certificate Manager** : Free SSL certs for your domain names
	- 	**Directory Service** :  Run MS active directory service on cloud
	- 	**WAF** : Web Application Firewall
	- 	**Artifacts** : All documentation under compliance and reports
- **Compute** 
	-	[**EC2**](https://github.com/inbravo/aws-feature-set#-ec2--elastic-compute-cloud) : Elastic Compute Cloud
	-	**ECS** : EC2 Container Services
	-	[**EBS**](https://github.com/inbravo/aws-feature-set#-ebs--elastic-block-storage) : Elastic Block Storage
	-	**Elastic Beanstalk** : Elastic Bean stalk will provision all infrastructure required
	-	**Lambda** : Alexa, Echo devices rely on Lambda
	- 	**Lightsail** : Out of the box cloud e.g. WordPress, Drupal
- **Storage** 
	-	[**S3**](https://github.com/inbravo/aws-feature-set#-s3--simple-storage-service) : Object Store
	-	[**Glacier**](https://github.com/inbravo/aws-feature-set#-glacier) : Archive files from S3 into Glacier 
	-	**EFS** : Elastic File Service. It can be attached to multiple EC2 instances
	-	[**Storage Gateway**](https://github.com/inbravo/aws-feature-set#-storage-gateway) : Communicates between your data center and S3 storage
- **Networking & Content Delivery**
	-	[**VPC**](https://github.com/inbravo/aws-feature-set#-vpc) : You can have multiple VPCs per region
	-	[**Route 53**](https://github.com/inbravo/aws-feature-set#-route-53) : Amazon’s DNS Service
	-	[**CloudFront**](https://github.com/inbravo/aws-feature-set#-cloudfront) : Content delivery network. Edge locations cache assets
	-	**Direct Connect** : Connect your physical data centers to AWS using dedicated telephone lines
- **Database Services**
	-	[**RDS**](https://github.com/inbravo/aws-feature-set#-rds--relational-database-service) : Relational Data Services : MySQL, PostgreSQL, SQL Server, MariaDB, Aurora
	-	[**DynamoDB**](https://github.com/inbravo/aws-feature-set#-dynamodb) : Non relational DB
	-	[**Redshift**](https://github.com/inbravo/aws-feature-set#-redshift) : Data warehousing system 
	-	[**ElastiCache**](https://github.com/inbravo/aws-feature-set#-elasticache) : Cloud in-memory DB
- **Migration**
	-	[**DMS**](https://github.com/inbravo/aws-feature-set#-dms--database-migration-service) : Database migration services : Migrate existing DB to Cloud
	-	**SMS** : Server migration services : Migrate existing VM on premise to the Cloud
	-	[**Snowball**](https://github.com/inbravo/aws-feature-set#-snowball) : Transfer Data : Store all your data from enterprise into Snowball and then ship to AWS
- **Analytics**
	-	**Athena** : Allow SQL queries on S3. Run queries on csv files in S3 buckets
	-	**EMR** : Elastic Map Reduce : Process large amounts of data. Based on Hadoop, Apache Spark etc
	-	**Cloud Search** : Managed services provided by AWS
	-	**Elastic Search** : Search service which uses the Elastic product
	-	[**Kinesis**](https://github.com/inbravo/aws-feature-set#-kinesis) : Streaming and analysis real time data. Used for collating large amounts of data streamed from multiple sources
	-	**Data Pipeline** : Move data from one place to another. e.g. S3 into DynamoDB and vice versa
	-	**Quick Sight** : BA tools for rich visualizations and dashboards
- **Management Tools**
	-	[**Cloud Watch**](https://github.com/inbravo/aws-feature-set#-cloudwatch) : Monitor performance of AWS environment 
	-	**Cloud Formation** : Infrastructure into Code
	-	**Cloud Trail** : Audit usage of AWS Resources
	-	**OpsWorks** : Automate deployments using Chef
	-	**Config Manager** : Monitors environments and **provides alerts for events**. e.g. someone creates a security group which is against policy
	-	**Trusted Advisor** : Automated tips for cost & performance optimization, security tips, architecture and design
- **Application Services**
	-	[**API Gateway**](https://github.com/inbravo/aws-feature-set#-api-gateway) : Create secure api service
	-	[**Elastic Transcoder**](https://github.com/inbravo/aws-feature-set#-elastic-transcoder) : Media transcoding in cloud
	-	[**SWF**](https://github.com/inbravo/aws-feature-set#-sws--simple-workflow-service) : Simple workflow service
	-	[**SQS**](https://github.com/inbravo/aws-feature-set#-sqs--simple-queue-service) : Simple queue service
	-	[**SNS**](https://github.com/inbravo/aws-feature-set#-sns--simple-notification-service) : Simple notification service
	-	**SES** : Simple email service
	-	**Step functions** : Visualize Application internals : Which micro services is your application using
	-	**AppStream** : Stream desktop services via browser
- **Mobile Service & IoT**
	-	**Mobile Hub** : For mobile Applications
	-	**Cognito** : Social identity providers for Gmail, Facebook OAuth 
	-	**Device Farm** : Testing your apps across multitude of devices
	-	**Mobile Analytics** : Collect application usage data in a cost-effective way
	-	**Pinpoint** : Collects metrics to help understand the impact of customer communications
	-	**IoT Core** 
	-	**Amazon FreeRTOS**  : An operating system for microcontrollers
	-	**Greengrass** : Lets you run local compute, messaging & data caching
	-	**IoT 1-Click**
	-	**IoT Analytics** : Fully-managed service that makes it easy to run sophisticated analytics
	-	**IoT Button**
	-	**IoT Device Defender**
	-	**IoT Device Management**
- **Desktop and App Streaming**
	-	**WorkSpaces** : Desktop on cloud
	-	**App Stream** : Stream desktop apps to users
	-	**Work Docs** : Store work documents on cloud
	-	**Work Mail** : Exchange on AWS
- **Artificial Intelligence**
	-	**Alexa** (which uses Lambda) + Lex. Echo isn’t required anymore to use Alexa
	-	**Polly** : Text to Speech
	-	**Machine Learning** : AWS will predict outcomes for future decisions based on demographics etc
	-	**Rekognition** : Image recognition, Facial recognition based on Databases
	  
## Global Infrastructure
- A Region is geographical area consisting of 2 or more availability zones.
- Availability zone is logical data center
- Edge Locations are CDN End Points for CloudFront. Many more edge locations exist than regions

<p align="center"><img src="/images/cloudguru/regions.png" width="700"></p>

## ![](/images/aws/iam.png) IAM : [Identity & Access Management](https://aws.amazon.com/iam)

### IAM Resources
- Users 
- Groups 
- Roles 
- Policies (JSON doc which defines one or more permissions)
- Identity Provider (Single Sign On)
	
### IAM Purpose
- Configure who uses AWS and their level of access to the AWS Console
- Centralized control over AWS Account
- Share access for AWS Account
- Granular permissions (grant system privileges) for users / services
- Identity Federation : Facebook, LinkedIn and Active Directory
- Multi-factor authentication (**MFA**)
	- Virtual device
	- Hardware device
- Temporary access to users and services
- Setup password rotation policy
- Integration with other AWS services
- Supports Payment Card Industry Data Security Standard (**PCI-DSS**) compliance

### IAM Features
- IAM is global and its not region specific
- Root account is the email address you use to sign up for AWS
- AWS recommends very limited usage of root account
- Setup Multi Factor Authentication (MFA) on root account
- You can attach permissions to individual users and groups
- Secret access key can be retrieved only once during user creation. In case you lose it then you can re-generate it
- IAM Password policy can be set to access the admin console
- New users have no permissions when first created. Everything has to be explicitly added
- Create new users
	- Access key id and secret access key for programmatic access 
	- User id and password for console access 
- Power User Access allows Access to all AWS services except the management of groups and users within IAM
  
### Manage AWS resources via (Mr. CS : Mister SeaAs)
- **M**anagement console : Using username and password
- **R**EST API : Using Access Key ID and Secret Access Key
- **C**ommand Line Interface (**CLI**) : Using Access Key ID and Secret Access Key
- **S**oftware Development Kit (**SDK**) : Using Access Key ID and Secret Access Key

## ![](/images/aws/ec2.png) EC2 : [Elastic Compute Cloud](https://aws.amazon.com/ec2)

### EC2 Features
- 20 EC2 instance soft limit per region
- On demand. Pay per hour of usage
- EC2 Key Pairs are region specific
- EC2 instances can be accessed either through DNS name or EIP address
- Applications with short term, spiky usage patterns or unpredictable workloads that cannot be interrupted
- Reserved instances
	- Reserve capacity over significant period of time. Significant discount
	- Applications with steady or predictable usage over a period of time. Reserved capacity required
	- Further discount if upfront payment
- Spot instances
	- When bid price is higher than Spot price, then you can provision it. When it goes lower, instance is terminated
	- **If AWS terminates instance, you are not charged for partial hour. If you terminate, you will be charged for the hour**
	- Applications that are feasible only at very low compute prices. e.g. pharma simulations
	- Applications with urgent computing capacity
- Dedicated instances
	- Pay by hour
	- Massive discount for reserved instances over a long period of time – upto 70% for 3 years
	- Useful for regulatory requirements
	- Certain licensing agreements prevent usage on virtual machine / multi-tenancy deployments
  
### EC2 Instance types
|Sr. No| Family| Specialty| Use Case| Type|
| ------------- |:-------------:| -----:|-----:|-----:|
|1 |D2 |Dense Storage | File Servers / DWH / Hadoop | Storage Optimized|
|2| R4. R3| Memory Optimized|Memory Intensive / DBs|Memory Optimized|
|3|M4. M3|General Purpose|Application Servers|General Purpose|
|4|C4, C3|Compute Optimized|CPU Intensive Apps, DBs|Compute O|
|5|G2|Graphics Intensive|Video Encoding / 3D Application Streaming||
|6|I2|High speed storage (IOPS)|NoSQL DBs, DWH||
|7|F1|Field Programmable Gate Array|Hardware acceleration of Code||
|8|T2|Lowest Cost, General Purpose|Web Servers/ Small DBs| General Purpose|
|9|P2|Graphics / General Purpose GPU[Parallel Processing]|Machine Learning / Bit Coin Mining.| |
|10|X1|Memory Optimized|SAP HANA / Apache Spark| - |

### EC2 Instance type Acronym (**DR MC GF PX IT**)  	
- **D** : Density
- **R** : RAM 
- **M** : Main Choice for Apps
- **C** : Compute
- **G** : Graphics
- **F** : FPGA
- **P** : Graphics, Pics, Parallel Processing
- **X** : Extreme Memory
- **I** : IOPS
- **T** : Cheap T2

### EC2 Security Groups
- By default EC2 is in **DENY ALL** mode. You need to open ports using security groups
- Security groups can never **DENY**
- Security groups allways **ALLOWS**
- A security group is a virtual firewall
- Security Group 	: First line of defense
- Network ACLs 		: Second line of defense
- Single instance can have multiple security groups
- Each security group only "allows" inbound traffic,  hence there will never be a conflict on security group rules
- Security group changes are applied immediately
- Security groups are **Stateful**
- Network ACLs are **Stateless**
- All inbound traffic is **Blocked** by default
- All outbound traffic is **Allowed** by default
– Rules added as inbound rules. Automatic outbound rules are added
- Only allow rules, no deny rules exist
- Use network ACLs to deny specific IPs
- Any number of EC2 instances in a security group
- EC2 instances in the default security group can communicate with each other
- Multiple security groups can be attached to an instance

### EC2 Status Checks
- System Status Checks
	- Monitor the AWS systems required to use your instance to ensure they are working properly
	- These checks detect problems with your instance that require AWS involvement to repair
	- When a system status check fails, you can choose to wait for AWS to fix the issue, or you can resolve it yourself
	- Example, by stopping and starting an instance, or by terminating and replacing an instance
	- The following are examples of problems that can cause system status checks to fail:
		- Loss of network connectivity
		- Loss of system power
		- Software issues on the physical host
		- Hardware issues on the physical host that impact network reachability
- Instance Status Checks
	- Monitor the software and network configuration of your individual instance
	- These checks detect problems that require your involvement to repair
	- When an instance status check fails, typically you will need to address the problem yourself
	- Example, by rebooting the instance or by making instance configuration changes
	- The following are examples of problems that can cause instance status checks to fail:
		- Failed system status checks
		- Incorrect networking or startup configuration
		- Exhausted memory
		- Corrupted file system
		- Incompatible kernel

### AWS CLI Usage
- Users can login with Access Key ID and Secret Access Key. If anything is compromised, you can regenerate the secret access key
- Also you can delete the user and recreate
  
### EC2 IAM Roles
- Avoid using user credentials on servers
- IAM roles can be assigned/replaced to existing EC2 instances using AWS CLI. Not through the console
- A trick is to assign policies to the existing role. This will avoid the need to create new instances
- Role assigned to instance is stuck to the lifetime of the instance, until you delete the role. Easier to modify existing role by adding / removing policies
- Roles are universal. Applicable to all regions
  
### Bootstrap Scripts
- Scripts can be passed on to the EC2 instance at first boot time as part of user-data
  
### EC2 Instance Meta-Data
- curl [http://169.254.169.254/latest/meta-data/](http://169.254.169.254/latest/meta-data)
- Instance information is available in Meta-Data. Not in User-Data
  
### EC2 Auto Scaling
- Before you can create Auto scaling group you need to create a launch configuration
- Launch config
	- Name
	- AMI
	- AMI type
	- Bootstrap script
- Launch Configuration : Select AMI, Instance Type, Bootstrap script
- No actual instances are created just with launch configuration
- Auto scaling group : set minimum size, spread it over subnets (AZs) : select all available AZs
- Minimum size and Launch config is must for Auto scaling
- Run health checks from ELB
- Configure Auto scaling policy, based on alarm take action. Trigger a new instance creation when CPU Utilization is greater than 90% for 5 minutes
- You can also delete instance based on alarms
- When Auto scaling group is launched it creates the instances based on definition
- Auto Scaling Types (**MMSD**)
	- Maintain current levels
	- Manual
	- Scheduled
	- Dynamic 
  
### EC2 Placement Groups
- Logical grouping of instances within a single AZ
- Instances can participate in low latency, 10 GBPs network

<p align="center"><img src="/images/cloudguru/ec2.png" width="700"></p>

## ![](/images/aws/ebs.png) EBS : [Elastic Block Storage](https://aws.amazon.com/ebs)

### EBS Features
- Block based storage
- You can install OS, Database on it, unlike S3
- Placed in specific AZ. Automatically replicated within the AZ to protect from failure.
- You cannot mount 1 EBS volume to multiple EC2 Instances. Use EFS instead
- EBS Root Volumes can be encrypted on custom AMIs only. Not on the default available AMIs. To encrypt root volumes, create a new AMI and encrypt root volume. You can also encrypt using 3rd party software like Bit Locker
- EC2 – 1 subnet equals 1 Availability Zone.
- Default VPC & Security group is created in when you create your account.
- Default CloudWatch monitoring – every 5 mins. Can enabled advanced monitoring to check at interval of each minute
- Volume : Virtual Hard Disk
- Tag everything on AWS
- Default Linux EC2 username is ec2-user
- Default Windows EC2 username is Administrator
- Termination protection is turned off by default. You need to turn it on
- When instance is terminated, root volume is deleted. You can turn if off
- System Status Check – Overall health of hosting infrastructure. If they arise, Terminate instance and recreate
- Instance Status Check – Health of instance. If they arise, reboot the instance
- Zonal replication only
- **AWS does not performs backup of data on virtual disks**

### EBS Volume Types
- SSD Drives
	- (root volume) General Purpose SSD – up to 10,000 IOPS. 3 IOPS per GB. Balances price and performance. You can burst upto 3000 IOPS for 1GB
	- (root volume) Provisioned SSD – when you need more than 10,000 IOPS. Large RDBMS DBs and NoSQL DBs. Up to 20000 IOPS now
- Magnetic Drives
	- HDD (root volume) : Magnetic (Standard) – *Cheapest bootable EBS volume type*. Used for apps where data is less frequently accessed and low cost is important
	- HDD Throughput Optimized : ST1 – Required for data written in sequence. Big Data, DWH, Log processing. Cannot be used as boot volumes
	- HDD : Cold : SC1 – Data that isn’t frequently accessed. e.g. File Server. Cannot be used as boot volume

<p align="center"><img src="/images/cloudguru/ebs-types.png" width="700"></p>
	
### Volumes & Snapshots
- Volumes are virtual hard disks
- You can attach volume to EC2 instance belonging to same AZ
- To Detach a volume from EC2 instance, you have to umount it first
- Snapshots are point in time copies of volumes – stored in S3. Taking first snapshot takes a while
- Subsequent snapshots will only store the delta in S3. Only changed blocks are stored in S3
- You can create volumes from Snapshots. During this you can also change Volume Storage Type
- Volume is just block data. You need to format it create specific file system e.g. ext4
- Root Volume is one where OS is installed / booted. It is not encrypted by default on AWS AMIs
  
### RAID, Volumes & Snapshots
- RAID 0 – Striped, No Redundancy , Good Performance – No Backup/Failover
- RAID 1 – mirrored, Redundancy
- RAID 5 – Good for reads, bad for writes. AWS doesn’t recommend using RAID 5 on EBS
- RAID 10 – Raid 0 + Raid 1
- Use RAID Arrays when a single volume IOPs are not sufficient for your need e.g. Database. Then you create RAID Array to meet IOPs requirements
- To take snapshot of RAID Array
	- Stop the application from writing to cache and  flush all cache to Disk
	- Freeze the file system
	- Umount the RAID Array
	- Shutdown the EC2 instance
- Snapshots of encrypted volumes are encrypted automatically
- You can copy snapshot to another region while encrypting it
- Create Image from snapshot
- The EC2 instance thus created will have root volume encrypted.
- You can’t share encrypted snapshots as the encryption key is tied to your account

## EBS Backed v/s Instance store
- You can reboot or terminate instance store backed EC2 VMs
- You can start/stop/reboot/terminate EBS backed EC2 VMs
- EC2 instance on instance store is lost if host hypervisor fails. Not so with EBS backed instances
- EBS volumes can be attached / detached to EC2 instances. One at a time
- EBS backed AMI is from EBS snapshot
- Instance store back volume is from template in S3. Hence slower to provision
- You will not lose data is you reboot for both
- With EBS, you can ask AWS not to delete the volume upon instance termination

## ![](/images/aws/s3.png) S3 : [Simple Storage Service](https://aws.amazon.com/s3)

### S3 Storage Types
- S3-Standard : Durability of **Eleven Nine** (99.999999999%) and availability of **Four Nine** (99.99%)
- S3-IA (Infrequently Accessed) : Durability of **Eleven Nine** (99.999999999%) and availability of **Three Nine** (99.9%)
- S3-RRS (Reduced Redundancy Storage) : Durability and availability of **Four Nine** (99.99%) (**Not suitable for critical data**)

|Type |D|A|
|----|----|----|
|S3|11|4|
|IA|11|3|
|RRS|4|4|

### S3 Buckets
- S3 Namespace is global. Names must be unique globally
- A bucket name in any region should only contain lower case characters. It has to be DNS Compliant
- Object versioning : different versions of the same object in a bucket
- Only Static website can be hosted. Auto scaling, Load Balancing etc. all managed automatically
- You can tag buckets (or any AWS resoruce) to track costs. Tags consist of keys and (optional) value pairs
- Lifecycle management of objects can be set. e.g. move to Glacier after 30 days
- Every bucket created, object uploaded is private by default
- Object Permissions : Access to Object ACLs
- Prefix in bucket is a folder in the bucket
- Minimum file size requirement on S3 bucket is 0 byte
- Max 100 S3 buckets per account by default
- S3 objects can range from **0 bytes** to **5 terabytes**
- The largest object that can be uploaded in a single PUT is **5 gigabytes**
- For objects larger than **100 megabytes**, use Multipart Upload

### S3 Security
- By default all newly created buckets are **Private**
- Control Access to buckets using
  - Bucket Policies : Bucket wide
  - Access Control List (**ACL**) : Up to individual objects
- S3 buckets can log all access requests to another S3 bucket even another AWS account
  
### S3 Encryption Types
- In Transit 
	- Secured using SSL/TLS encryption
	- HTTPS is an Example of it
- In Rest 
	- Client Side (CSE) : Encrypt data at client side and then upload to S3
	- Server Side Encryption (SSE)
		- SSE–S3
			- S3 Managed Keys
			- Employing MFA
			- AS-256 encryption is employed
		- SSE–KMS
			- AWS KMS Managed Keys
			- Similar to SSE–S3 but provises added benefits
			- Uses Envelop Key
			- Provides audit trail
		- SSE-C 
			- Uses customer provided keys

### S3 Versioning
- Once versioning is turned on it cannot be removed. It can only be suspended
- To remove versioning, you have to create a new bucket and transfer all files from old to new
- For newer version of an object, you still have to set permissions to allow access. It is disabled by default even if previous version is public
- All versions of the file add up to the storage. Hence for larger objects, ensure that there is some lifecycle versioning in place
- Version deleted cannot be restored
- Object deleted can be restored – Delete the Delete marker
- Versioning is a good backup tool
- MFA can be setup for delete capability for object/bucket for versioning

### S3 Cross Region Replication
- To allow for cross region replication, the both source and target buckets must have versioning enabled
- When cross region replication is enabled, all existing objects in the bucket are not copied over to replica site
	- Only Updates to existing objects and newer objects are replicated over
	- All previous versions of the updated objects are replicated
- Permissions are also replicated from one bucket to another
- Transitive replications do not work. e.g. if you setup bucket C to replicate content from bucket B which replicates content from bucket A 
	– Changes made to bucket A will not get propagated to C
	- You will need to manually upload content to bucket B to trigger replication to C
- Delete markers are replicated
- If you delete source replication bucket objects, they are deleted from replica target bucket too. When you delete a Delete marker or version from source, that action is not replicated

### S3 Transfer Acceleration
- It utilizes the **CloudFront Edge Network** to accelerate uploads to S3
- Instead of uploading directly to S3, you can use a distinct URL to upload directly to an edge location which will then transfer to S3 using Amazon’s backbone network
- The farther you are from S3 bucket region the higher is the improvement you can observe using S3 Transfer Acceleration
- High cost for usage than standard S3 transfer rates
  
### S3 Lifecycle Management
- Objects stored in Glacier incur minimum 90 day storage cost
- Lifecycle management can be used in conjunction with versioning
- Lifecycle management can be applied to all versions of an object
- Objects can be transitioned to S3-IA after 30 days of creation date
- Objects can be transitioned to Glacier after 30 days of moving to S3-IA 
- You can also permanently delete objects

## ![](/images/aws/glacier.png) [Glacier](https://aws.amazon.com/glacier)
- For archival only. Takes 3 to 5 hours to restore files. Durability of Eleven Nine (99.999999999%)

<p align="center"><img src="/images/cloudguru/s3-vs-glacier.png" width="700"></p>
  
## ![](/images/aws/storagegateway.png) [Storage Gateway](https://aws.amazon.com/storagegateway) 

### Storage Gateway Features
- It is a service which connects an on-premises software appliance (virtual) with cloud based storage 
- Installed at hipervisor running in your on-premises data center
- It provides seamless and secure connectivity either via internet or direct connect
- It can also provide connectivity from EC2 instance in VPC to S3 via Storage Gateway in same VPC
- The virtual appliance will asynchronously replicate information up to S3 or Glacier
- Can be downloaded as a VM  VMware ESXi / Hyper-V

#### File Gateway (**NFS**) 
- Store files in S3  Word, Pictures, PDFs
- Accessed using network file system (NFS)

<p align="center"><img src="/images/cloudguru/file-gateway.png" width="700"></p>

#### Volume Gateway (**iSCSI**) 
- Block based storage
- Presents applications with disk volumes using iSCSI protocol
- They take virtual hard disks on premise and back them up to virtual hard disks on AWS
- Data written to these volumes can be asynchronously backed up as point in time snapshots
- Point in time snapshots, called Elastic Block Store (**EBS**) snapshots
- Types
	- Stored Volumes
		- First store localy and then move to AWS S3 in async mode
	- Cached Volumes
		- Only latest data stays on-prem
		- Rest on AWS S3
	
<p align="center"><img src="/images/cloudguru/volume-gateway.png" width="700"></p>
<p align="center"><img src="/images/cloudguru/volume-gateway-cached.png" width="700"></p>
	
#### Volume Tape Gateway (**VTL**) 
- Create tapes and send to S3
- Gateway Virtual Tape Library (VTL) : Backup and Archiving solution
- You can use existing backup applications like NetBackup, Backup Exec and Veeam etc

<p align="center"><img src="/images/cloudguru/tape-gateway.png" width="700"></p>
	
## ![](/images/aws/snowball.png) [Snowball](https://aws.amazon.com/snowball) 

### Snowball Features
- Physical data transfer solution
- Next version of Import / Export Disk
- You could accelerate moving large amounts of data into and out of AWS using portable storage devices for transport
- Ship the storage device : no need to transfer over the internet. Problem arose with different types of disks

### Snowball Standard 
- Bigger than briefcase sized storage devices
- Petabyte scale data transport solution used to transfer data in/out of AWS
- Cost is 1/5th as compared to transfer via high speed internet
- 80TB snowball available
- Multiple layers of security to protect data. Tamper resistant enclosure, 256-bit encryption
- Once data is transferred, AWS performs software erasure of Snowball appliance

<p align="center"><img src="/images/cloudguru/snowball-std.png"></p>

### Snowball Edge
- 100 TB data transfer device which has onboard storage and compute capabilities
- Move large amounts of data in and out of AWS, as a temporary storage tier for large local datasets
- You can run Lambda functions
- Devices connect to existing applications and infrastructure using standard storage interfaces
- Snowball Edges can be clustered together to process your data on premise

<p align="center"><img src="/images/cloudguru/snowball-edge.png"></p>

### Snowball Device difference

|Use case |Snowball Standard|Snowball Edge|
|----|----|----|
|Import data into Amazon S3|✓|✓
|Copy data directly from HDFS|✓|	
|Export from Amazon S3|✓|✓
|Durable local storage||✓
|Use in a cluster of devices||✓
|Use with AWS Greengrass (IoT)||✓
|Transfer files through NFS with a GUI||✓

### Snowmobile
- Massive 45 foot long ruggedized shipping container, pulled by a truck
- 100 PB per Snowmobile
- Petabyte or Exabyte of data that has to be transferred to AWS
- You can use it for data center migration
- Snowball import/export to/from S3 : If using Glacier first need to import into S3 and then into Snowball

<p align="center"><img src="/images/cloudguru/snowball-mobile.png"></p>

## ![](/images/aws/edge.png) Edge Location 

### Edge Location Features
- location where content will be cached
- Different from AWS Region/AZ
- Nearest Edge Location will be used to send the cached object, to reduce the content delivery time
	
## ![](/images/aws/cloudfront.png) [CloudFront](https://aws.amazon.com/cloudfront) 

### CloudFront Features
- CDN : Collection of distributed servers where the content is served to users based on the user’s location and the location of content origin
- Origin of of files that CDN will distribute
	- S3 Bucket
	- EC2 Instance
	- Elastic Load Balancer or Route 53
- Create CloudFront CDN Distribution : Consists of Edge locations
	- Provide origin domain points to 
		- S3 bucket
		- ELB or on premise domain
- Distribution Types
	- Web Distribution : Typically used for websites & web content only
	- RTMP : Used for Media (Video) Streaming. Adobe Flash media server’s protocol
- Edge Location objects are cached for life of TTL
	- TTL can be set for 0 seconds to 365 days
	- Default TTL is 24 hours
	- If objects change more frequently update the TTL
- Edge locations are for read and write as well. Objects PUT on edge location are sent to origin
- First request is slow as it comes from source origin
- Subsequent requests improve speed as they are cached in nearest edge location and routed there until TTL expires
- CloudFront also works with non AWS origin which can be on premise as well
- You can clear cached objects, with charges
- Geo-location based restriction can be applied 
- Configure error pages in case of any uncertainty 

<p align="center"><img src="/images/cloudguru/cdn.png" width="700"></p>

### CloudFront Security
- You can force them to use CDN URL instead of S3 DNS
- To restrict bucket access you need to create origin access identity. And allow this user read permission S3 bucket content –
- Set video protocol policy – redirect http to https, http or https
- Allows various HTTP methods – GET, PUT, POST, PATCH, DELETE, and HEAD.
- Restrict viewer access for S3 and CDN using pre-Signed URLs or Signed cookies. E.g. You can view video only using that URL
- Using Web Application Firewalls to prevent SQL injection, CSS attacks
- For https access, you can either use default CloudFront certificate or own certificate can be imported via ACM.
- Provisioning / Updating CloudFront distribution takes up to 15-20 minutes.
- Geo-restriction can be setup. Either whitelist or blacklist – countries from where content can be accessed.
- Invalidating removes objects from CloudFront. It can be forced to remove from Cache – obviously costs
- You can force users to get content via CloudFront after removing read access to S3 bucket
- You can also upload content to CloudFront

## ![](/images/aws/rds.png) RDS : [Relational Database Service](https://aws.amazon.com/rds)  

### RDS Features
- RDS Supported Relational DB Types
	- MS-SQL Server
	- Oracle
	- MySQL
	- PostgreSQL
	- Aurora
	- MariaDB
- RDS Supported Non Relational DB Types
	- CouchDB
	- MongoDB
	- DynamoDB
	- NoSQL storage structure 
		- Collection is Table
		- Document is Row
		- Keys-Value Pairs are Fields
- RDS OLTP vs OLAP
	- OLTP
		- Pulls out specific / narrow record set e.g. order number 1242323
	- OLAP 
		- Pulls in large number of records
		- It used different architecture and infrastructure layer
		- Differ in terms of queries run on top of data
		- OLAP is more about aggregation e.g. Net profit of company from a perticular product selling
- RDS Backups
	- Automated Backups
		- Allows recovery of DB to any point-in-time within a **Retention Period** (1 to 35 days)
		- Full daily snapshot also store transaction logs
		- Enabled by default. Stored in S3. Free backup storage in S3 upto the RDS Instance size
		- You can define backup window. You may experience latency while backup process running (reduced IOPS)
		- Backups are deleted when the RDS Instance is deleted
	- RDS Snapshots
		- Done manually. They are stored even after you delete the instance
		- You can copy snapshots across regions
		- You can publish the snapshot to make it publically available
		- Restoring Backups/ Snapshots : restored version will be a new RDS instance with new end point
		- You can check the instance size to restore
		- You cannot restore to existing instance
- RDS Encryption
	- Encryption at rest is supported for MySQL, SQL Server, Oracle and PostgreSQL & MariaDB
	- Managed by AWS KMS
	- **Cannot encrypt an already present instance**
	- To encrypt, create new instance with encryption enabled and then migrate data to it
- RDS Multi-AZ Deployment for Disaster Recovery
	- A standby copy is created in another AZ
	- AWS handles replication and auto-failover
	- AWS can automatically failover RDS instance to another instance
	- In case of failover, No need to change connection string
	- This can be used for Disaster Recovery (DR) purpose only
	- This option has to be selected at instance creation time
	- This option is not useful for improving performance / scaling
- Maximum 30000 IOPS allowed on a MySQL and Oracle RDS instance
- Maximum 6 TB size allowed on a MySQL and Oracle RDS instance

<p align="center"><img src="/images/cloudguru/rds-multi-az.png" width="700"></p>
<p align="center"><img src="/images/cloudguru/rds.png" width="700"></p>

- RDS Read Replica Databases
	- Different from multi-AZ
	- Async data transfer to another RDS instance. You can actually read from these instances, unlike Multi-AZ deployments
	- Can also have read-replicas up to 5 copies (Watch out as async causes latency)
	- Read-replicas can be used for Dev/Test environments, run certain workloads only against them and not against direct production deployment (Intensive workloads)
	- **NO READ-REPLICAS** : MySQL, MariaDB, PostgreSQL, Aurora
	- **NO READ-REPLICAS** : No Oracle & SQL Server
	- **You cannot have read-replicas that have multi-AZ. However, you can create read replicas of Multi AZ source databases**
	- Read replicas can be of a different size than source DB
	- Each read-replica will have its own DNS end point
	- Automatic backups must be turned on in order to deploy a read replica
	- Read Replicas can be promoted to be their own databases. This breaks replication. e.g. Dev/Test can be connected to the replica by first promoting it as DB itself
	- Read Replicas can be done in a second region for MySQL and MariaDB – no PostgreSQL
	- Application re-architecture is required to make use of Read replicas
	- Read replicas are not used for DR. they are used for performance scaling only
	- All DB supports multi AZ

<p align="center"><img src="/images/cloudguru/rds-read-replica.png" width="700"></p>

## ![](/images/aws/dms.png) DMS : [Database Migration Service](https://aws.amazon.com/dms)

### DMS Features
- Migrate production database to AWS
- AWS manages all complexities of migration process
- Source database remains fully operational
- Can also be used for continuous data replication with high availability
- Both homogenous (Oracle to Oracle) as well as heterogeneous migrations are supported (Oracle to Aurora or Microsoft SQL)
	- **AWS Schema migration tool makes heterogeneous database**  
	- Any code that **can not** be automatically converted is clearly marked so that it can be manually converted
	- Migrations : easy by automatically converting the source database schema and a majority of the custom code
		- Views
		- Stored procedures
		- Functions

## ![](/images/aws/dynamodb.png) [DynamoDB](https://aws.amazon.com/dynamodb)

### DynamoDB Features
- Fast and flexible NoSQL database
- Consistent, single digit millisecond latency
- Fully managed DB 
- Supports both document based & Key-value data models
- Great fit for mobile, IoT, web, gaming etc. applications
- Stored on SSDs
- Stored on 3 geographically distinct DCs (not AZs). Can't put in a specific AZ
- Built in redundancy
- Eventual Consistent Reads
	1. Eventual consistent reads - Consistency reached up to 1 second (default)
	2. Strongly Consistent reads - Consistency reached after writes to all copies are completed. <1 second
- Pricing 
	- Write Capacity Units and Read Capacity Units ($/hr.)
	- Also Storage cost per month. You provision capacity in units/second
	- It can scale on the fly. Provisioned capacity
- You can dynamically add columns without the need to update other rows with the column data. As this is no RDBMS
- Reserved capacity is available for DynamoDB as well
- RDS v/s DynamoDB
	- Use DynamoDB for push button scaling
	- Use RDS to scale horizontally a new instance has to be created
	- DynamoDB is cheap for writes and expensive for reads
	- Observe workload characteristics and decide
	- Use RDS if data requires joins and relationships
	- In RDBMS database structure cannot be dynamically altered. With DynamoDB you can
- Local secondry indexes can be created after creating the table

## ![](/images/aws/redshift.png) [Redshift](https://aws.amazon.com/redshift)

### Redshift Features
- **1024 KB or 1 MB block suze for columner storage**
- Petabyte scale DW solution in cloud. Used for OLAP (Sum of various columns and joining the data)
- Redshift Configurations
	- Single Node : 160 GB Used by Small and Medium Size businesses
	- Multi-Node 
		- Leader Node (handles all incoming connections & receives queries) 
		- Compute Node (store data and perform queries and computations – upto 128 Compute Nodes)
- Redshift Performance
	- Redshift is 10 times faster than usual OLAP systems
	- Allows for massive parallel processing
	- It uses Columnar Data Storage
		- Columnar data is stored sequentially on storage system. Hence low I/O and improved performance
		- Columns have similar type of data. **No Indexes & Views** hence less storage required
		- Advanced Compression (easier to do it via Columns instead of Rows – which have different data types)
		- Based on data, appropriate data compression scheme is used
- Redshift Pricing  
	- Based on Compute Node hours (No Leader Node)
	- Backup and Data Transfer (only within VPC)
- Redshift Security
	- Transit encrypted via SSL
	- At rest using AES-256 encryption
	- Can use your own HSM or default AWSK Key management
- Redshift Availability
	- Currently available in 1 AZ only. Not Multi-AZs. Can restore snapshots to new AZs in the event of an outage
	- Database warehousing service, cheap, faster. Best seller AWS Service
	- Speed achieved due to columnar storage
	- Data stored sequentially on disk – hence faster

## ![](/images/aws/elasticache.png) [ElastiCache](https://aws.amazon.com/elasticache)  

### ElastiCache Features 
- ElastiCache is a web service that makes it easy to deploy, operate and scale an in memory cache on cloud 
- ElastiCache is used if DB is primarily read-heavy and not frequently changing
- Improve performance by avoiding repeated calls to DB
- Improve latency and throughput for read-heavy applications
- Can be used for compute intensive data
- ElastiCache employs two cache engines currently
	- Memcached
		- All Memcached tooling can be easily ported over
		- 20 nodes maximum on a cluster
	- Redis
		- Supports Master / Slave replication and multi-AZ deployment to get redundancy
		- Use Redshift, if application is slow due to constant OLAP transactions on top of OLTP focused DB
		- 1 node maximum on a cluster

## ![](/images/aws/aurora.png) [Aurora](https://aws.amazon.com/aurora)

### Aurora Features 
- MySQL compatible relational data base engine
- 5 times better performance than MySQL. At a fraction of cost as compared to Oracle
- Bespoke Database Engine
- However you can’t download and install on your workstation
- Maintains 2 copies of your data in at least 3 availability zones (6 copies). This is for the Data only not for the instances that runs the database
- 2 copies lost : no impact on write availability
- 3 copies lost : no impact on read availability
- Storage is self-healing. Continous scanning of errors and repaired automatically
- No Free Tier usage available. Also available only in select regions. Takes slightly longer to provision
- Aurora auto scaling
	- Starts with 10 Gb Storage, and scales in 10 Gb increments to 64 Tb. Auto increment of storage
	- No Push button scaling (unlike DynamoDB)
	- Requires maintenance window
- Fault Tolerance
	- Types
		- Aurora replicas 
			- Up to 15 of them
			- If leader crashes, the replica with the highest tiers becomes the leader
			- While creating replicas, remember to assign different tier levels
		- MySQL read replicas
			- Up to 55 of them
			- MySQL read replica can be created from the Aurora source DB
- Points to remember
	- Why you can’t connect to DB Server from DMZ. Check the security group, if it is removed or added
	- Have separate groups for EC2 Instance and RDS Instance
	- Multi-AZ for Disaster Recovery only. Not for performance improvement. For performance improvement use, multiple read-replicas
	- Dynamo DB v/s RDS
		- If you want push button scaling, without any downtown, use DynamoDB
		- Scaling is not so easy with RDS, you have to use a bigger instance or add read replicas (manual process)
	- If you are using Amazon RDS Provisioned IOPS storage with a MySQL or Oracle database engine, what is the maximum size RDS volume you can have by default? – **6TB**
	- What data transfer charge is incurred when replicating data from your primary RDS instance to your secondary RDS instance? - **There is no charge associated with this action**
	- When you have deployed an RDS database into multiple availability zones, can you use the secondary database as an independent read node? – **No**
	- RDS automatically creates RDS Security Group w/ TCP port # 3306 enabled
	- In VPC Security Group, the answer would be YES because you will have manually specify access to port & protocol

## ![](/images/aws/cloudwatch.png) [CloudWatch](https://aws.amazon.com/cloudwatch)

### CloudWatch Features
- Default Metrics : Network, Disk, CPU (NDC) and Status check (Instance and System) 
- Memory : RAM is a custom metric
- You can create custom dashboards all CloudWatch metrics.
- CloudWatch alarms – set notifications when particular thresholds are hit.
- CloudWatch events help you respond to state changes. E.g. run Lambda function in response to.
- CloudWatch logs helps you monitor EC2 instance/application/system logs. Logs send data to CloudWatch
- Standard monitoring 5 mins. Detailed monitoring 1 minute.
- CloudWatch is for logging. CloudTrail is for auditing your calls
- CloudWatch keep 2 weeks of metric data
- CloudWatch metrics provide hypervisor visible metrics

## ![](/images/aws/vpc.png) [VPC](https://aws.amazon.com/vpc)

### VPC Features
- VPC is a logical data center within an AWS Region
- EC2-Classic was used before arrival of **VPC**
- Earlier AWS accounts still support EC2-Classic, and can launch instances into either EC2-Classic or a VPC
- Control the outbound traffic from your instances (egress filtering) in addition to controlling the inbound traffic to them (ingress filtering) 
- If your account supports the EC2-VPC platform only, it comes with a default VPC that has a default subnet in each Availability Zone
- Each instance that you launch into a default subnet has a **private** IPv4 address and a **public** IPv4 address
- Control over network environment, select IP address range, subnets and configure route tables and gateways
- **VPC can not span regions
- **VPC can span AZs but Subnet cant span AZ**
- The default limit for the number of Amazon VPCs that a customer may have in a region is 5
- **IPsec** is the security protocol supported by Amazon VPC
- Can create public facing subnet (Web) having internet access and private facing subnet (DB) with no internet access
- Attaching an ENI associated with a different subnet to an instance can make the instance dual-homed
- Classless Inter-Domain Routing (**CIDR**) is used to configure available IP in a subnet(Example 10.0.0.0/32, 32 is CIDR)

#### Accessing the Internet
- Default VPC
	- Your default VPC includes an internet gateway
	- Each instance that you launch into a default subnet has a private IPv4 address and a public IPv4 address
	- These instances can communicate with the internet through the internet gateway (**IGW**)
	- An internet gateway enables your instances to connect to the internet through the Amazon EC2 network edge

<p align="center"><img src="/images/aws/default-vpc-diagram.png" width="700"></p>

- Custom VPC
	- By default, each instance that you launch into a nondefault subnet has a private IPv4 address, but no public IPv4 address
	- Unless you specifically assign one at launch, or you modify the subnet's public IP address attribute
	- **These instances can communicate with each other, but can't access the internet**
	- These instances can communicate with the internet through the internet gateway (**IGW**)
	- You can enable internet access for an instance launched into a nondefault subnet by **attaching an internet gateway to its VPC and associating an Elastic IP address** with the instance
	- Alternatively, to allow an instance in your VPC to initiate outbound connections to the internet but prevent unsolicited inbound connections from the internet, you can use a network address translation (**NAT**) **device for IPv4 traffic**
	- Can’t attached multiple internet gateways to the VPC to boost performance
	
<p align="center"><img src="/images/aws/nondefault-vpc-diagram.png" width="700"></p>

- Network Address Translation (NAT) and Port Address Translation (PAT)
	- **Only IPV4 and no IPV6**
	- Use a NAT device to enable instances in a private subnet to connect to the Internet. For example, for software updates
	- **NAT devices help to prevent the Internet from initiating connections with the instances**
	- A NAT device forwards traffic from the instances in the private subnet to the Internet or other AWS services, and then sends the response back to the instances
	- When traffic goes to the Internet, the source IPv4 address is replaced with the NAT device’s address and similarly, when the response traffic goes to those instances, the NAT device translates the address back to those instances’ private IPv4 addresses
	- NAT devices are not supported for IPv6 traffic. Use an egress-only Internet gateway instead
	- Actual role of a NAT device is both address translation and port address translation (PAT)
	- AWS offers two kinds of NAT devices. a NAT gateway or a NAT instance
		- NAT Instance is one EC2 instance. Search NAT in AMI market place and select NAT ready EC2 instances
		- NAT Gateway is a managed service, which is just came in to replace NAT instances
		- You are responsible for performance management, scale out and security groups
		- On NAT instance, **Remember to disable source/destination IP check**. This is required to allow private subnet internet connectivity. This is not required on NAT Gateway
		- Allow both HTTP and HTTPS access on security groups associated with NAT instances
		- Security groups are always associated with NAT Instances
		- Both **NAT Instance and NAT Gateways are deployed to public subnet**
		- Elastic IP has to be added to NAT Instance
		- NAT Gateway is automatically assigned a public IP
		- In VPC, update default route table to allow connectivity from Private subnet to NAT Instance and Gateway
		- NAT instance is single point of failure. You can place NAT instance behind Auto Scaling group, multiple subnets in different AZs and scripted failover
		- To improve performance increase the size of the NAT instance to allow for higher throughput
		- You can use Network ACLs to control traffic for both NAT Instance and Gateway
		- **NAT Gateways scale up to 10GBps**. No need to disable source/ destination checks on Gateways

<p align="center"><img src="/images/cloudguru/nat.png" width="700"></p>

#### Subnet Features
- Each subnet is always mapped to an availability zone (AZ)
- Public Subnet : Web Servers/ Jump Boxes
- Private Subnet : Applications Servers / Database servers
- AWS gives a maximum of /16 (32-16 = 16 available IP) IPs in a subnet
- AWS gives a minimum of /28 (32-28 = 4 available IP) IPs in a subnet
- First four IP addresses and the last IP address in each subnet CIDR block are not available for you to use
- For example, in a subnet with CIDR block 10.0.0.0/24, the following five IP addresses are reserved:
	- 10.0.0.0	: Network address
	- 10.0.0.1	: Reserved by AWS for the VPC router
	- 10.0.0.2	: Reserved by AWS. The IP address of the DNS server is always the base of the VPC network range plus two
	- 10.0.0.3	: Reserved by AWS for future use
	- 10.0.0.255: Network broadcast address
	
#### Security groups, Network ACLs
- **Security groups, Network ACLs, Route Tables can span subnets/AZs**
- Each subnet must be assocaited with a ACL, if subnet is not associated with a ACL, this subnet will be automatically asssociated with default network ACL
- Leverage multiple layers of security to control access to EC2 instances
	- Security groups **STATEFUL** (SF)
	- Network ACLs **STATELESS** (AL) : separate inbound and outbound rules 
- Security group
	- Set of firewall rules to control the traffic to your instance
- Network ACLs
	- VPC comes with a default ACL (default ACL allows all inbound/outbound traffic)
	- User created custom ACL defaultly deines all inbound/outbound traffic
- AWS Recommends adding ACL rules in increments of 100s
- Ephemeral ports : allow inbound /outbound traffic from 1024–65535. As clients can initiate outbound connection from any random port. Ports < 1024 reserved for super user access
- **If you have to block a specific IP address / range, use ACLs instead of security groups. SGs can’t deny traffic (they only allow)**

|Security Group| Network ACL|
|-------------|-------------| 
|Operates at the instance level (first layer of defense)| Operates at the subnet level (second layer of defense)|
|Supports allow rules only| Supports allow rules and deny rules|
|Is stateful: Return traffic is automatically allowed, regardless of any rules| Is stateless: Return traffic must be explicitly allowed by rules|
|We evaluate all rules before deciding whether to allow traffic| We process rules in number order when deciding whether to allow traffic. Lower order rules take effect in case of conflict with higher order rules.|
|Applies to an instance only if someone specifies the security group when launching the instance, or associates the security group with the instance later on| Automatically applies to all instances in the subnets it's associated with (backup layer of defense, so you don't have to rely on someone specifying the security group)|

<p align="center"><img src="/images/cloudguru/security-group.png" width="700"></p>

#### Virtual Private Network (VPN), Interet Gateway (IGW), Route Table
- Create hardware VPN connection between your local DC and AWS
- AWS VPC endpoint enables you to create a private connection between your Amazon VPC and another AWS service without requiring access over the Internet or through a NAT device, VPN connection, or AWS Direct Connect
- VPC endpoint for sending traffic directly to Amazon S3 using S3 gateway
- Route table specifies how packets are forwarded between the subnets within VPC, internet and VPN 
- **Route table contains a route from IP : 0.0.0.0/0** to default IGW for allowing accesss of subnet to internet
- Only one internet gateway per VPC
- **ENI for dual homes instances**

#### VPC Configuration
- VPC types 
	- Default VPC
		- VPC comes with a default Network ACL
		- When you create an account a default VPC is created for you in each Region
		- All subnets in default VPC have a route out to the internet
		- Each EC2 instance in default VPC will have a public and private IP address
		- If you delete default VPC, only way to restore it is by contacting Amazon
	- Custom VPC
		- **Default Security group, network ACL & route table (NRS) are created for each custom VPC you create**
		- Doesn’t create Subnets or Internet Gateways (IGW) out of the box
		- In each VPC you create, 5 IP addresses are reserved by AWS for itself. First 4 and last IP in the CIDR block
		- You can't change the size of a VPC after you create it
		- If your VPC is too small to meet your needs, create a new, larger VPC, and then migrate your instances to the new VPC 
			- To exactly replicate the old VPC, create AMIs from your running instances, and then launch replacement instances in your new, larger VPC
			- You can then terminate your old instances, and delete your smaller VPC
			- When creating VPCs do not modify default route table to add your custom rules. If you modify the default route, it will affect all instances
		- **Create a new route table for customization**

<p align="center"><img src="/images/cloudguru/vpc.png" width="700"></p>

#### DHCP Options Sets
- The Dynamic Host Configuration Protocol (DHCP) provides a standard for passing configuration information to hosts on a TCP/IP network
- The **options** field of a DHCP message contains the configuration parameters. Some of those parameters are the domain name, domain name server, and the netbios-node-type
- DHCP options sets are associated with your AWS account so that you can use them across all of your virtual private clouds (VPC)

#### VPC Samples

##### Scenario 1: VPC with a Single Public Subnet
- A VPC with a size /16 IPv4 CIDR block (example: 10.0.0.0/16). This provides 65,536 private IPv4 addresses
- A subnet with a size /24 IPv4 CIDR block (example: 10.0.0.0/24). This provides 256 private IPv4 addresses
- An Internet gateway. This connects the VPC to the Internet and to other AWS services
- An instance with a private IPv4 address in the subnet range (example: 10.0.0.6), which enables the instance to communicate with other instances in the VPC
- An elastic IPv4 address (example: 198.51.100.2), which is a public IPv4 address that enables the instance to be reached from the Internet
- A custom route table associated with the subnet. The route table entries enable instances in the subnet to use IPv4 to communicate with other instances in the VPC, and to communicate directly over the Internet
- A subnet that's associated with a route table that has a route to an internet gateway is known as a public subnet

<p align="center"><img src="/images/aws/vpc-1.png" width="700"></p>

##### Scenario 2: VPC with Public and Private Subnets (NAT)
- A VPC with a size /16 IPv4 CIDR block (example: 10.0.0.0/16). This provides 65,536 private IPv4 addresses
- A public subnet with a size /24 IPv4 CIDR block (example: 10.0.0.0/24). This provides 256 private IPv4 addresses
- A public subnet is a subnet that's associated with a route table that has a route to an Internet gateway
- A private subnet with a size /24 IPv4 CIDR block (example: 10.0.1.0/24). This provides 256 private IPv4 addresses
- An Internet gateway. This connects the VPC to the Internet and to other AWS services
- Instances with private IPv4 addresses in the subnet range (examples: 10.0.0.5, 10.0.1.5). This enables them to communicate with each other and other instances in the VPC
- Instances in the public subnet with Elastic IPv4 addresses (example: 198.51.100.1), which are public IPv4 addresses that enable them to be reached from the Internet. The instances can have public IP addresses assigned at launch instead of Elastic IP addresses. Instances in the private subnet are back-end servers that don't need to accept incoming traffic from the Internet and therefore do not have public IP addresses; however, they can send requests to the Internet using the NAT gateway
- A NAT gateway with its own Elastic IPv4 address. Instances in the private subnet can send requests to the Internet through the NAT gateway over IPv4 (for example, for software updates)
- A custom route table associated with the public subnet. This route table contains an entry that enables instances in the subnet to communicate with other instances in the VPC over IPv4, and an entry that enables instances in the subnet to communicate directly with the Internet over IPv4
- The main route table associated with the private subnet. The route table contains an entry that enables instances in the subnet to communicate with other instances in the VPC over IPv4, and an entry that enables instances in the subnet to communicate with the Internet through the NAT gateway over IPv4

<p align="center"><img src="/images/aws/vpc-2.png" width="700"></p>

##### Scenario 3: VPC with Public and Private Subnets and AWS Managed VPN Access
- A virtual private cloud (VPC) with a size /16 IPv4 CIDR (example: 10.0.0.0/16). This provides 65,536 private IPv4 addresses
- A public subnet with a size /24 IPv4 CIDR (example: 10.0.0.0/24). This provides 256 private IPv4 addresses. A public subnet is a subnet that's associated with a route table that has a route to an Internet gateway
- A VPN-only subnet with a size /24 IPv4 CIDR (example: 10.0.1.0/24). This provides 256 private IPv4 addresses
- An Internet gateway. This connects the VPC to the Internet and to other AWS products
- A VPN connection between your VPC and your network. The VPN connection consists of a virtual private gateway located on the Amazon side of the VPN connection and a customer gateway located on your side of the VPN connection
- Instances with private IPv4 addresses in the subnet range (examples: 10.0.0.5 and 10.0.1.5), which enables the instances to communicate with each other and other instances in the VPC
- Instances in the public subnet with Elastic IP addresses (example: 198.51.100.1), which are public IPv4 addresses that enable them to be reached from the Internet. The instances can have public IPv4 addresses assigned at launch instead of Elastic IP addresses. Instances in the VPN-only subnet are back-end servers that don't need to accept incoming traffic from the Internet, but can send and receive traffic from your network
- A custom route table associated with the public subnet. This route table contains an entry that enables instances in the subnet to communicate with other instances in the VPC, and an entry that enables instances in the subnet to communicate directly with the Internet
- The main route table associated with the VPN-only subnet. The route table contains an entry that enables instances in the subnet to communicate with other instances in the VPC, and an entry that enables instances in the subnet to communicate directly with your network

<p align="center"><img src="/images/aws/vpc-3.png" width="700"></p>

### ELB
- ELB types
	- Application Load Balancer : HTTP/HTTPS
	- Network Load Balancer : TCP
	- Classic Load Balancer : HTTP/HTTPS/TCP
- ELB supports Internet-facing or Internal load balancing
- To have HA in general or for ELB, ensure that you have at-least 2 public and or private subnets in different availability zones
- Create ELB also requires to configure security 

<p align="center"><img src="/images/cloudguru/elb.png" width="700"></p>

#### Bastion
- You cannot use NAT instance to SSH / RDP into private subnet. For that **Bastion** (Jump Box) is required
- Bastions are used for secure administrative tasks only
- Bastions are placed in Public subnets and connect to private subnets via private IP
- For Bastion HA, have multiple Bastions in different AZs (At least 2 public subnets). Auto scaling in multiple AZ, route 53 doing health checks
- NAT instance is used to provide internet connectivity to private subnets

<p align="center"><img src="/images/cloudguru/bastion.png" width="700"></p>
  
#### VPC Flow Logs
- Enable Flow Logs for Custom VPC to see all traffic
- Enable to capture IP traffic flow information for the NICs of your resources. All information is reported to CloudWatch
- Create IAM role to allow all logs to flow into CloudWatch
- Create log group in CloudWatch and inside that create stream where you can then see all the traffic flow

## ![](/images/aws/53.png) [Route 53](https://aws.amazon.com/route53)

### Route 53 Features
- **No load balancing and only health monitoring**
- Upto 512 KB use UDP and then use TCP
- Convert human friendly domain names into IP addresses
- IP6 (128 bits) : created to address IP address exhaustion in IP4 (32 bit)
- VPCs are now IP6 compatible
- Top level domains e.g. .com or .edu etc
- Second level domains e.g. yahoo out of yahoo.com etc
- Domain Registrars assign domain names under one or more top level domain names e.g. godaddy.com is a registrar
- Costs around 125$ per month
- TTL (time to live)
	- Cache the DNS record for TTL seconds
	- Length that a DNS record is cached on either resolving server or users own local computer
- Hosted Zone
	- Collection of resource that holds the information that how you wants to route traffic for a domain (example.com)
	- A hosted zone represents resource record sets that are managed together under a single domain name
	- NS, SOA, CNAME, Alias etc. types of records for a particular domain e.g. [DNS Lookup](https://www.tcpiputils.com/dns-lookup/google.com/ALL)
	- Types	
		- Private : how you want to route traffic within VPC
		- Public : how you want to route traffic on internet
	- When a hosted zone for your domain will be created, you will be given four DNS endpoints called **delegation set**
	- These endpoints should to be updated in your domain names nameserver section 
- DNS Record Types
	- SOA (Start of Authority)
		- Provides all zones information
		- Provides server information which provides data for the zone
		- The administrator of zone
	- NS (Name Server)
		- Used by top level domain servers to direct traffic to content DNS server
		- Content DNS server contains the authoritative DNS records
		- AWS is now a domain registrar as well
	- A (Address)
		- Fundamental DNS record which is used to translate name of a domain to the IP address 
	- AAAA (A represents 32 bit; 4A = 4*32 = 128)
		- Ipv6
	- CNAME 
		- Canonical name
		- Resolve one domain name to another
		- Can’t use CNAME for naked domains
	- ALIAS 
		- Only on AWS 
		- Works like CNAME
		- Used to map resource record sets in your hosted zone to ELBs, Cloud Front Distribution, or S3 buckets that are configured as websites
		- You can have DNS names which point to ELB domain names w/o the need for changing IP when ELB Ip changes
		- Route 53 automatically recognizes changes in the record sets
		- Most common usage : map naked domain name (zone apex) to ELB names
		- Always use Alias (v/s CNAME) as Alias has no charges
		- Answering CNAME queries has a cost on Route53
	- PTR
		- For reverse DNS (IP to DNS names)
- Route 53 Routing Policies (DLF GW : DLF Gurgaon)
	1. Simple (default) : When a single resource performs function for your domain, only one webserver serves content
	2. Weighted 
		- Send x% of traffic to site A and remainder (100 – x) % of it to site B. Need not be two different regions. Can be even two different ELBs
		- This traffic split is over length of day not based on number of individual subsequent requests
		- Weights – a number between 0 and 255. Route53 calculates auto %age
		- AWS Takes Global view of DNS. Not local / ISP view
		- A/B testing is perfect use case for Weighted Routing policy
	3. Latency 
		- Allows you to route traffic based on lowest network latency for your end user. To the region which gives fastest response time
		- Create record set for EC2 or ELB resource in each region that hosts website. When R53 receives a query it will then determine response based on lowest latency
		- How will the users get the best experience? it is evaluated dynamically by R53
	4. Failover 
		- When you want to create an active/passive setup
		- Disaster Recovery 
			- R53 monitors health of site
			- If active fails then R53 routes traffic to passive site
			- Designate a primary and secondary endpoint for your hosted zone record
	5. Geo-location 
		- Choose where to route traffic based on geographic location of users
		- Different from Latency based as the routing is hardwired irrespective of latency
- ELBs cost money – ensure to delete them when not using
- ELBs always have DNS name. No public IP Addresses. Trick question might induce you into believing IP4 address for ELB
- Given a choice between Alias Record vs CNAME – always choose Alias. Alias records are free and can connect to AWS resources
- **R53 supports zone apex records (naked domains)**
- With Route 53, there is a default limit of 50 domain names. However, this limit can be increased by contacting AWS support
- Naked domain – which doesn’t have the www in front of the domain e.g. acloud.guru. [www.acloud.guru](http://www.acloud.guru)

## ![](/images/aws/sqs.png) SQS : [Simple Queue Service](https://aws.amazon.com/sqs)

### SQS Features
- SQS is fully managed message queuing service 
- SQS provides **Access to a Message Queue** to get processed by consumers
- SQS helps decouple the components of an application so they can run independently
- Consumer(s) continuously polls the Message Queue, looking for messages
- Messages can be retrieved via SQS API
- Message polling is used to retrieve SQS messages
	- SQS long poll will always return with a message, and wait untill the message is available on queue. Maximum timeout 20 secs
	- SQS short poll can return with or without a message, and won't wait untill the message is available on queue
- Messages can be kept in queue from 1 minute to 14 days (default is 4 days)
- Visibility timeout 
	- Visibility timeout period only starts when a worker node has picked up the message for processing. During this interval, the message is invisible to other processor workers
	- Message than get deleted from queue
	- Default visibility timeout setting of 30 seconds
	- Maximum timeout period is 12 hours
- The producer and consumer can run at their own independent throughput
- The queue acts as a buffer between consumer and producer
- Ensures delivery of messages at least once
- Ensure your application isn’t affected by processing the same message multiple times
- Allows multiple readers and writers. Single queue can be used simultaneously by various applications (Scale out applications)
- Queue types
	- Standard Queues (default)
		- Provide at-least-once delivery, which means that each message is delivered at least once
		- No guarantee of message ordering
		- Support a nearly unlimited number of transactions per second (TPS) per API action
	- FIFO Queues
		- Provide exactly-once processing, which means that each message is delivered once and remains available until a consumer processes it and deletes it
		- Duplicates are not introduced into the queue
		- Guarantee of message ordering (the order of arriving)
		- Limited to 300 transactions per second (TPS)
- SQS message size up to 256KB of text in any format. May consist of 1-10 messages
- If order is important, add sequencing information in each message
- SQS is pull based and not push based (Unlike SNS)
- You are billed at 64KB chunks (1 request)
- SQS Pricing
	- First 1 million SQS requests per month are free
	- $0.50 per 1 million SQS requests per month thereafter
	- 64KB chunk = 1 request. So a message of 256KB = 4 requests
- Each messages has a visibility timeout (12 hours by default)
- SQS can do auto-scaling. If queue grows beyond a threshold, instantiate new web/app servers. Use Auto scaling + SQS to achieve this

<p align="center"><img src="/images/aws/queue.png" width="500"></p>

## ![](/images/aws/sws.png) SWS : [Simple Workflow Service](https://aws.amazon.com/sws)

### SWS Features
- SWS is a web service that makes it easy to coordinate work across distributed application components
- Co-ordinate tasks & workflows
- Amazon uses SWS to process orders on its website
- No EC2 components involved
- It can also involve human actors
– When to use SQS or SWS


|Attribute|SQS|SWS|
|----|----|----|
|Retention |14 days|1 year|
|API|Message Oriented|Task Oriented|
|Assignment|Might be assigned multiple times|Only once|
|State|Write code to implement tracking|Keeps Track of State & Events|
	
- SWS actors (SDW)
	- WF Starters (**S**) : e-commerce application
	- WF Deciders (**D**) : Control flow of activity tasks
	- WF Activity Workers (**W**) : Carry out actual task

## ![](/images/aws/sns.png) SNS : [Simple Notification Service](https://aws.amazon.com/sns) 

### SNS Features
- Makes it easy to setup, operate and send notifications from the cloud
- Instant push based delivery. No Polling Required
- SNS consists of Topics and you can publish messages to topics
- You can send emails, text and other alerts. Apple Push, Android etc
- Publish messages to SQS queues, trigger Lambda functions. Lambda function can then manipulate information and then send to other SNS Topics
- SNS is push based messaging
- You can group multiple recipients using topics. Recipients can subscribe to topics to receive notifications
- Flexible message delivery over multiple protocols
- SNS is used in conjunction with CloudWatch and AutoScaling
- EC2 instances pull SQS messages from a standard SQS queue on a FIFO (First In First out) basis – False Statement
- **SNS Push & SQS Pulls**
- SNS pricing
	- Pay 0.5$ per 1 million SNS requests
	- Pay 0.6$ per 100000 notification deliveries over HTTP
	- Pay 0.75$ per 100 notification deliveries over SMS
	- Pay 2$ per 100000 notification deliveries over Email

##  ![](/images/aws/transcoder.png) [Elastic Transcoder](https://aws.amazon.com/elastictranscoder) 

### Elastic Transcoder Features
- Allows to convert media files from source to different media formats
- You pay the minutes you transcode and the resolution
- S3 → Lambda Function → Elastic Transcoder → S3
  
## ![](/images/aws/api.png) [API Gateway](https://aws.amazon.com/api-gateway)

### API Gateway Features
- Managed web service which enables developers to publish, monitor and secure APIs at any scale
- Create an API that acts as front door for applications to access data, business logic or any functionality from your backend services
- API Caching – Cache your endpoint’s responses. Reduces load on endpoints based on duration of TTLs
- Low cost & Efficient. Scales
- Throttle requests as required to prevent attacks
- Log requests to CloudWatch
- Same origin policy : under this policy, a web browser only allows, scripts on one page to access something from other we page, but from same domain
- CORS : Cross Origin Resource Sharing. For application built on top of multiple domains, you need to enable CORS on API Gateway
  
## ![](/images/aws/kinesis.png) [Kinesis](https://aws.amazon.com/kinesis) 

### Kinesis Features
- Streaming data is something which is generated by thousands of data sources – stock prices, game information, social network data, geo-spatial data, purchases from online stores, IoT sensor data
- Kinesis is an AWS platform to analyze streaming data
- Kinesis Streams
	- Stores data for 24 hours to 7 days
	- Data stored in **shards**
	- Maximum read rate of 2 MB per second
	- Maximum write rate of 1 MB per second
	- Data consumers (EC2 instances) analyze the stream and then derive results/take next actions
	- Data capacity of stream is a function of the number of shards you specify for the stream
	
<p align="center"><img src="/images/cloudguru/kinesis.png" width="700"></p>

- Kinesis Firehose 
  - Don’t have to worry about shards, streams, its completely automated
  - No automatic data retention window. Data is either immediately analyzed or sent to S3 and then to Redshift, elastic search cluster
  - Data is immediately analyzed via **Lambda**

<p align="center"><img src="/images/cloudguru/kinesis-firehose.png" width="700"></p>
  
- Kinesis Analytics
  - Run SQL type queries on top of data contained in Streams or Firehose and store the results in S3 / Redshift and Elastic Search cluster
  
<p align="center"><img src="/images/cloudguru/kinesis-analytics.png" width="700"></p>