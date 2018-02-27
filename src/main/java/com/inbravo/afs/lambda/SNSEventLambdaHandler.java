package com.inbravo.afs.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.GetTopicAttributesResult;

/**
 * 
 * @author amit.dixit
 *
 */
public class SNSEventLambdaHandler implements RequestHandler<SNSEvent, String> {

	/* Create AmazonSNS object */
	private AmazonSNS sns = AmazonSNSClientBuilder.standard().build();

	public SNSEventLambdaHandler() {
	}

	/* Test purpose only */
	SNSEventLambdaHandler(final AmazonSNS sns) {
		this.sns = sns;
	}

	@Override
	public final String handleRequest(final SNSEvent event, final Context context) {

		context.getLogger().log("---handleRequest, received SNS event: " + event);

		try {
			final GetTopicAttributesResult result = sns
					.getTopicAttributes("arn:aws:sns:us-east-1:418468189508:SNSInBravo");

			/* Iterate on attributes */
			result.getAttributes()
					.forEach((x, y) -> System.out.println("---handleRequest, Attribute name: " + x + ", value: " + y));

			return null;
		} catch (final Exception e) {

			e.printStackTrace();
			context.getLogger().log("Error received: " + e);
			throw e;
		}
	}
}