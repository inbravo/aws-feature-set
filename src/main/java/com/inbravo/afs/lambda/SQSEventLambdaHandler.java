package com.inbravo.afs.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Region;

/**
 * 
 * @author amit.dixit
 *
 */
public class SQSEventLambdaHandler implements RequestHandler<S3Event, String> {

	/* Create S3 object */
	private AmazonS3 s3 = AmazonS3ClientBuilder.standard().build();

	public SQSEventLambdaHandler() {
	}

	/* Test purpose only */
	SQSEventLambdaHandler(final AmazonS3 s3) {
		this.s3 = s3;
	}

	@Override
	public final String handleRequest(final S3Event event, final Context context) {

		context.getLogger().log("---handleRequest, received S3 event: " + event);

		try {
			final Region region = s3.getRegion();
			final String regionName = s3.getRegionName();

			context.getLogger()
					.log("---handleRequest, region id: " + region.getFirstRegionId() + ", regionName: " + regionName);

			return regionName;
		} catch (final Exception e) {

			e.printStackTrace();
			context.getLogger().log("Error received: " + e);
			throw e;
		}
	}
}