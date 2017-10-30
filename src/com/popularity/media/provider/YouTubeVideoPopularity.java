package com.popularity.media.provider;

import java.util.List;

import com.popularity.media.feedback.MediaUserFeedBackMetrics;
import com.popularity.media.metadata.MediaMetadataMetrics;
import com.popularity.search.YouTubeVideoSearch;
import com.popularity.spi.MediaPopularity;
import com.popularity.user.metrcis.UserPopularityMetrics;

public class YouTubeVideoPopularity implements MediaPopularity{
	
	@Override
	public String getProviderName() {
	
		return "Video";
	}

	//video metadata metrics
	@Override
	public MediaMetadataMetrics getmetadata(String id_media) {
		System.out.println ("search video popularity metadata");
		 YouTubeVideoSearch video = new YouTubeVideoSearch ();
		return video.getVideoMetadataById(id_media);
	}

	//video feedback metrics
	@Override
	public MediaUserFeedBackMetrics getUserFeeBack(String id_media) {
		System.out.println ("search video popularity feedback");
		 YouTubeVideoSearch video = new YouTubeVideoSearch ();
		return video.getVideoFeedBackById(id_media);
	}

	@Override
	public UserPopularityMetrics getAuthorPopularity(String id_media) {
	
		return null;
	}


	@Override
	public MediaMetadataMetrics defineMediaPopularityMetadataMetrics(List <Attribute>  metadata_Attributes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MediaUserFeedBackMetrics defineMediaPopularityUserFeedBackMetrics(
			List <Attribute> feedBack_Attributes) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
