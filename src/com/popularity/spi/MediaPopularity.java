package com.popularity.spi;

import java.util.List;

import com.popularity.media.feedback.MediaUserFeedBackMetrics;
import com.popularity.media.metadata.MediaMetadataMetrics;
import com.popularity.media.provider.Attribute;
import com.popularity.user.metrcis.UserPopularityMetrics;

public interface MediaPopularity {
//For identifying the appropriate provider
	public String getProviderName();
	
	// service for encapsulate the metadata metrics of the media entity (i.e. Text, Photo and Video) correpond to the id_media
	public MediaMetadataMetrics getmetadata (String id_media);
	
	// service for encapsulate the feedback of users in front of the target media entity (i.e. Text, Photo and Video) correpond to the id_media
	public MediaUserFeedBackMetrics getUserFeeBack (String id_media);
	
	// service for encapsulate the metrics of the author of the media entity (i.e. Text, Photo and Video) correpond to the id_media
	public UserPopularityMetrics getAuthorPopularity (String id_media);
	
	//service to  add media popularity metadata 
	//provide extensibility
	public MediaMetadataMetrics defineMediaPopularityMetadataMetrics (List <Attribute> metadata_Attributes);
	
	
	//service to  add the media is user popularity metadata 
	//provide extensibility
	public MediaUserFeedBackMetrics  defineMediaPopularityUserFeedBackMetrics (List <Attribute>  feedBack_Attributes);
}
