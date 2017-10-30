package com.popularity.media.provider;

import java.util.List;

import com.popularity.media.feedback.MediaUserFeedBackMetrics;
import com.popularity.media.metadata.MediaMetadataMetrics;
import com.popularity.search.TwitterTextSearch;
import com.popularity.spi.MediaPopularity;
import com.popularity.user.metrcis.UserPopularityMetrics;

public class TwitterTextPopularity implements MediaPopularity {

	@Override
	public String getProviderName() {
	
		return "Text";
	}

	//text metadata metrics 
	@Override
	public MediaMetadataMetrics getmetadata(String id_media) {
		TwitterTextSearch tts= new TwitterTextSearch ();
		return tts.getTextMetadataById(id_media);
	}

	//text Feed back metrics
	@Override
	public MediaUserFeedBackMetrics getUserFeeBack(String id_media) {
		TwitterTextSearch tts= new TwitterTextSearch ();
		return tts.getTextFeedBackById(id_media);
	}
	
	//text author metrics
	@Override
	public UserPopularityMetrics getAuthorPopularity(String id_media) {
		System.out.println ("TwitterTextPopularity author popularity");
		TwitterTextSearch tts= new TwitterTextSearch ();
		return tts.getAuthorPopularity(id_media);
	}

	@Override
	public MediaMetadataMetrics defineMediaPopularityMetadataMetrics(List <Attribute>  metadata_Attributes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MediaUserFeedBackMetrics  defineMediaPopularityUserFeedBackMetrics(
			List <Attribute>  feedBack_Attributes) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
